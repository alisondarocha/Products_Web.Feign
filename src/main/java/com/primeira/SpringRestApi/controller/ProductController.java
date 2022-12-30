package com.primeira.SpringRestApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.primeira.SpringRestApi.clients.ProductClient;
import com.primeira.SpringRestApi.model.FakeProduct;

@Controller
public class ProductController {

    @Autowired
    private ProductClient _productClient;

    @RequestMapping( method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<FakeProduct> findById(@PathVariable String id) {

        return ResponseEntity.status(HttpStatus.OK).body(_productClient.getByIdProduct(id));
    }
}
