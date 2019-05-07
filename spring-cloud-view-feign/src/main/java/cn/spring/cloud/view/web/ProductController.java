package cn.spring.cloud.view.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.spring.cloud.view.pojo.Product;
import cn.spring.cloud.view.service.ProductService;

@Controller
public class ProductController {
	@Autowired ProductService productService;
	@RequestMapping("/products")
	public String listProducts(Model m){
		List<Product> list = productService.listProducts();
		m.addAttribute("ps", list);
		return "products";
	}
}
