package com.example.usatoday.views.viewholders;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class VideoViewHolder extends RecyclerView.ViewHolder {

    private final YouTubePlayerView youTubePlayerView;
    private YouTubePlayer youTubePlayer;
    private String currentVideoId;

    public VideoViewHolder(@NonNull YouTubePlayerView itemView) {
        super(itemView);

        youTubePlayerView = itemView;

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer initializedYouTubePlayer) {
                youTubePlayer = initializedYouTubePlayer;
                youTubePlayer.cueVideo(currentVideoId, 0);
            }
        });

    }

    public void setData(String videoId) {
        currentVideoId = videoId;

        if (youTubePlayer == null)
            return;

        youTubePlayer.cueVideo(videoId, 0);
    }

}
