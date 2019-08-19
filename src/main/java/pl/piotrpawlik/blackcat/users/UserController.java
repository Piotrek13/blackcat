package pl.piotrpawlik.blackcat.users;

import org.springframework.http.MediaType;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.List;

@Controller
public class UserController {

    private final PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();


    private final UserReposytory userReposytory;

    public UserController(UserReposytory userReposytory) {
        this.userReposytory = userReposytory;
    }

    @GetMapping("/users")
    String list(Model model) {

        List<User> users = userReposytory.findAll();
        model.addAttribute("users", users);

        return "User/all";
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
                      @RequestParam String adres, Model model) {

        try {
            User user = new User(login, passwordEncoder.encode(password), adres, LocalDateTime.now(), true, Role.REGULAR.name());
            userReposytory.save(user);
            return "redirect:/users";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "/User/add";
        }
    }

    @GetMapping("/users/add")
    String addUserForm(Model model) {

        return "User/add";
    }

    @PostMapping(value = "/users/login", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    String login(@RequestParam String login, @RequestParam String password,
                 HttpServletRequest request, Model model) {
        User user = userReposytory.findByLoginAndPassword(login, password)
                .orElseThrow(() -> new IllegalArgumentException("Authentication failed"));

        request.getSession().setAttribute("userId", user.getId());
        request.getSession().setAttribute("login", user.getLogin());

        return "redirect:/blackCat";
    }

    @GetMapping(value = "/users/logout")
    String login(HttpServletRequest request) {
        request.getSession().removeAttribute("userId");
        request.getSession().removeAttribute("login");

        return "redirect:/blackCat";
    }

}
