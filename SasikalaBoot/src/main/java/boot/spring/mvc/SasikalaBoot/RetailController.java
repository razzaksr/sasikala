package boot.spring.mvc.SasikalaBoot;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RetailController 
{
	@Autowired
	RetailRepo retail;
	@GetMapping("/")
	public ModelAndView one()
	{return new ModelAndView("index");}
	@PostMapping("/log")
	public ModelAndView two(@RequestBody @RequestParam("user") String user,@RequestParam("pass") String pass )
	{
		if(user.equals("sasikala")&&pass.equals("SASIKALA"))
		{
			return new ModelAndView("home").addObject("status",user);
		}
		else {return new ModelAndView("index");}
	}
	@GetMapping("/add")
	public ModelAndView three()
	{return new ModelAndView("newone");}
	@PostMapping("/added")
	public ModelAndView four(Speaker speaker)
	{
		retail.save(speaker);
		System.out.println(speaker+" added to table");
		return new ModelAndView("newone").addObject("msg", "added");
	}
	@GetMapping("/list")
	public ModelAndView five()
	{
		List<Speaker> hey=retail.findAll();
		return new ModelAndView("stocks").addObject("got", hey);
	}
}
