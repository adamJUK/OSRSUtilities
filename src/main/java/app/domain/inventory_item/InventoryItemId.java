package app.domain.inventory_item;

import java.io.Serializable;
import java.util.Objects;

public class InventoryItemId implements Serializable {

    private int id;

    private int slotNum;

    public InventoryItemId() {

    }

    public InventoryItemId(int id, int slotNum) {
        this.id = id;
        this.slotNum = slotNum;
    }

    public int getId() {
        return id;
    }

    public int getSlotNum() {
        return slotNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InventoryItemId)) return false;
        InventoryItemId that = (InventoryItemId) o;
        return getId() == that.getId() && getSlotNum() == that.getSlotNum();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSlotNum());
    }
}
