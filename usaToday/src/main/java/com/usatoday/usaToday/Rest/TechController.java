package com.usatoday.usaToday.Rest;

import com.usatoday.usaToday.Entity.News;
import com.usatoday.usaToday.Services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TechController {

    private NewsService newsService;

    public TechController(NewsService newsService) {
        this.newsService = newsService;
    }

    @Autowired


    @GetMapping("/tech")
    public Iterable<News> getAllTechNews() {
        return newsService.getAllTechNews();
    }

}
