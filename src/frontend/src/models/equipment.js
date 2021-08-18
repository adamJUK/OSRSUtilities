import { hasPropertyOrDefault } from "@/utils/hasPropertyOrDefault";

export default class Equipment {
    constructor(config) {
        this._id = hasPropertyOrDefault(config, "id", "");
        this._slotNum = hasPropertyOrDefault(config, "slotNum", "");
        this._itemId = hasPropertyOrDefault(config, "itemId", "");
    }


    get id() {
        return this._id;
    }

    get slotNum() {
        return this._slotNum;
    }

    get itemId() {
        return this._itemId;
    }
}