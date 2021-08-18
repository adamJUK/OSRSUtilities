import Equipment from "@/models/equipment";

export async function deserializeEquipment(json) {
    return new Equipment({
        id: json.id,
        slotNum: json.slotNum,
        itemId: json.itemId,
    });
}