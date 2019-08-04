package pl.piotrpawlik.blackcat.blackCat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blackCat")
public class BlackCatController {

    @GetMapping
    String blackCat(){
        return "blackCat";
    }
}
