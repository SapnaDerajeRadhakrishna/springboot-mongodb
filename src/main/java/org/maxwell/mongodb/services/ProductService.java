package org.maxwell.mongodb.services;

import java.util.List;

import org.maxwell.mongodb.commands.ProductForm;
import org.maxwell.mongodb.domain.Product;

public interface ProductService {

    List<Product> listAll();

    Product getById(String id);

    Product saveOrUpdate(Product product);

    void delete(String id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
