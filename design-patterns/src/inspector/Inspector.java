package inspector;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;

public class Inspector {

    public void beforeMethod() {
        System.out.println("Invoking beforeMethod()");
    }

    public void afterMethod() {
        System.out.println("Invoking afterMethod()");
    }

    public void afterThrowing() {
        System.out.println("Invoking afterThrowing()");
    }

    public void afterReturning() {
        System.out.println("Invoking afterReturning()");
    }

    public Object aroundMethod(ProxyHandler handler) {
        Object results = null;
        System.out.println("Invoking aroundMethod() - beforeMethod");
        try {
            results = handler.process();
        } catch (Exception e) {
            System.out.println("Invoking aroundMethod() - afterThrowing");
            e.printStackTrace();
        } finally {
            System.out.println("Invoking aroundMethod() - afterMethod");
        }
        System.out.println("Invoking aroundMethod() - afterReturning");
        return results;
    }

}
