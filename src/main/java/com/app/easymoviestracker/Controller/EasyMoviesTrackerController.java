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
    @Autowired
    private GenreRepositoryService genreRepositoryService;
    @Autowired
    private ExitDayRepositoryService exitDayRepositoryService;
    @Autowired
    private CountryRepositoryService countryRepositoryService;
    @Autowired
    private AccessRepositoryService accessRepositoryService;
    @Autowired
    private SubtitleRepositoryService subtitleRepositoryService;
    @Autowired
    private LanguageRepositoryService languageRepositoryService;

    @GetMapping({"/", "/start"})    //Goto Index Page.
    public String view() {
        return "index";
    }

    @GetMapping("/addMovieForm")   //Goto addMovie Page.
    public String addMovie(Movie movie, Model model) {
        List<Genre> genresList = genreRepositoryService.findAll();
        model.addAttribute("genresList", genresList);
        List<Category> categoriesList = categoryRepositoryService.findAll();
        model.addAttribute("categoriesList", categoriesList);
        List<Status> statusesList = statusRepositoryService.findAll();
        model.addAttribute("statusesList", statusesList);
        return "addMoviePage";
    }

    @PostMapping("/addMovie")
    public String saveMovie(Movie movie, Model model) {
        movieRepositoryService.save(movie);
        model.addAttribute("message", "Record insert successfully...");
        //Display Movie Info
        List<Movie> moviesList = movieRepositoryService.findAll();
        model.addAttribute("data", moviesList);
        return "addMoviePage";
    }

    @GetMapping("/allMovies")
    public String listMovies(Model model) {
        //Display All Movies
        List<Movie> list = movieRepositoryService.findAll();
        model.addAttribute("data", list);
        return "allMoviesPage";
    }

    @GetMapping("/addGenreFrom")    //Goto addGenre Page
    public String addGenre(Genre genre) {
        return "addGenrePage";
    }

    @PostMapping("/addGenre")
    public String saveGenre(Genre genre, Model model) {
        genreRepositoryService.save(genre);
        model.addAttribute("message", "Record insert successfully...");
        //Display Genre info
        List<Genre> list = genreRepositoryService.findAll();
        model.addAttribute("data", list);
        return "addGenrePage";
    }

    @GetMapping("/allGenres")
    public String listGenre(Model model) {
        List<Genre> list = genreRepositoryService.findAll();
        model.addAttribute("data", list);
        return "allGenresPage";
    }

    @GetMapping("/addExitDayFrom")  //Goto addExitDay Page
    public String addExitDay(ExitDay exitDay) {
        return "addExitDay";
    }

    @PostMapping("/addExitDay")
    public String saveExitDay(ExitDay exitDay, Model model) {
        exitDayRepositoryService.save(exitDay);
        model.addAttribute("message", "Record insert successfully...");
        //Display Category Info
        List<ExitDay> list = exitDayRepositoryService.findAll();
        model.addAttribute("data", list);
        return "addExitDayPage";
    }

    @GetMapping("/allExitDays")
    public String listExitDay(Model model) {
        List<ExitDay> list = exitDayRepositoryService.findAll();
        model.addAttribute("data", list);
        return "allExitDaysPage";
    }

    @GetMapping("/addCountryFrom")  //Goto addCountry Page
    public String addCountry(Country country) {
        return "addExitDay";
    }

    @PostMapping("/addCountry")
    public String saveCountry(Country country, Model model) {
        countryRepositoryService.save(country);
        model.addAttribute("message", "Record insert successfully...");
        //Display Category Info
        List<Country> list = countryRepositoryService.findAll();
        model.addAttribute("data", list);
        return "addCountryPage";
    }

    @GetMapping("/allCountries")
    public String listCountry(Model model) {
        List<Country> list = countryRepositoryService.findAll();
        model.addAttribute("data", list);
        return "allCountriesPage";
    }

    @GetMapping("/addAccessFrom")  //Goto addCountry Page
    public String addAccess(Access access) {
        return "addExitDay";
    }

    @PostMapping("/addAccess")
    public String saveAccess(Access access, Model model) {
        accessRepositoryService.save(access);
        model.addAttribute("message", "Record insert successfully...");
        //Display Category Info
        List<Access> list = accessRepositoryService.findAll();
        model.addAttribute("data", list);
        return "addAccessPage";
    }

    @GetMapping("/allAccess")
    public String listAccess(Model model) {
        List<Access> list = accessRepositoryService.findAll();
        model.addAttribute("data", list);
        return "allAccess";
    }

    @GetMapping("/addSubtitleFrom")  //Goto addCountry Page
    public String addSubtitle(Subtitle subtitle) {
        return "addSubtitle";
    }

    @PostMapping("/addSubtitle")
    public String saveSubtitle(Subtitle subtitle, Model model) {
        subtitleRepositoryService.save(subtitle);
        model.addAttribute("message", "Record insert successfully...");
        //Display Category Info
        List<Subtitle> list = subtitleRepositoryService.findAll();
        model.addAttribute("data", list);
        return "addSubtitlePage";
    }

    @GetMapping("/allSubtitles")
    public String listSubtitle(Model model) {
        List<Subtitle> list = subtitleRepositoryService.findAll();
        model.addAttribute("data", list);
        return "allSubtitlesPage";
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

    @GetMapping("/addLanguageForm")   //Goto addStatus Page.
    public String addLanguage(Language language) {
        return "addLanguagePage";
    }

    @PostMapping("/addLanguage")
    public String saveLanguage(Language language, Model model) {
        languageRepositoryService.save(language);
        model.addAttribute("message", "Record insert successfully...");
        //Display Status Info
        List<Language> list = languageRepositoryService.findAll();
        model.addAttribute("data", list);
        return "addLanguagePage";
    }

    @GetMapping("/allLanguages")
    public String listLanguage(Model model) {
        //Display All Statuses
        List<Language> list = languageRepositoryService.findAll();
        model.addAttribute("data", list);
        return "allLanguagePage";
    }
}
