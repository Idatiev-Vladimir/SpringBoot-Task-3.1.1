package SpringTask311.Task311.controller;

import SpringTask311.Task311.model.User;
import SpringTask311.Task311.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class UsersControllers {

    private final UserService userService;

    @Autowired
    public UsersControllers(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String allUsers(Model model) {
        model.addAttribute("Users", userService.allUser());
        return "users";
    }

    @GetMapping("/new")
    public String createUser(Model model) {
        model.addAttribute("user", new User());
        return "newUser";
    }

    @PostMapping("/")
    public String addUser(@ModelAttribute("user") User user) {
        userService.addUser(user);
        return "redirect:/";
    }

    @PostMapping("/update")
    public String updateUser(@ModelAttribute("user") User user) {
        userService.updateUser(user.getId(), user);
        return "redirect:/";
    }

    @PostMapping("/edit/{id}")
    public String editUser(@PathVariable("id") long id,
                           Model model) {
        model.addAttribute("user", userService.showUser(id));
        return "editUser";
    }

    @DeleteMapping("/delete/{id}")
    public String removeUser(@PathVariable("id") long id) {
        userService.removeUserById(id);
        return "redirect:/";
    }
}
