package struts.inventorio.entities;

import jakarta.persistence.*;
import org.springframework.boot.context.properties.bind.DefaultValue;

@Entity
@Table(name = "wine")
public class Wine{
    @Id
    @Column(name = "wineID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int wineID;
    @Column(name = "name")
    private String name;
    @Column(name = "volume")
    private float volume;
    @Column(name = "quantity")
    private float quantity;
    @Column(name = "price")
    private float price;
    @Column(name = "country")
    private String country;
    @Column(name = "alc_vol")
    private float alc_vol;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getAlc_vol() {
        return alc_vol;
    }

    public void setAlc_vol(float alc_vol) {
        this.alc_vol = alc_vol;
    }

    public void setID(int id) {
        this.wineID = id;
    }


    public int getID() {
        return this.wineID;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    public int getWineID() {
        return wineID;
    }

    public void setWineID(int wineID) {
        this.wineID = wineID;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
