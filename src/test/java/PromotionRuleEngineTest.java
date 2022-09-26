import com.alok.cart.Cart;
import com.alok.promotion.PromotionRuleEngine;
import com.alok.storage.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PromotionRuleEngineTest {
    @Test
    public void RuleExecutionTest1(){
        Cart cart1 = new Cart();
        cart1.addItem(new Item("A",50));
        cart1.addItem(new Item("B",30));
        cart1.addItem(new Item("C",20));
        cart1.addItem(new Item("D",15));
        double price = PromotionRuleEngine.executeRule(cart1);
        assertEquals(110, price);
    }
    @Test
    public void RuleExecutionTest2(){
        Cart cart1 = new Cart();
        cart1.addItem(new Item("A",50));
        cart1.addItem(new Item("A",50));
        cart1.addItem(new Item("A",50));
        cart1.addItem(new Item("A",50));
        cart1.addItem(new Item("A",50));
        cart1.addItem(new Item("B",30));
        cart1.addItem(new Item("B",30));
        cart1.addItem(new Item("B",30));
        cart1.addItem(new Item("B",30));
        cart1.addItem(new Item("B",30));
        cart1.addItem(new Item("C",20));
        //cart1.addItem(new Item("D",15));
        double price = PromotionRuleEngine.executeRule(cart1);
        assertEquals(370, price);
    }
    @Test
    public void RuleExecutionTest3(){
        Cart cart1 = new Cart();
        cart1.addItem(new Item("A",50));
        cart1.addItem(new Item("A",50));
        cart1.addItem(new Item("A",50));
        cart1.addItem(new Item("B",30));
        cart1.addItem(new Item("B",30));
        cart1.addItem(new Item("B",30));
        cart1.addItem(new Item("B",30));
        cart1.addItem(new Item("B",30));
        cart1.addItem(new Item("C",20));
        cart1.addItem(new Item("D",15));
        double price = PromotionRuleEngine.executeRule(cart1);
        assertEquals(280, price);
    }
}
