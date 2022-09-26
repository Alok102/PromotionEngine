package com.alok.promotion;

import java.util.HashMap;
import java.util.Map;

public class Promotions {

    public Promotions(int promotionId, PromotedItem promotedItem, double promoPrice) {
        PromotionId = promotionId;
        this.promotedItem = promotedItem;
        PromoPrice = promoPrice;
    }

    public int getPromotionId() {
        return PromotionId;
    }

    public PromotedItem getPromotedItem() {
        return promotedItem;
    }

    public double getPromoPrice() {
        return PromoPrice;
    }

    public int PromotionId;
    public PromotedItem promotedItem;
    public double PromoPrice;
}
