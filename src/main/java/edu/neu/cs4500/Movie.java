package edu.neu.cs4500;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String imdbId;
    private String title;
 
    public Movie() {}
 
    public Movie(String imdbId, String title) {
        this.imdbId = imdbId;
        this.title = title;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImdbId() {
		return imdbId;
	}

	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}