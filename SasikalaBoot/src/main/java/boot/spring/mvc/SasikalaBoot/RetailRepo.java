package boot.spring.mvc.SasikalaBoot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RetailRepo extends JpaRepository<Speaker, Integer>
{
	@Query("from Speaker where feature=:which")
	public List<Speaker> findByName(String which); 
}
