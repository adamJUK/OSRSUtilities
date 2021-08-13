package app.domain.equipment;

import java.io.Serializable;
import java.util.Objects;

public class EquipmentId implements Serializable {

    private int id;

    private int slotNum;

    public EquipmentId() {

    }

    public EquipmentId(int id, int slotNum) {
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
        if (!(o instanceof EquipmentId)) return false;
        EquipmentId that = (EquipmentId) o;
        return getId() == that.getId() && getSlotNum() == that.getSlotNum();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSlotNum());
    }
}
