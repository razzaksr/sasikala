package framework.spring.SasikalaSpring.SasikalaSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/dayone")
public class DayOneController 
{
	@RequestMapping("/one")
	public ModelAndView one()
	{
		ModelAndView mod=new ModelAndView("index");
		return mod;
	}
	@RequestMapping(path="/login/{user}/{pass}", method=RequestMethod.GET)
	public ModelAndView via(@PathVariable("user") String user,@PathVariable("pass") String pass)
	{
		ModelAndView mod=null;
		if(user.equalsIgnoreCase("razzak")&&pass.equalsIgnoreCase("mohamed"))
		{
			return mod=new ModelAndView("fine").addObject("who", user);
		}
		else
		{
			return mod=new ModelAndView("index");
		}
	}
	@RequestMapping(path="/log", method=RequestMethod.POST)
	public ModelAndView multi(@RequestParam("user") String user,@RequestParam("pass") String pass)
	{
		ModelAndView mod=null;
		if(user.equalsIgnoreCase("razzak")&&pass.equalsIgnoreCase("mohamed"))
		{
			return mod=new ModelAndView("fine").addObject("who", user);
		}
		else
		{
			return mod=new ModelAndView("index");
		}
	}
}
