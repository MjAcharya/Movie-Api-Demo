package io.javabrains.movieinfoservice.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OmdbSummary {

	@JsonProperty("Title")
	private String title;
	
	@JsonProperty("Year")
	private String year;
	
	@JsonProperty("Released")
	private String released;
	
	@JsonProperty("Director")
	private String director;
	
	@JsonProperty("Writer")
	private String writer;
	
	@JsonProperty("Actors")
	private String actors;
	
	@JsonProperty("Language")
	private String language;
	
	private String imdbRating;
	private String imdbVotes;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getReleased() {
		return released;
	}
	public void setReleased(String released) {
		this.released = released;
	}
	public String getImdbRating() {
		return imdbRating;
	}
	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}
	public String getImdbVotes() {
		return imdbVotes;
	}
	public void setImdbVotes(String imdbVotes) {
		this.imdbVotes = imdbVotes;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
}
