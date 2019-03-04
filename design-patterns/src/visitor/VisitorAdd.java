package visitor;

public class VisitorAdd implements IVisitor {


    @Override
    public Object execute(IContext context) {
        return context.acceptVisitor(this);
    }

    @Override
    public int visitContextInteger(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public String visitContextString(String str1, String str2) {
        return str1.concat(str2);
    }
}
