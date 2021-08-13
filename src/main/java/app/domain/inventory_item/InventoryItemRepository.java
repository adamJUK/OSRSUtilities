package app.domain.inventory_item;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventoryItemRepository extends JpaRepository<InventoryItem, Integer> {

    List<InventoryItem> findAllById(int id);

    void deleteAllById(int id);
}
