package pl.traza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class WebController {
	@Autowired
	TemperatureDAO temperatureDAO;
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String displayForm(Model model){
		model.addAttribute("temperatureForm", new Temperature());
		return "welcome";
	}
	@RequestMapping(value="/welcome", method=RequestMethod.POST)
	public String processForm(@ModelAttribute("temperatureForm") Temperature temperatureFromForm, BindingResult result, Model model){
		Temperature temperature = new Temperature();
		temperature.setTemperatureC(temperatureFromForm.getTemperatureC());
		//that would be on the same page i quess
		//model.addAttribute("temperatureResult", temperature.getTemperatureF());
		temperatureDAO.setTemperature(temperature);
		return "redirect:/result";
	}
	@RequestMapping(value="/result")
	public String displayResult(Model model){
		model.addAttribute("temperatureResult",temperatureDAO.getTemperature().getTemperatureF());
		model.addAttribute("temperatureList",temperatureDAO.temperatureListAll());
		return "result";
	}
}