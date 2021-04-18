package com.usatoday.usaToday.Services;

import com.usatoday.usaToday.Dao.VideosDao;
import com.usatoday.usaToday.Entity.Videos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VideoServiceImpl implements VideoService{

    @Autowired
    private VideosDao videosDao;

    @Override
    @Transactional
    public Iterable<Videos> findAllVideos() {
        return videosDao.findAll();
    }
}
