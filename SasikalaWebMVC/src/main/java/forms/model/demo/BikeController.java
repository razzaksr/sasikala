package forms.model.demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;

import javax.sql.DataSource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
	private DataSource dataSource;
	private JdbcTemplate jdbc;
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
	public ModelAndView dosome(@Valid @ModelAttribute("bike") Bike bike,BindingResult res)
	{
		if(bike.getBid()==null)
		{throw new NumberFormatException();}
		else if(bike.getModel().length()<=4)
		{throw new InputMismatchException();}
		else if(bike.getPrice()>120000)
		{throw new SasikalaException();}
		if(res.hasErrors()) {return new ModelAndView("addStock");}
		ModelAndView mod=new ModelAndView("enrolled");
		jdbc.update("insert into bike(bid,model,milage,price) values(?,?,?,?)",new Object[] {bike.getBid(),bike.getModel(),bike.getMilage(),bike.getPrice()});
		mod.addObject("added",bike);
		return mod;
	}

	public DataSource getDataSource() {
		return dataSource;
	}
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbc=new JdbcTemplate(dataSource);
	}
}
