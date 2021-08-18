import { hasPropertyOrDefault } from "@/utils/hasPropertyOrDefault";

export default class Loadout {
    constructor(config) {
        this._accountId = hasPropertyOrDefault(config, "accountId", "");
        this._equipment = hasPropertyOrDefault(config, "equipment", {});
        this._id = hasPropertyOrDefault(config, "id", "");
        this._inventory = hasPropertyOrDefault(config, "inventory", {});
        this._loadoutName = hasPropertyOrDefault(config, "loadoutName", "");
    }


    get id() {
        return this._id;
    }

    get loadoutName() {
        return this._loadoutName;
    }

    get accountId() {
        return this._accountId;
    }

    get equipment() {
        return this._equipment;
    }

    get inventory() {
        return this._inventory;
    }
}