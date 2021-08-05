package app.inventoryitems;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class InventoryItemController {

    private final InventoryItemRepository repository;

    public InventoryItemController(InventoryItemRepository repository) {
        this.repository = repository;
    }

    @GetMapping()
    public List<InventoryItem> all() {
        return repository.findAll();
    }
}
