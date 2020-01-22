package InitialStage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class Beginning 
{
	@RequestMapping("/")
	public ModelAndView hai()
	{
		ModelAndView mod=new ModelAndView("init");
		return mod;
	}
	@RequestMapping("/{user}/{location}/{role}")
	public ModelAndView hello(@PathVariable("user") String user, @PathVariable("location") String location,@PathVariable("role") String role)
	{
		ModelAndView mod=new ModelAndView("init");
		mod.addObject("person",user);mod.addObject("place",location);
		mod.addObject("job",role);
		return mod;
	}
	/*@RequestMapping("/{user}/{location}/{role}")
	public ModelAndView hello(@PathVariable Map<String, String> hi)
	{
		ModelAndView mod=new ModelAndView("init");
		String user=hi.get("user");String location=hi.get("location");
		String role=hi.get("role");
		mod.addObject("person",user);mod.addObject("place",location);
		mod.addObject("job",role);
		return mod;
	}*/
}
