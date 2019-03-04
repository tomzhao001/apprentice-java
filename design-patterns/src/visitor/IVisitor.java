package visitor;

public interface IVisitor {

    Object execute(IContext context);

    int visitContextInteger(int num1, int num2);

    String visitContextString(String str1, String str2);

}
