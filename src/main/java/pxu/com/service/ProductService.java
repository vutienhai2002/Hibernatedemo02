package pxu.com.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pxu.com.entity.Product;


public interface ProductService {
	 List<Product> fimAll();

	 Product finByid(int id);

	 void save(Product product);

	 void update(Product product); 

	 void delete(int id);
}
