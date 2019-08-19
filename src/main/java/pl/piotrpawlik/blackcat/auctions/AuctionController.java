package pl.piotrpawlik.blackcat.auctions;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.piotrpawlik.blackcat.categories.Category;
import pl.piotrpawlik.blackcat.categories.CategoryReposytory;
import pl.piotrpawlik.blackcat.users.User;
import pl.piotrpawlik.blackcat.users.UserReposytory;

import java.time.LocalDate;
import java.util.List;

@Controller
public class AuctionController {

    private final AuctionReposytory auctionReposytory;
    private CategoryReposytory categoryRepository;
    private UserReposytory userRepository;

    public AuctionController(AuctionReposytory auctionReposytory, CategoryReposytory categoryRepository) {
        this.auctionReposytory = auctionReposytory;
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/auctions")
    String list(Model model) {

        List<Auction> auctions = auctionReposytory.findAll();
        model.addAttribute("auctions", auctions);

        return "Auction/all";
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
    String createAuction(@RequestParam String name, @RequestParam(required = false) boolean promowane,
                         @RequestParam Long categoryId, @RequestParam double kwotaMin,
                         @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dataWystawienia,
                         @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dataZakończenia,
                         @RequestParam String opis) {
        List<Auction> auctions = auctionReposytory.findAll();
        Category category = categoryRepository.findById(categoryId).get();

        try {
            Auction auction = new Auction(name, category, promowane, kwotaMin,
                    0.0,dataWystawienia, dataZakończenia, 0L, opis);
            auctionReposytory.save(auction);
            return "redirect:/auctions";
        }catch (Exception e){
            return "/Auctions/add";
        }
    }

    @GetMapping("/auctions/add")
    String addAuctionForm(Model model) {
        model.addAttribute("categories", categoryRepository.findAll());
        return "Auction/add";
    }

    @GetMapping("/auctions/{id}")
    String auctionDetails(@PathVariable Long id, Model model){
        Auction auction = auctionReposytory.findById(id).orElseThrow(()->
                new IllegalArgumentException("Auction not found"));
        model.addAttribute("auction", auction);

        Long Odwiedziny = auction.getIlośćOdwiedzin()+1;
        auction.setIlośćOdwiedzin(Odwiedziny);
        auctionReposytory.save(auction);

        return "Auction/details";

    }
    @PostMapping(value = "/auction/{id}/bid"
            , consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    String bid(@RequestParam double price, @PathVariable long id) {
        Auction auction = auctionReposytory.findById(id).orElseThrow(()->
                new IllegalArgumentException("Auction not found"));

        double kwotaObecna = auction.getKwotaObecna();
        double newPrice = Math.max(kwotaObecna,price);
        auction.setKwotaObecna(newPrice);

        if(newPrice != kwotaObecna) {
            auction.setMaxBidder(getCurrentLoggedUser());
        }

        auctionReposytory.save(auction);


        return "redirect:/auction/"+id;
    }

    private User getCurrentLoggedUser() {
        return userRepository.findById(1L).orElseThrow(() -> new IllegalArgumentException("User not found"));

    }


}

/*
    userRepository.findById(idZSessji);
    auctionRepositoru.findById(auctionId);

    auction.setMaxBidder(user);
    auction.setPrice(min( obecna, usera));
     */