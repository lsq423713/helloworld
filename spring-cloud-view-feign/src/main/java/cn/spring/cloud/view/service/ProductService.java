package cn.spring.cloud.view.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.spring.cloud.view.client.ProductClientFeign;
import cn.spring.cloud.view.pojo.Product;

@Service
public class ProductService {
	@Autowired
	ProductClientFeign productClientFeign;
	public List<Product> listProducts(){
		return productClientFeign.listProdcuts();
	}
}
