package visitor;

public class ContextInteger implements IContext {

    private int num1;
    private int num2;

    public ContextInteger(int pNum1, int pNum2) {
        num1 = pNum1;
        num2 = pNum2;
    }

    /**
     * Get the visitor object,
     *  in order to invoke the "visitxxxxxx" methods directly.
     *
     * Since the visitor object we got is already a specified visitor,
     *  the "visitxxxxxx" method has already been under the right visitor.
     *
     * @param visitor
     * @return
     */
    @Override
    public Object acceptVisitor(IVisitor visitor) {
        return visitor.visitContextInteger(num1, num2);
    }
}
