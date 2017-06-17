package pl.traza;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	@RequestMapping("/welcome")
	public String displayForm(Model model){
		model.addAttribute("attribute1", "Krzysztof");
		return "welcome";
	}
}
