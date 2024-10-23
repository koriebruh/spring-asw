package koriebruh.restful.repository;

import koriebruh.restful.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ProductRepository extends JpaRepository<Product, Long> {
//    List<Product> findByNameContaining(String name);
}

