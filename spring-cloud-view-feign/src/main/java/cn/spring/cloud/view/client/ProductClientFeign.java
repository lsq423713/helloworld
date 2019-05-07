package cn.spring.cloud.view.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import cn.spring.cloud.view.pojo.Product;

@FeignClient(value ="SPRING-CLOUD-DATA")
public interface ProductClientFeign {
	@GetMapping("/products")
    public List<Product> listProdcuts();
}
