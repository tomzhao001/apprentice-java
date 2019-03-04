package visitor;

public class Main {

    public static void main(String[] args) {
        // Visit Context Integer
        IContext context = new ContextInteger(3423, 454);
        IVisitor visitor = new VisitorAdd();
        System.out.println(visitor.execute(context));

        context = new ContextInteger(3423, 454);
        visitor = new VisitorMinus();
        System.out.println(visitor.execute(context));

        // Visit Context String
        context = new ContextString("abcdefg", "hijk");
        visitor = new VisitorAdd();
        System.out.println(visitor.execute(context));

        context = new ContextString("abcdefg", "hijk");
        visitor = new VisitorMinus();
        System.out.println(visitor.execute(context));

    }

}
