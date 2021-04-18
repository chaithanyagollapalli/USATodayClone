package com.usatoday.usaToday.Rest;

import com.usatoday.usaToday.Entity.News;
import com.usatoday.usaToday.Services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TravelController {

    private NewsService newsService;

    @Autowired
    public TravelController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/destination")
    public Iterable<News> getAllDestinationNews() {
        return newsService.getAllDestinationNews();
    }

    @GetMapping("/airline")
    public Iterable<News> getAllAirlineNews() {
        return newsService.getAllAirlineNews();
    }
}
