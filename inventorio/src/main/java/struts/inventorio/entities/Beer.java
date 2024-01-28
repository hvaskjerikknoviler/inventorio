package struts.inventorio.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "beer")
public class Beer{
    @Id
    @Column(name = "beerID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int beerID;
    @Column(name = "name")
    private String name;
    @Column(name = "brewery")
    public String brewery;
    @Column(name = "alc_vol")
    public float alc_vol;
    @Column(name = "volume")
    private float volume;
    @Column(name = "quantity")
    private float quantity;
    @Column(name = "keg")
    private boolean keg;
    @Column(name = "price")
    private float price;

    public int getBeerID() {
        return beerID;
    }

    public void setBeerID(int beerID) {
        this.beerID = beerID;
    }

    public String getBrewery() {
        return brewery;
    }

    public void setBrewery(String brewery) {
        this.brewery = brewery;
    }

    public float getAlc_vol() {
        return alc_vol;
    }

    public void setAlc_vol(float alc_vol) {
        this.alc_vol = alc_vol;
    }

    public void setID(int id) {
        this.beerID = id;
    }


    public int getID() {
        return this.beerID;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public boolean isKeg() {
        return keg;
    }

    public void setKeg(boolean keg) {
        this.keg = keg;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
