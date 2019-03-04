package visitor;

public interface IContext {

    Object acceptVisitor(IVisitor visitor);

}
