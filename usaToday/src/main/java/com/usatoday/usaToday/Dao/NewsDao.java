package com.usatoday.usaToday.Dao;

import com.usatoday.usaToday.Entity.News;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsDao extends CrudRepository<News, Integer> {

    @Query("select n from News as n order by id desc")
    Iterable<News> getAllNews();

    @Query("select n from News as n join Saved as s on s.newsId = n.id order by s.id asc")
    Iterable<News> getAllSavedNews();

    @Query("select n from News as n where ranking < 23")
    Iterable<News> getPopularNews();

    @Query("select n from News as n where subCatId = 2")
    Iterable<News> getAllOlympicNews();

    @Query("select n from News as n where subCatId = 9")
    Iterable<News> getAllMoviesNews();

    @Query("select n from News as n where subCatId = 13")
    Iterable<News> getAllFinanceNews();

    @Query("select n from News as n where subCatId = 20")
    Iterable<News> getAllTechNews();

    @Query("select n from News as n where subCatId = 21")
    Iterable<News> getAllDestinationNews();

    @Query("select n from News as n where subCatId = 22")
    Iterable<News> getAllAirlineNews();

    @Query("select n from News as n join MyTopics as mt on n.subCatId = mt.subCatId order by n.id asc")
    Iterable<News> getMyTopics();

}
