package app.domain.account;

import org.keycloak.representations.IDToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/accounts/")
public class AccountController {

    @GetMapping("/me")
    public IDToken accounts(IDToken idToken) {
        return idToken;
    }

}