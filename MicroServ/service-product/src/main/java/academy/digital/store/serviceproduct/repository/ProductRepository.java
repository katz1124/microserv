package academy.digital.store.serviceproduct.repository;

import academy.digital.store.serviceproduct.entity.Category;
import academy.digital.store.serviceproduct.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    public List<Product> findByCategory(Category category);

}
