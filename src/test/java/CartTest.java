import com.alok.cart.Cart;
import com.alok.storage.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTest {
    @Test
    public void cartAddItemTest(){
        Cart cart1 = new Cart();
        cart1.addItem(new Item("A",50));
        cart1.addItem(new Item("B",30));
        cart1.addItem(new Item("C",20));
        cart1.addItem(new Item("D",15));
        assertEquals(4,cart1.getItemList().size());
    }
    @Test
    public void cartRemoveItemTest(){
        Cart cart1 = new Cart();
        cart1.addItem(new Item("A",50));
        cart1.addItem(new Item("B",30));
        cart1.addItem(new Item("C",20));
        cart1.addItem(new Item("D",15));
        assertEquals(4,cart1.getItemList().size());
        cart1.removeItem(new Item("D",15));
        assertEquals(3,cart1.getItemList().size());
    }
}
