package app.domain.loadout;

import app.domain.equipment.EquipmentService;
import app.domain.inventory_item.InventoryItemService;
import app.exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Collectors;

@Service
public class LoadoutService {

    private final LoadoutRepository loadoutRepository;
    private final EquipmentService equipmentService;
    private final InventoryItemService inventoryItemService;

    @Autowired
    public LoadoutService(LoadoutRepository loadoutRepository, EquipmentService equipmentService, InventoryItemService inventoryItemService) {
        this.loadoutRepository = loadoutRepository;
        this.equipmentService = equipmentService;
        this.inventoryItemService = inventoryItemService;
    }

    public Loadout getLoadoutById(int id) {
        var loadout = loadoutRepository
                .findById(id)
                .orElseThrow(() -> EntityNotFoundException.Of(Loadout.class, id));

        loadout.setInventory(inventoryItemService.getByLoadout(loadout));
        loadout.setEquipment(equipmentService.getByLoadout(loadout));
        return loadout;
    }

    @Transactional
    public Loadout update(Loadout loadout) {
        var oldLoadout = getLoadoutById(loadout.getId());

        loadout.setAccountId(oldLoadout.getAccountId());
        equipmentService.deleteAllByLoadout(loadout);
        inventoryItemService.deleteAllByLoadout(loadout);

        loadout.setEquipment(loadout.getEquipment().stream()
                .map(equipmentService::save)
                .collect(Collectors.toList())
        );

        loadout.setInventory(loadout.getInventory().stream()
                .map(inventoryItemService::save)
                .collect(Collectors.toList())
        );

        return loadoutRepository.save(loadout);
    }

}
