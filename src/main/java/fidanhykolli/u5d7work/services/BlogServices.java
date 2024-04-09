package fidanhykolli.u5d7work.services;

import fidanhykolli.u5d7work.entities.Blog;
import fidanhykolli.u5d7work.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class BlogServices {
    public List<Blog> blogList = new ArrayList<>();

    public List<Blog> getAllBlogs() {
        return this.blogList;
    }

    public Blog saveBlog(Blog body) {
        Random rndm = new Random();
        int id = rndm.nextInt(1000) + 1;
        int tempoLetturaMinuti = rndm.nextInt(5) + 1;
        body.setId(id);
        body.setTempoLetturaMinuti(tempoLetturaMinuti);
        blogList.add(body);
        return body;
    }

    public Blog findById(int id){
        Blog found = null;
        for(Blog blog : this.blogList) {
            if(blog.getId() == id){
                found = blog;
                break;
            }
        }
        if (found == null) {
            throw new NotFoundException(id);
        } else {
            return found;
        }

    }


    public Blog findByIdAndModify(int id, Blog updatedBlog) {
        Blog found = null;
        for (Blog blog : this.blogList) {
            if (blog.getId() == id) {
                found = blog;

                found.setCategoria(updatedBlog.getCategoria());
                found.setTitolo(updatedBlog.getTitolo());
                found.setCover(updatedBlog.getCover());
                found.setContenuto(updatedBlog.getContenuto());
                break;
            }
        }
        if (found == null) {
            throw new NotFoundException(id);
        } else {
            return found;
        }
    }
}
