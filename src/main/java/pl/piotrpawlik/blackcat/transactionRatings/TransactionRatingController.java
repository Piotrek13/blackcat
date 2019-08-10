package pl.piotrpawlik.blackcat.transactionRatings;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TransactionRatingController {
   /* private final TransactionRatingReposytory transactionRatingReposytory;

    public TransactionRatingController(TransactionRatingReposytory transactionRatingReposytory) {
        this.transactionRatingReposytory = transactionRatingReposytory;
    }

    @GetMapping("/transactionRating")
    String list(Model model) {

        List<TransactionRating> transactionRatings = transactionRatingReposytory.findAll();
        model.addAttribute("transactionRatings", transactionRatings);

        return "transactionRating/all";
    }

    @GetMapping("/transactionRating/{id}/Delate")
    String delete(@PathVariable Long id) {
        transactionRating transactionRating = transactionRatingReposytory.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("TransactionRatings not found"));
        transactionRatingReposytory.delete(transactionRating);

        return "redirect:/transactionRatings";
    }

    @PostMapping(value = "/transactionRatings"
            , consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    String createBidding(@RequestParam double ocenaSprzedającego, @RequestParam String komentarzSprzedającego,
                         @RequestParam double ocenaKupującego, @RequestParam String komentarzKupującego) {
        List<TransactionRating> transactionRatings = transactionRatingReposytory.findAll();
        TransactionRating transactionRating = transactionRatingReposytory.findById(transactionRatingId).get();

        try {
            TransactionRating shopping = new TransactionRating(ocenaSprzedającego,komentarzSprzedającego,
                    ocenaKupującego, komentarzKupującego);
            transactionRatingReposytory.save(shopping);
            return "redirect:/transactionRatings";
        }catch (Exception e){
            return "/transactionRating/add";
        }
    }

    @GetMapping("/transactionRatings/add")
    String addtransactionRatingForm(Model model) {
        model.addAttribute("transactionRatings", transactionRatingReposytory.findAll());
        return "TransactionRating/add";
    }*/
}
