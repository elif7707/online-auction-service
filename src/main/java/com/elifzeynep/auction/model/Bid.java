package com.elifzeynep.auction.model;

public class Bid{

   private String bidder;
   private Price price;

  public Bid(String bidder, Price price){

      this.bidder = bidder;
      this.price = price;
  }

    public String getBidder(){ return bidder; }
    public Price getPrice(){ return price; }

}