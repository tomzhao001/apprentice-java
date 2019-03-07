package inspector;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ActionsProxy {

    private Object _target;
    private boolean _useAround = false;

    public ActionsProxy(Object target) {
        _target = target;
    }

    public ActionsProxy isUseAround(boolean useAround) {
        _useAround = useAround;
        return this;
    }

    public IActions getProxy() {
        ClassLoader classLoader = _target.getClass().getClassLoader();
        Class[] interfaces = _target.getClass().getInterfaces();
        Inspector inspector = new Inspector();
        return (IActions) Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) {
                Object results = null;
                ProxyHandler handler = new ProxyHandler(_target, method, args);
                if (_useAround) {
                    results = inspector.aroundMethod(handler);
                } else {
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
                }
                return results;
            }
        });
    }

}
