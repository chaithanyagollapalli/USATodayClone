package com.usatoday.usaToday.Rest;

import com.usatoday.usaToday.Entity.News;
import com.usatoday.usaToday.Services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SportsController {

    private NewsService newsService;

    @Autowired
    public SportsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/olympics")
    public Iterable<News> getAllOlympicNews() {
        return newsService.getAllOlympicNews();
    }

}
