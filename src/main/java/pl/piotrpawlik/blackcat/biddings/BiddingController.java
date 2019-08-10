package pl.piotrpawlik.blackcat.biddings;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BiddingController {

    /*private final BiddingReposytory biddingReposytory;

    public BiddingController(BiddingReposytory biddingReposytory) {
        this.biddingReposytory = biddingReposytory;
    }

    @GetMapping("/biddings")
    String list(Model model) {

        List<Bidding> biddings = biddingReposytory.findAll();
        model.addAttribute("biddings", biddings);

        return "bidding/all";
    }

    @GetMapping("/Bidding/{id}/Delate")
    String delete(@PathVariable Long id) {
        Bidding bidding = biddingReposytory.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Biddings not found"));
        biddingReposytory.delete(bidding);

        return "redirect:/biddings";
    }

    @PostMapping(value = "/biddings/{biddingId}"
            , consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    String createBidding( @RequestParam String aukcja, @PathVariable Long biddingId
                      @RequestParam String user, @RequestParam double kwota) {
        List<Bidding> biddings = biddingReposytory.findAll();
        Bidding bidding = biddingReposytory.findById(biddingId).get();

        try {
            Bidding bidding = new Bidding(aukcja, user, kwota);
            biddingReposytory.save(bidding);
            return "redirect:/biddings";
        }catch (Exception e){
            return "/biddings/add";
        }
    }

    @GetMapping("/biddings/add")
    String addbiddingForm(Model model) {
        model.addAttribute("biddings", biddingReposytory.findAll());
        return "BIdding/add";
    }*/
}
