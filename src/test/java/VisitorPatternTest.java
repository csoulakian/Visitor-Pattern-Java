import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Chrissy Soulakian
 * VisitorPattern Project
 * Created on 4/25/2016
 */
public class VisitorPatternTest {
    ShoppingCartVisitor visitor = null;

    @Before
    public void setUp() throws Exception {
        visitor = new ShoppingCartVisitorImpl();
    }

    @After
    public void tearDown() throws Exception {
        visitor = null;
    }

    @Test
    public void testBookToVisitor() {
        Book book = new Book("To Kill a Mockingbird", 10.99);
        double cost = book.accept(visitor);
        //free $5 off coupon in weekly ad
        assertEquals(book.getPrice() - 5, cost, 0.01);
    }

    @Test
    public void testFruitToVisitor() {
        Fruit orange = new Fruit("Orange", 0.59, 1.56);
        double visitorCost = orange.accept(visitor);
        double fruitCost = orange.getPricePerlb() * orange.getWeight();
        assertEquals(fruitCost, visitorCost, 0.01);
    }

    @Test
    public void testBookFruitToVisitor() {
        Item[] items = new Item[]{new Book("To Kill a Mockingbird", 10.99),
                new Fruit("Orange", 0.59, 1.56)};
        double visitorTotal = 0;
        for(Item item : items) {
            visitorTotal += item.accept(visitor);
        }
        double bookCost = ((Book) items[0]).getPrice() - 5;
        double fruitCost = ((Fruit) items[1]).getPricePerlb() * ((Fruit) items[1]).getWeight();
        assertEquals(fruitCost + bookCost, visitorTotal, 0.01);

    }
}
