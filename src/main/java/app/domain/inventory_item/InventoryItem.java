package app.domain.inventory_item;

import javax.persistence.*;

@Entity
@Table(name = "inventory_items")
@IdClass(InventoryItemId.class)
public class InventoryItem {

    @Id
    @Column
    private int id;

    @Id
    @Column
    private int slotNum;

    @Column
    private int itemId;

    public InventoryItem() {

    }

    public int getId() {
        return id;
    }

    public int getSlotNum() {
        return slotNum;
    }

    public int getItemId() {
        return itemId;
    }

}
