package com.mycompany.user;
import com.mycompany.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    // Additional query methods if needed

//    @Controller
//    class MainController {
//        @Autowired
//        private UserRepository userRepository;
//
//        public String viewHomePage(Model model) {
//            List<User> users = (List<User>) userRepository.findAll();
//            model.addAttribute("users", users);
//            return "index";
//        }
//
//        public String saveUser(@ModelAttribute("user") User user, RedirectAttributes redirectAttributes) {
//            userRepository.save(user);
//            redirectAttributes.addFlashAttribute("message", "User saved successfully.");
//            return "redirect:/";
//        }
//
//        public String deleteUser(@RequestParam("id") Long id, RedirectAttributes redirectAttributes) {
//            userRepository.deleteById(id);
//            redirectAttributes.addFlashAttribute("message", "User deleted successfully.");
//            return "redirect:/";
//        }
//    }
}