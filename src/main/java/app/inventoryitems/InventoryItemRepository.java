package app.inventoryitems;

import org.springframework.data.jpa.repository.JpaRepository;

interface InventoryItemRepository extends JpaRepository<InventoryItem, Integer> {
}
