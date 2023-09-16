package pxu.com.service;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pxu.com.entity.Product;
import pxu.com.repository.ProductRepository;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	@Transactional
	public void save(Product product) {
		productRepository.save(product);
	}

	@Override
	@Transactional
	public void update(Product product) {
		productRepository.update(product);
	}

	@Override
	@Transactional
	public void delete(int id) {
		productRepository.delete(id);
	}

	@Override
	@Transactional
	public List<Product> fimAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	@Transactional
	public Product finByid(int id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id);
	}

}
