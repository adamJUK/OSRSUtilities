package app.loadout;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/loadout")
public class LoadoutController {

    private final LoadoutRepository repository;

    public LoadoutController(LoadoutRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Loadout> all() {
        return repository.findAll();
    }
}
