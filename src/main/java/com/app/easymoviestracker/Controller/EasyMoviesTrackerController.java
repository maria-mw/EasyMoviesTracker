package com.app.easymoviestracker.Controller;

import com.app.easymoviestracker.Entity.*;
import com.app.easymoviestracker.Repository.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class EasyMoviesTrackerController {
    @Autowired
    private CategoryRepositoryService categoryRepositoryService;
    @Autowired
    private MovieRepositoryService movieRepositoryService;
    @Autowired
    private StatusRepositoryService statusRepositoryService;

    @GetMapping({"/", "/start"})    //Goto Index Page.
    public String view() {
        return "index";
    }

    @GetMapping("/addMovieForm")   //Goto addMovie Page.
    public String addMovie(Movie movie, Model model) {
        List<Category> categoriesList = categoryRepositoryService.findAll();
        model.addAttribute("categoriesList", categoriesList);
        List<Status> statusesList = statusRepositoryService.findAll();
        model.addAttribute("statusesList", statusesList);
        return "addMoviePage";
    }

    @PostMapping("/addMovie")
    public String saveMovie(Movie movie, Model model) {
        movieRepositoryService.save(movie);
//        model.addAttribute("message", "Record insert successfully...");
        return "index";
    }

    @GetMapping("/allMovies")
    public String listMovies(Model model) {
        //Display All Movies
        List<Movie> list = movieRepositoryService.findAll();
        model.addAttribute("data", list);
        return "allMoviesPage";
    }

    @GetMapping("/addCategoryForm")   //Goto addCategory Page.
    public String addCategory(Category category) {
        return "addCategoryPage";
    }

    @PostMapping("/addCategory")
    public String saveCategory(Category category, Model model) {
        categoryRepositoryService.save(category);
        model.addAttribute("message", "Record insert successfully...");
        //Display Category Info
        List<Category> list = categoryRepositoryService.findAll();
        model.addAttribute("data", list);
        return "addCategoryPage";
    }

    @GetMapping("/allCategories")
    public String listCategory(Model model) {
        //Display Status Info
        List<Category> list = categoryRepositoryService.findAll();
        model.addAttribute("data", list);
        return "allCategoriesPage";
    }

    @GetMapping("/addStatusForm")   //Goto addStatus Page.
    public String addStatus(Status status) {
        return "addStatusPage";
    }

    @PostMapping("/addStatus")
    public String saveStatus(Status status, Model model) {
        statusRepositoryService.save(status);
        model.addAttribute("message", "Record insert successfully...");
        //Display Status Info
        List<Status> list = statusRepositoryService.findAll();
        model.addAttribute("data", list);
        return "addStatusPage";
    }

    @GetMapping("/allStatuses")
    public String listStatus(Model model) {
        //Display All Statuses
        List<Status> list = statusRepositoryService.findAll();
        model.addAttribute("data", list);
        return "allStatusesPage";
    }
}
