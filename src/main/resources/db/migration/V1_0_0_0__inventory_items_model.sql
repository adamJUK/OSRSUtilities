CREATE TABLE inventory_items
(
    id       INTEGER,
    slot_num INTEGER NOT NULL CHECK (slot_num <= 27 AND slot_num >= 0),
    item_id  INTEGER NOT NULL,

    PRIMARY KEY (id, slot_num)

);