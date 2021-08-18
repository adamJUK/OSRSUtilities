import httpClient from "@/config/api/http-client";
import { deserializeEquipment } from "@/config/api/equipment.api"
import { deserializeInventory } from "@/config/api/inventory.api";
import Loadout from "@/models/loadout";

async function deserializeLoadout(json) {
    return new Loadout({
        id: json.id,
        loadoutName: json.loadoutName,
        accountId: json.accountId,
        equipment: await Promise.all(json.equipment.map((equipment) => deserializeEquipment(equipment))),
        inventory: await Promise.all(json.inventory.map((inventory) => deserializeInventory(inventory))),
    });
}

async function serializeLoadout(loadout) {
    return {
        id: loadout.id,
        loadoutName: loadout.loadoutName,
        accountId: loadout.accountId,
        equipment: loadout.equipment,
        inventory: loadout.inventory
    }
}

export async function getLoadouts() {
        const response = await httpClient.get("loadout/", { withCredentials:true });
        return Promise.all(response.data.map((loadout) => deserializeLoadout(loadout)));
}

export async function createLoadout(config) {
    await httpClient.post("create", [serializeLoadout(config.loadout)])
}