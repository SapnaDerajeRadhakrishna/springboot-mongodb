package org.maxwell.mongodb.repositories;

import org.maxwell.mongodb.domain.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, String> {
}
