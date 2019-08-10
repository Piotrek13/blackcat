package pl.piotrpawlik.blackcat.categories;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class CategoryController {

    private final CategoryReposytory categoryReposytory;

    public CategoryController(CategoryReposytory categoryReposytory) {

        this.categoryReposytory = categoryReposytory;
    }

    @GetMapping("/categories")
    String list(Model model) {

            List<Category> categories = categoryReposytory.findAll();
            model.addAttribute("categories", categories);

        return "category/all";
    }

    @GetMapping("/Category/{id}/Delate")
    String delete(@PathVariable Long id) {
        Category category = categoryReposytory.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Category not found"));
        categoryReposytory.delete(category);

        return "redirect:/categories";
    }

    @PostMapping(value = "/categories"
            , consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    String createCategory(@RequestParam String name) {
        List<Category> categories = categoryReposytory.findAll();
        try {
            checkeDuplicte(categories, name);
        }catch (IllegalArgumentException e){
            return "redirect:/categories/add";
        }

        Category category = new Category(name);
        categoryReposytory.save(category);

        return "redirect:/categories";
    }

    private List<Category> checkeDuplicte (List<Category> categories, String name){
        for (Category category : categories){
            if(category.getName().equals(name)){
                throw new IllegalArgumentException() ;
            }
        }
        return categories;
    }

    @GetMapping("/categories/add")
    String addCategoryForm(Model model) {
        model.addAttribute("categories", categoryReposytory.findAll());
        return "category/add";
    }

}
