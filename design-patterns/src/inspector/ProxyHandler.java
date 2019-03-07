package inspector;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ProxyHandler {

    private Object target;
    private Method method;
    private Object[] args;

    public ProxyHandler(Object target, Method method, Object[] args) {
        this.target = target;
        this.method = method;
        this.args = args;
    }

    public Object process() throws InvocationTargetException, IllegalAccessException {
        return method.invoke(target, args);
    }
}
