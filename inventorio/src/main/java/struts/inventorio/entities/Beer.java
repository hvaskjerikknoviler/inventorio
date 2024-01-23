package struts.inventorio.entities;

import jakarta.persistence.*;
import org.springframework.context.annotation.Primary;

@Entity
@Table(name = "beer")
public class Beer implements Beverages{
    @Id
    @Column(name = "beerID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int beerID;
    @Column(name = "name")
    private String name;
    @Column(name = "volume")
    private float volume;
    @Column(name = "quantity")
    private float quantity;
    @Column(name = "keg")
    private boolean keg;
    @Column(name = "price")
    private float price;

    @Override
    public void setID(int id) {
        this.beerID = id;
    }

    @Override
    public int getID() {
        return this.beerID;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
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
