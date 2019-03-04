package visitor;

public class ContextString implements IContext {

    private String str1;
    private String str2;

    public ContextString(String pStr1, String pStr2) {
        str1 = pStr1;
        str2 = pStr2;
    }


    @Override
    public Object acceptVisitor(IVisitor visitor) {
        return visitor.visitContextString(str1, str2);
    }
}
