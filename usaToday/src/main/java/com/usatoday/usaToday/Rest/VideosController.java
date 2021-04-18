package com.usatoday.usaToday.Rest;

import com.usatoday.usaToday.Entity.Videos;
import com.usatoday.usaToday.Services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideosController {

    private VideoService videoService;

    @Autowired
    public VideosController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping("/videos")
    public Iterable<Videos> getAllVideos(){
        return videoService.findAllVideos();
    }

}
