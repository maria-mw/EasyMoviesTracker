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

    @GetMapping({"/", "/start"})
    public String view() {
        return "index";
    }

    @GetMapping("/addMovieForm")
    public String addMovie(Movie movie, Model model) {
        List<Genre> genresList = genreRepositoryService.findAll();
        model.addAttribute("genresList", genresList);
        List<Access> accessesList = accessRepositoryService.findAll();
        model.addAttribute("accessesList", accessesList);
        List<Country> countriesList = countryRepositoryService.findAll();
        model.addAttribute("countriesList", countriesList);
        List<ExitDay> exitDaysList = exitDayRepositoryService.findAll();
        model.addAttribute("exitDaysList", exitDaysList);
        List<Subtitle> subtitlesList = subtitleRepositoryService.findAll();
        model.addAttribute("subtitleList", subtitlesList);
        List<Language> languagesList = languageRepositoryService.findAll();
        model.addAttribute("languagesList", languagesList);
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
        List<Movie> moviesList = movieRepositoryService.findAll();
        model.addAttribute("data", moviesList);
        return "addMoviePage";
    }

    @GetMapping("/allMovies")
    public String listMovies(Model model) {
        List<Movie> list = movieRepositoryService.findAll();
        model.addAttribute("data", list);
        return "allMoviesPage";
    }

    @GetMapping("/addGenreFrom")
    public String addGenre(Genre genre) {
        return "addGenrePage";
    }

    @PostMapping("/addGenre")
    public String saveGenre(Genre genre, Model model) {
        genreRepositoryService.save(genre);
        model.addAttribute("message", "Record insert successfully...");
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

    @GetMapping("/addCountryFrom")
    public String addCountry(Country country) {
        return "addCountryPage";
    }

    @PostMapping("/addCountry")
    public String saveCountry(Country country, Model model) {
        countryRepositoryService.save(country);
        model.addAttribute("message", "Record insert successfully...");
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

    @GetMapping("/addAccessFrom")
    public String addAccess(Access access) {
        return "addAccessPage";
    }

    @PostMapping("/addAccess")
    public String saveAccess(Access access, Model model) {
        accessRepositoryService.save(access);
        model.addAttribute("message", "Record insert successfully...");
        List<Access> list = accessRepositoryService.findAll();
        model.addAttribute("data", list);
        return "addAccessPage";
    }

    @GetMapping("/allAccesses")
    public String listAccess(Model model) {
        List<Access> list = accessRepositoryService.findAll();
        model.addAttribute("data", list);
        return "allAccessesPage";
    }

    @GetMapping("/addSubtitleFrom")
    public String addSubtitle(Subtitle subtitle) {
        return "addSubtitlePage";
    }

    @PostMapping("/addSubtitle")
    public String saveSubtitle(Subtitle subtitle, Model model) {
        subtitleRepositoryService.save(subtitle);
        model.addAttribute("message", "Record insert successfully...");
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

    @GetMapping("/addCategoryForm")
    public String addCategory(Category category) {
        return "addCategoryPage";
    }

    @PostMapping("/addCategory")
    public String saveCategory(Category category, Model model) {
        categoryRepositoryService.save(category);
        model.addAttribute("message", "Record insert successfully...");
        List<Category> list = categoryRepositoryService.findAll();
        model.addAttribute("data", list);
        return "addCategoryPage";
    }

    @GetMapping("/allCategories")
    public String listCategory(Model model) {
        List<Category> list = categoryRepositoryService.findAll();
        model.addAttribute("data", list);
        return "allCategoriesPage";
    }

    @GetMapping("/addStatusForm")
    public String addStatus(Status status) {
        return "addStatusPage";
    }

    @PostMapping("/addStatus")
    public String saveStatus(Status status, Model model) {
        statusRepositoryService.save(status);
        model.addAttribute("message", "Record insert successfully...");
        List<Status> list = statusRepositoryService.findAll();
        model.addAttribute("data", list);
        return "addStatusPage";
    }

    @GetMapping("/allStatuses")
    public String listStatus(Model model) {
        List<Status> list = statusRepositoryService.findAll();
        model.addAttribute("data", list);
        return "allStatusesPage";
    }

    @GetMapping("/addLanguageForm")
    public String addLanguage() {
        return "addLanguagePage";
    }

    @PostMapping("/addLanguage")
    public String saveLanguage(Language language, Model model) {
        languageRepositoryService.save(language);
        model.addAttribute("message", "Record insert successfully...");
        List<Language> list = languageRepositoryService.findAll();
        model.addAttribute("data", list);
        return "addLanguagePage";
    }

    @GetMapping("/allLanguages")
    public String listLanguage(Model model) {
        List<Language> list = languageRepositoryService.findAll();
        model.addAttribute("data", list);
        return "allLanguagesPage";
    }

    @GetMapping("/addExitDayFrom")
    public String addExitDay(ExitDay exitDay) {
        return "addExitDayPage";
    }

    @PostMapping("/addExitDay")
    public String saveExitDay(ExitDay exitDay, Model model) {
        exitDayRepositoryService.save(exitDay);
        model.addAttribute("message", "Record insert successfully...");
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
}
