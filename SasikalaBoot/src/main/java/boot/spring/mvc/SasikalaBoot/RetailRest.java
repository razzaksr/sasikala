package boot.spring.mvc.SasikalaBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/retail")
public class RetailRest 
{
	@Autowired
	RetailRepo repo;
	@GetMapping("/list")
	public List<Speaker> all()
	{
		return repo.findAll();
	}
	@PostMapping("/add")
	public Speaker add(@RequestBody Speaker speaker)
	{
		return repo.save(speaker);
	}
	@GetMapping("/get/{id}")
	public Speaker get(@PathVariable("id") int id)
	{
		return repo.findById(id).orElse(new Speaker());
	}
	@PutMapping("/edit")
	public Speaker edit(@RequestBody Speaker speaker)
	{
		return repo.save(speaker);
	}
	@DeleteMapping("/delete")
	public void erase(@RequestBody Speaker speaker)
	{
		repo.delete(speaker);
	}
}
