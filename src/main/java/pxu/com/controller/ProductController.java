package pxu.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pxu.com.entity.Product;
import pxu.com.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/add")
	public String processAddProductForm(@ModelAttribute("product") Product product) {
		return "/home";
	}

	@GetMapping("/list")
	public String listproduct(Model model) {
		List<Product> products = productService.fimAll();
		model.addAttribute("products", products);
		return "list";
	}

	@PostMapping("/save")
	@Transactional
	public String saveproduct(@ModelAttribute("product") Product product) {
		productService.save(product);
		return "redirect:/product/list";
	}

	@GetMapping("/delete")
	@Transactional
	public String delete(@ModelAttribute("productId") int id) {
		productService.delete(id);
		return "redirect:/product/list";
	}

	@GetMapping(value = "/update")
	public String updateform(@RequestParam("productId") int id, Model model) {
		Product product = productService.finByid(id);
		model.addAttribute("product", product);
		return "update";
	}

	@PostMapping("/edit")
	@Transactional
	public String updateProduct(@ModelAttribute("product") Product product) {
		productService.update(product);
		return "redirect:/product/list";
	}

}
