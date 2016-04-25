/**
 * Chrissy Soulakian
 * VisitorPattern Project
 * Created on 4/25/2016
 */
public interface ShoppingCartVisitor {
    double visit(Book book);
    double visit(Fruit fruit);
}
