package app.domain.loadout;

import app.domain.equipment.Equipment;
import app.domain.inventory_item.InventoryItem;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "loadout")
public class Loadout {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //TODO LOADOUT BELONGS TO ONE ACCOUNT DO THAT BIT HERE

    @Column
    @NotBlank
    private String loadoutName;

    @Column
    @JsonIgnore
    private String accountId;

    @Transient
    private List<Equipment> equipment;

   @Transient
    private List<InventoryItem> inventory;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public int getId() {
        return id;
    }

    public String getLoadoutName() {
        return loadoutName;
    }

    public void setLoadoutName(String loadoutName) {
        this.loadoutName = loadoutName;
    }

    public List<Equipment> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<Equipment> equipment) {
        this.equipment = equipment;
    }

    public List<InventoryItem> getInventory() {
        return inventory;
    }

    public void setInventory(List<InventoryItem> inventory) {
        this.inventory = inventory;
    }
}
