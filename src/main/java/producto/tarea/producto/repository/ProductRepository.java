package producto.tarea.producto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import producto.tarea.producto.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{
    
}