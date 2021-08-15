package app.domain.loadout;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/loadout/")
public class LoadoutController {

    private final LoadoutService loadoutService;

    public LoadoutController(LoadoutService loadoutService) {
        this.loadoutService = loadoutService;
    }

    @GetMapping("/{id}")
    public Loadout getLoadoutById(@PathVariable int id) {
        //TODO: VALID ACCOUNT IS LOGGED IN AND OWNS/HAS PERMS LOADOUT.
        return loadoutService.getById(id);
    }

    @GetMapping("/account/{accountId}")
    public List<Loadout> getLoadoutsByAccountId(@PathVariable int accountId) {
        return loadoutService.getByAccountId(accountId);
    }

    @PutMapping("/update")
    public Loadout updateLoadout(@RequestBody @Valid Loadout loadout) {
        //TODO: VALID ACCOUNT IS LOGGED IN AND OWNS/HAS PERMS LOADOUT.
        return loadoutService.update(loadout);
    }

    @PutMapping("/create")
    public Loadout create(@RequestBody @Valid Loadout loadout) {
        return loadoutService.create(loadout);
    }
}
