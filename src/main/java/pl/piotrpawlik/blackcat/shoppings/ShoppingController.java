package pl.piotrpawlik.blackcat.shoppings;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ShoppingController {

    /*private final ShoppingReposytory shoppingReposytory;

    public ShoppingController(ShoppingReposytory shoppingReposytory) {
        this.shoppingReposytory = shoppingReposytory;
    }

    @GetMapping("/shoppings")
    String list(Model model) {

        List<Shopping> shoppings = shoppingReposytory.findAll();
        model.addAttribute("shoppings", shoppings);

        return "shoping/all";
    }

    @GetMapping("/Shopping/{id}/Delate")
    String delete(@PathVariable Long id) {
        Shopping shoping = shoppingReposytory.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Shoppings not found"));
        shoppingReposytory.delete(shopping);

        return "redirect:/shoppings";
    }

    @PostMapping(value = "/biddings"
            , consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    String createBidding( @RequestParam String licytacja, @RequestParam double kup,
                          @RequestParam double kupTeraz, @RequestParam String koszyk) {
        List<Shopping> shoppings = shoppingReposytory.findAll();
        Shopping shopping = shoppingReposytory.findById(shoppingId).get();

        try {
            Shopping shopping = new Shopping(licytacja,kup, kupTeraz, koszyk);
            shoppingReposytory.save(shopping);
            return "redirect:/shoppings";
        }catch (Exception e){
            return "/shoppings/add";
        }
    }

    @GetMapping("/shoppings/add")
    String addshoppingForm(Model model) {
        model.addAttribute("shoppings", shoppingReposytory.findAll());
        return "Shopping/add";
    }*/
}
