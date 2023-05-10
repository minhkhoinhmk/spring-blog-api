package com.springboot.blog.service;

import com.springboot.blog.dto.CategoryDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class CategoryServiceTest {
    @Autowired
    private CategoryService categoryService;

    @Test
    public void givenReuqest_whenGetAllCategories_thenReturnListCategories() {
        List<CategoryDto> actual = categoryService.getAllCategories();

        assertNotNull(actual);
    }
}
