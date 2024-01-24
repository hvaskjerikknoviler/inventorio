package struts.inventorio.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.boot.context.properties.bind.DefaultValue;

@Entity
@Table(name = "wine")
public class Wine{
    @Id
    @Column(name = "wineID")
    private int wineID;
    @Column(name = "name")
    private String name;
    @Column(name = "volume")
    private float volume;
    @Column(name = "quantity")
    private float quantity;
    @Column(name = "price")
    private float price;



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
