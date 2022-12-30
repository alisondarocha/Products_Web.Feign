package com.primeira.SpringRestApi.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.primeira.SpringRestApi.model.FakeProduct;

@FeignClient(url = "https://dummyjson.com/products", name = "products")
public interface ProductClient {
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    FakeProduct getByIdProduct(@PathVariable(value = "id") String id);
}   