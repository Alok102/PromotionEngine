package com.alok.promotion;

import com.alok.cart.Cart;
import com.alok.storage.Item;

public class PromotionRuleEngine {
    public static double executeRule(Cart cart){
        int aCount = 0;
        int aPrice = 50;
        int bCount = 0;
        int bPrice = 30;
        int cCount = 0;
        int cPrice = 20;
        int dCount = 0;
        int dPrice = 15;

        for (Item item: cart.getItemList()) {
            {
                switch (item.getId())
                {
                    case "A":
                        aCount += 1;
                        break;
                    case "B":
                        bCount += 1;
                        break;
                    case "C":
                        cCount += 1;
                        break;
                    case "D":
                        dCount += 1;
                        break;
                }
            }
        }

        int totalPriceOfA = (aCount / 3) * 130 + (aCount % 3 * aPrice);
        int totalPriceOfB = (bCount / 2) * 45 + (bCount % 2 * bPrice);
        int totalPriceForCD = Math.min(cCount,dCount)*30;
        int min = Math.min(cCount,dCount);
        cCount = cCount-min;
        dCount = dCount-min;
        int totalPriceOfC = (cCount * cPrice);
        int totalPriceOfD = (dCount * dPrice);
        return totalPriceOfA + totalPriceOfB + totalPriceOfC + totalPriceOfD+totalPriceForCD;
    }
}
