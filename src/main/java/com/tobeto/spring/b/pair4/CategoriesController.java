package com.tobeto.spring.b.pair4;

import org.springframework.web.bind.annotation.*;
import com.tobeto.spring.b.pair4.models.Category;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/categories")
public class CategoriesController {
    List<Category> inCategoriesList = new ArrayList<>();

    @GetMapping
    public List<Category> get(){
        return inCategoriesList;
    }

    @GetMapping("{id}")
    public Category getById(@PathVariable int id){
        Category category = inCategoriesList.stream().filter((p) -> p.getId() == id).findFirst().orElseThrow();
        return category;
    }

    @PostMapping
    public String add(@RequestBody Category category) {
        inCategoriesList.add(category);
        return category.getId()+" ID' li kategori sisteme eklendi.";
    }

    @PutMapping
    public String update(@RequestBody Category updatedCategory){
        Category category = inCategoriesList
                .stream()
                .filter((p) -> p.getId() == updatedCategory.getId())
                .findFirst()
                .orElseThrow();
        category.setName(updatedCategory.getName());
        return category.getId()+" ID' li kategori güncellendi.";
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable int id){
        Category category = inCategoriesList
                .stream()
                .filter((p) -> p.getId() == id)
                .orElseThrow();
        inCategoriesList.remove(category);
        return id+" ID' li kategori silindi.";
    }
}