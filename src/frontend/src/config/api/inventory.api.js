import Inventory from "@/models/inventory";

export async function deserializeInventory(json) {
    return new Inventory({
        id: json.id,
        slotNum: json.slotNum,
        itemId: json.itemId,
    });
}