package com.awesomecompany.megamonolith;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CatalogController {

    @GetMapping("/catalog")
    public String homePage() {
        return "HI ITS A CONTROLLA FROM SPRIIIIING SHIET";
    }
}
