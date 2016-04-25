/**
 * Chrissy Soulakian
 * VisitorPattern Project
 * Created on 4/25/2016
 */
public class VisitorPattern {

    public static void main(String[] args) {
        System.out.println("\n************** Receipt **************\n");
        Item[] items = new Item[]{new Book("To Kill a Mockingbird", 10.99),
                new Book("The Solar System", 12.99),
                new Fruit("Orange", 0.59, 1.56),
                new Fruit("Green Pepper", 0.89, 2.00)};
        double total = calculateTotalPrice(items);
        total = Math.round(total*100.0)/100.0;
        System.out.println("-------------------------------------");
        System.out.println("Total Cost = $" + total);
    }

    private static double calculateTotalPrice(Item[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        double total = 0;
        for(Item item : items) {
            total += item.accept(visitor);
        }
        return total;
    }
}
