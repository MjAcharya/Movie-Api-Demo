package io.javabrains.movieinfoservice.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.movieinfoservice.models.ErroDisplay;
import io.javabrains.movieinfoservice.models.OmdbSummary;
import io.javabrains.movieservice.OmdbMovieService;
import io.javabrains.movieservice.YoutubeMovieTrailerService;

@RestController
@RequestMapping("/movies")
public class MovieResource {

    @Autowired
    private YoutubeMovieTrailerService youtubeService;
    
    @Autowired
    private OmdbMovieService omdbMovieService;

 

    @SuppressWarnings("unchecked")
	@RequestMapping(value="/search", method = RequestMethod.POST)
	public <T> List<T> getMovieInfo(@RequestParam(value = "title") String title) {

		OmdbSummary omdb = omdbMovieService.findMovieByTitle(title);
		if (null != omdb && omdb.getTitle() != null)
			return (List<T>) youtubeService.findMovieTrailerInfo(omdb);
		ErroDisplay error = new ErroDisplay("Movie Not Found.");
		List<ErroDisplay> errList= new ArrayList<>();
		errList.add(error);
		return (List<T>) errList;
	}

}
