package visitor;

public class VisitorMinus implements IVisitor {

    /**
     * Get the context object,
     *  in order to send the visitor object back to the context.
     *
     * Then, the programme would be able to know
     *  which visitor is in use to invoke the "visitxxxxxx" methods.
     * @param context
     * @return
     */
    @Override
    public Object execute(IContext context) {
        return context.acceptVisitor(this);
    }

    public int visitContextInteger(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public String visitContextString(String str1, String str2) {
        return str1.substring(0, str1.length() - str2.length() - 1);
    }

}
