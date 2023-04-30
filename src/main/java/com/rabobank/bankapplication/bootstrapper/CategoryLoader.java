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
                            .categoryMultiplier(83)
                            .build()
            );
            categoryRepo.save(
                    Category.builder()
                            .categoryName("Shopping")
                            .categoryMultiplier(1143)
                            .build()
            );
            categoryRepo.save(
                    Category.builder()
                            .categoryName("Groceries & household")
                            .categoryMultiplier(802)
                            .build()
            );
            categoryRepo.save(
                    Category.builder()
                            .categoryName("Fixed expenses")
                            .categoryMultiplier(211)
                            .build()
            );
            categoryRepo.save(
                    Category.builder()
                            .categoryName("Health & Wellness")
                            .categoryMultiplier(105)
                            .build()
            );
            categoryRepo.save(
                    Category.builder()
                            .categoryName("Restaurants & bars")
                            .categoryMultiplier(802)
                            .build()
            );
            categoryRepo.save(
                    Category.builder()
                            .categoryName("Investment & donations")
                            .categoryMultiplier(105)
                            .build()
            );
            categoryRepo.save(
                    Category.builder()
                            .categoryName("Income")
                            .categoryMultiplier(105)
                            .build()
            );
        }
    }
}
