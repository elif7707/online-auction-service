package com.elifzeynep.auction.model;

public class Painting {
    // Data
    private Price price;
    private Bid highestBid;
    private String name;
    private String artist;

    // Constructor
    public Painting(Price price, String name, String artist) {
        this.price = price;
        this.name = name;
        this.artist = artist;
        Price initialPrice = new Price(0, "ELC");
        this.highestBid = new Bid("Elif Şentürk", initialPrice);
    }

    // Methods
    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Bid getHighestBid() {
        return highestBid;
    }

    private void setHighestBid(Bid highestBid) {
        this.highestBid = highestBid;
    }

    public void offerBid(Bid offer) {
        if (highestBid.getPrice().getValue() < offer.getPrice().getValue()) {
            setHighestBid(offer);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
