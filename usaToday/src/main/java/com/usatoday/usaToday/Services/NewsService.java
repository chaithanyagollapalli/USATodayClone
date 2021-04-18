package com.usatoday.usaToday.Services;

import com.usatoday.usaToday.Entity.News;

public interface NewsService {

    Iterable<News> getAllNews();

    Iterable<News> getAllSavedNews();

    Iterable<News> getPopularNews();

    Iterable<News> getAllOlympicNews();

    Iterable<News> getAllMoviesNews();

    Iterable<News> getAllFinanceNews();

    Iterable<News> getAllTechNews();

    Iterable<News> getAllDestinationNews();

    Iterable<News> getAllAirlineNews();

    Iterable<News> getMyTopics();

    void saveNews(News news);

}
