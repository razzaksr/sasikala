package forms.model.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bike")
public class BikeController 
{
	@RequestMapping("/new")
	public ModelAndView init()
	{return new ModelAndView("addStock");}
	
	@InitBinder
	public void simple(WebDataBinder web)
	{
		SimpleDateFormat format=new SimpleDateFormat("dd.MM.yyyy");
		web.registerCustomEditor(Date.class,"manufactured" ,new CustomDateEditor(format, false));
		web.registerCustomEditor(Integer.class,"milage", new MilageEditor());
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public ModelAndView dosome(@ModelAttribute("bike") Bike bike)
	{
		ModelAndView mod=new ModelAndView("enrolled");
		mod.addObject("added",bike);
		return mod;
	}
}
