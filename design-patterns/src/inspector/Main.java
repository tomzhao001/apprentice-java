package inspector;

public class Main {

    public static void main(String[] args) throws Exception {
        IActions target = new Actions();
        Object results = new ProxyHandler(target).getProxy().doActions();

        System.out.println("Results = " + results);
    }

}
