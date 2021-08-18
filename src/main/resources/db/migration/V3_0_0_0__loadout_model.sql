CREATE TABLE loadout
(
    id           INTEGER PRIMARY KEY,
    loadout_name VARCHAR(50) NOT NULL,
    account_id   VARCHAR(50),
    equipment_id INTEGER,
    inventory_id INTEGER

);