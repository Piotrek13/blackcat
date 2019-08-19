package pl.piotrpawlik.blackcat.blackCat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.piotrpawlik.blackcat.auctions.Auction;
import pl.piotrpawlik.blackcat.auctions.AuctionReposytory;
import pl.piotrpawlik.blackcat.users.User;

import java.util.List;

@Controller
@RequestMapping("/blackCat")
public class BlackCatController {

    private AuctionReposytory auctionReposytory;
    private Auction auction;
    private User user;

    public BlackCatController(AuctionReposytory auctionReposytory) {
        this.auctionReposytory = auctionReposytory;
    }

    @GetMapping
    String blackCat(Model model){

        List<Auction> auctions = auctionReposytory.findAll();
        model.addAttribute("auctions", auctions);



        return "blackCat";
    }


}
