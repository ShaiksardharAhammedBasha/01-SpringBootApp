package com.example.services;

import com.example.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ProductServices {

    @Autowired
    private ProductDao dao;

    

}
