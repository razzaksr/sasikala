package forms.simple;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/fd")
public class ControlForm 
{
	@RequestMapping("/desire")
	public ModelAndView hai()
	{
		return new ModelAndView("saySome");
	}
	@RequestMapping(value="/calc",method=RequestMethod.POST)
	public ModelAndView find(@RequestParam Map<String, String> data)
	{
		ModelAndView mod=new ModelAndView("answerSome");
		int dep=Integer.parseInt(data.get("deposit"));
		int ten=Integer.parseInt(data.get("tenor"));
		String type=data.get("citizen");double maturity=0.0;
		if(type.equals("Normal")) 
		{maturity=dep+(((dep*6.9)/100)*ten);}
		else
		{maturity=dep+(((dep*7.2)/100)*ten);}
		mod.addAllObjects(data);mod.addObject("outcome",maturity);
		return mod;
	}
}
