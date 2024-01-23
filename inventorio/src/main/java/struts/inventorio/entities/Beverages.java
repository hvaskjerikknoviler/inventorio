package struts.inventorio.entities;

import jakarta.persistence.Id;

public interface Beverages {
    public void setID(int id);
    public int getID();
    public void setName(String name);
    public String getName();
    public float getPrice();
    public void setPrice(float price);

}
