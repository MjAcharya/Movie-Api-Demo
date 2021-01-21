package io.javabrains.movieinfoservice.models;

public class Movie {
    private String regionCode;
    private String Title;
	private String Year;
	private String Released;
	private String Director;
	private String Writer;
	private String Actor;
	private String Language;
	private String imdbRating;
	private String imdbVotes;
    private String youtubeUrl;
    
    
	public Movie(String regionCode, OmdbSummary omdb, String youtubeUrl) {
		super();
		this.regionCode = regionCode;
		this.Title = omdb.getTitle();
		this.Year = omdb.getYear();
		this.Released = omdb.getReleased();
		this.Director = omdb.getDirector();
		this.Writer = omdb.getWriter();
		this.Actor = omdb.getActors();
		this.Language = omdb.getLanguage();
		this.imdbRating = omdb.getImdbRating();
		this.imdbVotes = omdb.getImdbVotes();
		this.youtubeUrl = youtubeUrl;
	}
	public String getRegionCode() {
		return regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}
	public String getReleased() {
		return Released;
	}
	public void setReleased(String released) {
		Released = released;
	}
	public String getDirector() {
		return Director;
	}
	public void setDirector(String director) {
		Director = director;
	}
	public String getWriter() {
		return Writer;
	}
	public void setWriter(String writer) {
		Writer = writer;
	}
	public String getActor() {
		return Actor;
	}
	public void setActor(String actor) {
		Actor = actor;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
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
	public String getYoutubeUrl() {
		return youtubeUrl;
	}
	public void setYoutubeUrl(String youtubeUrl) {
		this.youtubeUrl = youtubeUrl;
	}
	
}
