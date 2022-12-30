package com.primeira.SpringRestApi.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeProduct {

    public int id;
    public String title;
    public String description;
    public float price;
    public float discountPercentage;
    public float rating;
    public float stock;
    public String brand;
    public String category;
    public String thumbnail;
    public List<Object> images;

}
