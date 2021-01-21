package io.javabrains.movieinfoservice.models;

public class YoutubeItems {
	
	private VideoId id;
	private Snippet snippet;
	/**
	 * @return the id
	 */
	public VideoId getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(VideoId id) {
		this.id = id;
	}
	/**
	 * @return the snippet
	 */
	public Snippet getSnippet() {
		return snippet;
	}
	/**
	 * @param snippet the snippet to set
	 */
	public void setSnippet(Snippet snippet) {
		this.snippet = snippet;
	}
}
