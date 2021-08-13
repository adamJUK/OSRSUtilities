CREATE TABLE loadout
(
    id           INTEGER PRIMARY KEY,
    loadout_name VARCHAR(50) NOT NULL,
    account_id   INTEGER,
    equipment_id INTEGER,
    inventory_id INTEGER

);