package com.rabobank.bankapplication.controller;

import com.rabobank.bankapplication.model.Category;
import com.rabobank.bankapplication.model.Transaction;
import com.rabobank.bankapplication.service.CategoryService;
import com.rabobank.bankapplication.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "Requester-Type", exposedHeaders = "X-Get-Header")
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public ResponseEntity<List<Category>> getAllCategories() {
        List<Category> categoryList = categoryService.getCategories();
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }

    @GetMapping("/account={accountId}&category={categoryId}")
    public ResponseEntity<List<Transaction>> getTransactionsByAccountIdAndCategoryId(@PathVariable Long accountId, @PathVariable Long categoryId) {
        List<Transaction> transactions = transactionService.getTransactionsByCategoryIdAndAccountId(accountId, categoryId);
        return new ResponseEntity<>(transactions, HttpStatus.OK);
    }


}
