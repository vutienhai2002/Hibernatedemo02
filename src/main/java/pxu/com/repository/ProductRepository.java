package pxu.com.repository;

import java.util.List;

import pxu.com.entity.Product;

public interface ProductRepository {

    List<Product> findAll();

    Product findById(int id);

    void save(Product product);

    void update(Product product);

    void delete(int id);
}
