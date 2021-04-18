package com.usatoday.usaToday.Dao;

import com.usatoday.usaToday.Entity.Videos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideosDao extends CrudRepository<Videos, Integer> {
}
