package inspector;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHandler {

    private Object _target;

    public ProxyHandler(Object target) {
        _target = target;
    }

    public IActions getProxy() {
        ClassLoader classLoader = _target.getClass().getClassLoader();
        Class[] interfaces = _target.getClass().getInterfaces();
        Inspector inspector = new Inspector();
        return (IActions) Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) {
                Object results = null;
                inspector.beforeMethod();
                try {
                    results = method.invoke(_target, args);
                } catch (Exception e) {
                    inspector.afterThrowing();
                    e.printStackTrace();
                } finally {
                    inspector.afterMethod();
                }
                inspector.afterReturning();
                return results;
            }
        });
    }

}
