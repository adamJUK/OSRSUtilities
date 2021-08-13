package app.domain.inventory_item;

import app.domain.loadout.Loadout;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InventoryItemService {

    private final InventoryItemRepository inventoryItemRepository;

    public InventoryItemService(InventoryItemRepository inventoryItemRepository) {
        this.inventoryItemRepository = inventoryItemRepository;
    }

    public List<InventoryItem> getByLoadout(Loadout loadout) {
        return inventoryItemRepository.findAllById(loadout.getId());
    }

    @Transactional
    public void deleteAllByLoadout(Loadout loadout) {
        inventoryItemRepository.deleteAllById(loadout.getId());
    }

    @Transactional
    public InventoryItem save(InventoryItem inventoryItem) {
        return inventoryItemRepository.save(inventoryItem);
    }
}
