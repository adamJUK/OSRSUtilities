package app.domain.equipment;

import javax.persistence.*;

@Entity
@Table(name = "equipment")
@IdClass(EquipmentId.class)
public class Equipment {

    @Id
    @Column
    private int id;

    @Id
    @Column
    private int slotNum;

    @Column
    private int itemId;

    public Equipment() {

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
