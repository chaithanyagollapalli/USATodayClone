package com.usatoday.usaToday.Rest;

import com.usatoday.usaToday.Entity.News;
import com.usatoday.usaToday.Services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoneyController {

    private NewsService newsService;

    @Autowired
    public MoneyController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/finance")
    public Iterable<News> getAllFinanceNews() {
        return newsService.getAllFinanceNews();
    }

}
