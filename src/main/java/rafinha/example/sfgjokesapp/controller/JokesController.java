package rafinha.example.sfgjokesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import rafinha.example.sfgjokesapp.services.JokesServiceImpl;

@Controller
public class JokesController {

    private final JokesServiceImpl jokesService;

    public JokesController(JokesServiceImpl jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model) {
        model.addAttribute("joke", jokesService.getJoke());
        return "index";
    }
}
