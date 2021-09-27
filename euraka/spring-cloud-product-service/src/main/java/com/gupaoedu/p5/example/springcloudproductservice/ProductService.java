package com.gupaoedu.p5.example.springcloudproductservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@RestController
public class ProductService {

    @GetMapping("/product/{id}")
    public String findById(@PathVariable("id") int id){
        return "SUCCESS";
    }
}
