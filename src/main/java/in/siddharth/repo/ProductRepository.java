package in.siddharth.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.siddharth.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{
}
