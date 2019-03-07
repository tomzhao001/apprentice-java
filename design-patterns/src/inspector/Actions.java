package inspector;

public class Actions implements IActions {

    public Object doActions() throws Exception {
        System.out.println("Do some actions...");
        //throw new Exception("Action In Error");
        return "Action Body";
    }
}
