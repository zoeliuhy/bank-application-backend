package com.rabobank.bankapplication.service;

import com.rabobank.bankapplication.model.Category;
import com.rabobank.bankapplication.model.Transaction;
import com.rabobank.bankapplication.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public List<Category> getCategories() {

        return categoryRepo.findAll();
    }



}
