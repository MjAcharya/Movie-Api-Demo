package io.javabrains.movieservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.javabrains.movieinfoservice.models.Movie;
import io.javabrains.movieinfoservice.models.OmdbSummary;
import io.javabrains.movieinfoservice.models.Snippet;
import io.javabrains.movieinfoservice.models.YoutubeItems;
import io.javabrains.movieinfoservice.models.YoutubeSummary;

@Service
public class YoutubeMovieTrailerService {
	
	@Value("${api.key}")
    private String apiKey;
    
    @Value("${youtube.uri}")
    private String youtubeUri;
    
    @Value("${youtube.partValue}")
    private String partValue;
    
    @Value("${youtube.maxResult}")
    private int maxResult;

    @Autowired
    private RestTemplate restTemplate;
	
	public List<Movie> findMovieTrailerInfo(OmdbSummary omdb) {
		List<Movie> listOfMovies = new ArrayList<>();
        String searchValue = omdb.getTitle() + "-movie-trailer";
        String searchURI = String.format(youtubeUri,apiKey,partValue,maxResult,searchValue);
        YoutubeSummary movieSummary = restTemplate.getForObject(searchURI, YoutubeSummary.class);
        for(YoutubeItems items:movieSummary.getItems()) {
        	Snippet snippet = items.getSnippet();
            String videoId = items.getId().getVideoId();
            String trailerSource = "https://www.youtube.com/embed/%s?playlist=%s&loop=1";
            trailerSource = String.format(trailerSource, videoId, videoId);
            listOfMovies.add(new Movie(movieSummary.getRegionCode(), omdb,trailerSource));
        }

        return listOfMovies;
	}

}
