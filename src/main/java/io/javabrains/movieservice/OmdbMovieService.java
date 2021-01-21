package io.javabrains.movieservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import io.javabrains.movieinfoservice.models.OmdbSummary;

@Service
public class OmdbMovieService {
	
	@Value("${omdb.key}")
    private String apiKey;

    @Value("${omdb.uri}")
    private String URI;

    @Autowired
    RestTemplate restTemplate;
    
    public OmdbSummary findMovieByTitle(String title) throws RestClientException {

        String searchURI = String.format(URI,apiKey,title);
        return restTemplate.getForObject(searchURI, OmdbSummary.class);
        
        
    }

}
