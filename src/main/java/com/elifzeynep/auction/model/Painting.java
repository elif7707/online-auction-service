package com.elifzeynep.auction.model;

public class Painting {
    // Data
    private Price price;
    private Price highestBid;
    private String name;
    private String artist;

    // Constructor
    public Painting(Price price, String name, String artist) {
        this.price = price;
        this.name = name;
        this.artist = artist;
        this.highestBid = new Price(0, "ELC"); // 0 ELC
    }

    // Methods
    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Price getHighestBid() {
        return highestBid;
    }

    private void setHighestBid(Price highestBid) {
        this.highestBid = highestBid;
    }

    public void offerPrice(Price bid) {
        if (highestBid.getValue() < bid.getValue()) {
            setHighestBid(bid);
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
