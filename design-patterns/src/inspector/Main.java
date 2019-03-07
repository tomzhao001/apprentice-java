package inspector;

public class Main {

    public static void main(String[] args) throws Exception {
        IActions target = new Actions();
        Object results = new ActionsProxy(target).isUseAround(false).getProxy().doActions();
        System.out.println("Results = " + results);

        System.out.println("================================");

        results = new ActionsProxy(target).isUseAround(true).getProxy().doActions();
        System.out.println("Results = " + results);
    }

}
