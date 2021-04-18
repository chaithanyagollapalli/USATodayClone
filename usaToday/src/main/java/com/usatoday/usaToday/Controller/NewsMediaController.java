package com.usatoday.usaToday.Controller;

import com.usatoday.usaToday.Entity.MyTopics;
import com.usatoday.usaToday.Entity.News;
import com.usatoday.usaToday.Entity.Saved;
import com.usatoday.usaToday.Entity.SubCategory;
import com.usatoday.usaToday.Services.MyTopicsService;
import com.usatoday.usaToday.Services.NewsService;
import com.usatoday.usaToday.Services.SavedService;
import com.usatoday.usaToday.Services.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NewsMediaController {

    private NewsService newsService;
    private MyTopicsService myTopicsService;
    private SubCategoryService subCategoryService;
    private SavedService savedService;

    @Autowired
    public NewsMediaController(NewsService newsService, MyTopicsService myTopicsService,
                               SubCategoryService subCategoryService, SavedService savedService) {
        this.newsService = newsService;
        this.myTopicsService = myTopicsService;
        this.subCategoryService = subCategoryService;
        this.savedService = savedService;
    }


    @GetMapping("/allsubcategory")
    public Iterable<SubCategory> findAllSubCategory() {
        return subCategoryService.findAllSubCategory();
    }

    @GetMapping("/popular")
    public Iterable<News> findPopularNews() {
        return newsService.getPopularNews();
    }

    @GetMapping("/allnews")
    public Iterable<News> findAllNews() {
        return newsService.getAllNews();
    }

    @GetMapping("/savednews")
    public Iterable<News> findAllSavedNews() {
        return newsService.getAllSavedNews();
    }

    @GetMapping("/mytopics")
    public Iterable<News> findMyTopics() {
        return newsService.getMyTopics();
    }

    @PostMapping("/savenews")
    public Iterable<News> saveNews(@RequestBody News news) {
        news.setId(0);
        newsService.saveNews(news);

        return newsService.getAllNews();
    }

    @PostMapping("/remove/{id}")
    public Iterable<News> deleteSavedNews(@PathVariable int id) {
        savedService.deleteById(id);
        return newsService.getAllSavedNews();
    }

    @PostMapping("/save/{id}")
    public Iterable<News> saved(@PathVariable int id) {
        savedService.saveNews(id);
        return newsService.getAllSavedNews();
    }

    @PostMapping("/savetopic/{id}")
    public String saveMyTopic(@PathVariable int id) {
        myTopicsService.saveId(id);
        return "Successfully saved";
    }

    @PostMapping("/deletetopic/{id}")
    public String deleteMyTopic(@PathVariable int id) {
        myTopicsService.deleteId(id);
        return "Deleted Successfully";
    }

    @DeleteMapping("/removeallsaved")
    public String removeAllSaved() {
        savedService.deleteAll();
        return "Deleted Successfully";
    }

}
