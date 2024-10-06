package com.elifzeynep.auction;

import com.elifzeynep.auction.model.Painting;
import com.elifzeynep.auction.model.Price;

public class DemoApplication{
    public static void main(String[] args){
        Price paintingPrice = new Price(1000, "ELC");
        Painting youAreMine = new Painting(paintingPrice, "You Are Mine", "Muratcan Senturk");

        System.out.println(youAreMine.getName()); // You Are Mine
        youAreMine.setName("Eflatun");
        System.out.println(youAreMine.getName()); // Eflatun
        System.out.println(youAreMine.getPrice().getCurrency()); // ELC

        // Bidding
        Price newBid = new Price(10000, "ELC");
        youAreMine.offerPrice(newBid);
        System.out.println(youAreMine.getHighestBid().getValue()); // 10000

        newBid = new Price(6500, "ELC");
        youAreMine.offerPrice(newBid);
        System.out.println(youAreMine.getHighestBid().getValue()); //  10000

    }
}

