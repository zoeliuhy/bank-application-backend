package com.rabobank.bankapplication.service;

import com.rabobank.bankapplication.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CategoryService {

    List<Category> getCategories();


}
