package struts.inventorio.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "wine")
public class Wine implements Beverages{
    @Id
    @Column(name = "wineID")
    private int wineID;


}
