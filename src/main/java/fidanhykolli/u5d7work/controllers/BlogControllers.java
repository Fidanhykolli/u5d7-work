package fidanhykolli.u5d7work.controllers;

import fidanhykolli.u5d7work.entities.Blog;
import fidanhykolli.u5d7work.services.BlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Blog")
public class BlogControllers {

    @Autowired
    BlogServices blogServices;

    @GetMapping
    public List<Blog> getBlog(){
        return this.blogServices.getAllBlogs();
    }

    @PostMapping
    public Blog saveBlog (@RequestBody Blog body){
        return this.blogServices.saveBlog(body);
    }

    @GetMapping ("/{blogId}")
    public Blog findById(@PathVariable int blogId){
        return this.blogServices.findById(blogId);
    }

    @PutMapping("/{blogId}")
    public Blog findByIdAndModify(@PathVariable int blogId, @RequestBody Blog body){
        return this.blogServices.findByIdAndModify(blogId, body);
    }
}
