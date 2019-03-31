package pl.spring.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.spring.core.services.UserService;
import pl.spring.dto.LoggedUserDTO;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdministrationController {

    private UserService userService;


    @Autowired
    public AdministrationController(UserService userService) {
        this.userService = userService;
    }

    /*

    @GetMapping
    public String prepareAdminPanel(Model model, @SessionAttribute LoggedUserDTO user) {
        AddKnowledgeSourceDTO newSource = new AddKnowledgeSourceDTO();
        model.addAttribute("newSource", newSource);

        model.addAttribute("user", user);
        return "admin";
    }


    @PostMapping("/sources/delete")
    private String deleteSource(Long sourceId, @SessionAttribute LoggedUserDTO user) {
        boolean deleted = knowledgeSourceService.deleteSource(sourceId);
        return "redirect:/admin";
    }

    @PostMapping("/sources/activate")
    public String activateSource(Long sourceId, @SessionAttribute LoggedUserDTO user) {
        boolean activated = knowledgeSourceService.activateSource(sourceId);
        return "redirect:/admin";
    }

    */
}