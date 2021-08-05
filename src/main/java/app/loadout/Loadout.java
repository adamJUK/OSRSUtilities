package app.loadout;

import app.equipment.Equipment;
import app.inventoryitems.InventoryItem;

import javax.persistence.*;
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
    private String loadoutName;

    @Column
    private int accountId;

    @OneToMany
    @JoinColumn(name = "id")
    private List<Equipment> equipment;

    @OneToMany
    @JoinColumn(name = "id")
    private List<InventoryItem> inventory;

    public int getAccountId() {
        return accountId;
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
