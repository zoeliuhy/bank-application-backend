package com.rabobank.bankapplication.bootstrapper;

import com.rabobank.bankapplication.model.Category;
import com.rabobank.bankapplication.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CategoryLoader implements CommandLineRunner {

    @Autowired
    public CategoryRepo categoryRepo;

    @Override
    public void run(String... args) throws Exception {
        loadCategories();
    }

    private void loadCategories() {
        if(categoryRepo.count() == 0) {
            categoryRepo.save(
                    Category.builder()
                            .categoryName("Transport & travel")
                            .build()
            );
            categoryRepo.save(
                    Category.builder()
                            .categoryName("Shopping")
                            .build()
            );
            categoryRepo.save(
                    Category.builder()
                            .categoryName("Groceries & household")
                            .build()
            );
            categoryRepo.save(
                    Category.builder()
                            .categoryName("Fixed expenses")
                            .build()
            );
            categoryRepo.save(
                    Category.builder()
                            .categoryName("Health & Wellness")
                            .build()
            );
            categoryRepo.save(
                    Category.builder()
                            .categoryName("Restaurants & bars")
                            .build()
            );
            categoryRepo.save(
                    Category.builder()
                            .categoryName("Investment & donations")
                            .build()
            );
            categoryRepo.save(
                    Category.builder()
                            .categoryName("Income")
                            .build()
            );
            categoryRepo.save(
                    Category.builder()
                            .categoryName("+/- Debit Account")
                            .build()
            );
        }
    }
}
