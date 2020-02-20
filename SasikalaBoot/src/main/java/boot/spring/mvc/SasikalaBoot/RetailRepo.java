package boot.spring.mvc.SasikalaBoot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RetailRepo extends JpaRepository<Speaker, Integer>
{
}
