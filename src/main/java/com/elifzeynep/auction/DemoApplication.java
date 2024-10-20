package com.elifzeynep.auction;

import com.elifzeynep.auction.model.Bid;
import com.elifzeynep.auction.model.Painting;
import com.elifzeynep.auction.model.Price;

public class DemoApplication{
    public static void main(String[] args){
        Price paintingPrice = new Price(1000, "ELC");
        Painting youAreMine = new Painting(paintingPrice, "Ocean", "Elf");

        System.out.println(youAreMine.getName()); // You Are Mine
        youAreMine.setName("Eflatun");
        System.out.println(youAreMine.getName()); // Eflatun
        System.out.println(youAreMine.getPrice().getCurrency()); // ELC

        // Bidding
        Price newPrice = new Price(10000, "ELC");
        Bid newBid = new Bid("Elf", newPrice);
        youAreMine.offerBid(newBid);
        System.out.println(youAreMine.getHighestBid().getPrice().getValue()); // 10000

        newPrice = new Price(6500, "ELC");
        Bid b = new Bid("elif", newPrice);
        youAreMine.offerBid(b);
        System.out.println(youAreMine.getHighestBid().getPrice().getValue()); //  10000

    }
}

