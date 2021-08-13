package app.domain.loadout;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/loadout")
public class LoadoutController {

    private final LoadoutService loadoutService;

    public LoadoutController(LoadoutService loadoutService) {
        this.loadoutService = loadoutService;
    }

    @GetMapping("/{id}")
    public Loadout getLoadoutById(@PathVariable int id) {
        //TODO: VALID ACCOUNT IS LOGGED IN AND OWNS/HAS PERMS LOADOUT.
        return loadoutService.getLoadoutById(id);
    }

    @PutMapping
    public Loadout updateLoadout(@RequestBody @Valid Loadout loadout) {
        //TODO: VALID ACCOUNT IS LOGGED IN AND OWNS/HAS PERMS LOADOUT.
        return loadoutService.update(loadout);
    }
}
