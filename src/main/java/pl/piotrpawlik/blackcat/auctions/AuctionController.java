package pl.piotrpawlik.blackcat.auctions;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.piotrpawlik.blackcat.categories.Category;
import pl.piotrpawlik.blackcat.categories.CategoryReposytory;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class AuctionController {

    private final AuctionReposytory auctionReposytory;
    private CategoryReposytory categoryRepository;

    public AuctionController(AuctionReposytory auctionReposytory, CategoryReposytory categoryRepository) {
        this.auctionReposytory = auctionReposytory;
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/auctions")
    String list(Model model) {

        List<Auction> auctions = auctionReposytory.findAll();
        model.addAttribute("auctions", auctions);

        return "auction/all";
    }

    @GetMapping("/Auction/{id}/Delate")
    String delete(@PathVariable Long id) {
        Auction category = auctionReposytory.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Auction not found"));
        auctionReposytory.delete(category);

        return "redirect:/auctions";
    }

    @PostMapping(value = "/auctions"
            , consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    String createAuction(@RequestParam String name, @RequestParam boolean promowane,
                         @RequestParam Long categoryId, @RequestParam double kwotaMin,
                         @RequestParam LocalDateTime dataWystawienia, @RequestParam LocalDateTime dataZakończenia,
                         @RequestParam Long ilośćOdwiedzin, @RequestParam String opis) {
        List<Auction> auctions = auctionReposytory.findAll();
        Category category = categoryRepository.findById(categoryId).get();

        try {
            Auction auction = new Auction(name, category, promowane, kwotaMin, 0.0,dataWystawienia, dataZakończenia, ilośćOdwiedzin, opis);
            auctionReposytory.save(auction);
            return "redirect:/auctions";
        }catch (Exception e){
            return "/auctions/add";
        }
    }

    @GetMapping("/auctions/add")
    String addAuctionForm(Model model) {
        model.addAttribute("categories", categoryRepository.findAll());
        return "Auction/add";
    }

}
