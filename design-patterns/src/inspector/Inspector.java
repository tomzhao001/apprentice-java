package inspector;

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

}
