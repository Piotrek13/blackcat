package pl.piotrpawlik.blackcat.users;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class UserController {

    private final UserReposytory userReposytory;

    public UserController(UserReposytory userReposytory) {
        this.userReposytory = userReposytory;
    }

    @GetMapping("/users")
    String list(Model model) {

        List<User> users = userReposytory.findAll();
        model.addAttribute("users", users);

        return "user/all";
    }

    @GetMapping("/User/{id}/Delate")
    String delete(@PathVariable Long id) {
        User user = userReposytory.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Users not found"));
        userReposytory.delete(user);

        return "redirect:/users";
    }


    @PostMapping(value = "/users"
            , consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    String createUser(@RequestParam String login, @RequestParam String password,
                         @RequestParam String adres, @RequestParam LocalDateTime dataZałożeniaKonta,
                         @RequestParam String statusKonta, @RequestParam String type, Model model) {

        try {
            User user = new User(login, password, adres, dataZałożeniaKonta, statusKonta, type);
            userReposytory.save(user);
            return "redirect:/users";
        }catch (Exception e){
            model.addAttribute("error", e.getMessage());
            return "/users/add";
        }
    }

    @GetMapping("/users/add")
    String addUserForm(Model model) {

        return "User/add";
    }
}
