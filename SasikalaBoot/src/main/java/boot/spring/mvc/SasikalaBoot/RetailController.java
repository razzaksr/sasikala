package boot.spring.mvc.SasikalaBoot;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	@GetMapping("/edit")
	public ModelAndView six(@RequestParam("id") int id)
	{
		Speaker temp=retail.findById(id).orElse(new Speaker());
		return new ModelAndView("found").addObject("one", temp);
	}
	@PostMapping("/update")
	public ModelAndView seven(Speaker speaker)
	{
		retail.save(speaker);
		return new ModelAndView("found").addObject("one", speaker);
	}
	@GetMapping("/delete")
	public void eight(@RequestParam("id") int id)
	{
		Speaker temp=retail.findById(id).orElse(new Speaker());
		retail.delete(temp);
	}
	@GetMapping("/byName/{which}")
	public ModelAndView nine(@PathVariable("which") String which)
	{
		List<Speaker> temp=retail.findByName(which);
		return new ModelAndView("stocks").addObject("got", temp);
	}
}