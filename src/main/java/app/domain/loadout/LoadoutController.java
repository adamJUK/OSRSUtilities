package app.domain.loadout;

import org.keycloak.representations.IDToken;
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

    @GetMapping()
    public List<Loadout> getLoadoutsByAccountId(IDToken idToken) {
        return loadoutService.getByAccountId(idToken.getSubject());
    }

    @GetMapping("/{id}")
    public Loadout getLoadoutById(@PathVariable int id) {
        //TODO: VALID ACCOUNT IS LOGGED IN AND OWNS/HAS PERMS LOADOUT.
        return loadoutService.getById(id);
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
