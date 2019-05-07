package cn.spring.cloud.view.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import cn.spring.cloud.view.pojo.Product;

@Component
public class ProductClientRibbon {
	@Autowired
    RestTemplate restTemplate;
 
    public List<Product> listProdcuts() {
        return restTemplate.getForObject("http://SPRING-CLOUD-DATA/products",List.class);
    }
}
