package com.usatoday.usaToday.Services;

import com.usatoday.usaToday.Dao.NewsDao;
import com.usatoday.usaToday.Entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    NewsDao newsDao;

    @Override
    @Transactional
    public Iterable<News> getAllNews() {
        return newsDao.getAllNews();
    }

    @Override
    public Iterable<News> getAllSavedNews() {
        return newsDao.getAllSavedNews();
    }

    @Override
    @Transactional
    public Iterable<News> getPopularNews() {
        return newsDao.getPopularNews();
    }

    @Override
    @Transactional
    public Iterable<News> getAllOlympicNews() {
        return newsDao.getAllOlympicNews();
    }

    @Override
    @Transactional
    public Iterable<News> getAllMoviesNews() {
        return newsDao.getAllMoviesNews();
    }

    @Override
    @Transactional
    public Iterable<News> getAllFinanceNews() {
        return newsDao.getAllFinanceNews();
    }

    @Override
    @Transactional
    public Iterable<News> getAllTechNews() {
        return newsDao.getAllTechNews();
    }

    @Override
    @Transactional
    public Iterable<News> getAllDestinationNews() {
        return newsDao.getAllDestinationNews();
    }

    @Override
    @Transactional
    public Iterable<News> getAllAirlineNews() {
        return newsDao.getAllAirlineNews();
    }

    @Override
    @Transactional
    public Iterable<News> getMyTopics() {
        return newsDao.getMyTopics();
    }

    @Override
    @Transactional
    public void saveNews(News news) {
        newsDao.save(new News(news.getSubCatId(), news.getReporterId(), news.getRanking(), news.getHeading(),
                news.getImg(), news.getVid(), news.getDesc(), news.getTime()));
    }
}
