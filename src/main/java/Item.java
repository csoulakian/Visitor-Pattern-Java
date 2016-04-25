/**
 * Chrissy Soulakian
 * VisitorPattern Project
 * Created on 4/25/2016
 */
public interface Item {
    public double accept(ShoppingCartVisitor visitor);
}
