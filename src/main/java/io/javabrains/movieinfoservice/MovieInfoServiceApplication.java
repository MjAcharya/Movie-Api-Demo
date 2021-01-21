package io.javabrains.movieinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import io.javabrains.movieservice.OmdbMovieService;
import io.javabrains.movieservice.YoutubeMovieTrailerService;

@SpringBootApplication
public class MovieInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieInfoServiceApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public YoutubeMovieTrailerService getMovieTrailerService() {
		return new YoutubeMovieTrailerService();
	}
	
	@Bean
	public OmdbMovieService getOmdbMovieService() {
		return new OmdbMovieService();
	}
	 
}

