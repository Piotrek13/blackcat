package pl.piotrpawlik.blackcat.categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryReposytory extends JpaRepository<Category, Long> {


}
