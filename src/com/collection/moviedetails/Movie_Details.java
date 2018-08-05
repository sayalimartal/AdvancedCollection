//Class with movie details
package com.collection.moviedetails;

public class Movie_Details implements Comparable<Movie_Details> {
	
	private String mov_Name;
	private String lead_actor;
	private String lead_actress;
	private String genre;
	
	public Movie_Details(String mov_Name, String lead_actor, String lead_actress, String genre) {
		super();
		this.mov_Name = mov_Name;
		this.lead_actor = lead_actor;
		this.lead_actress = lead_actress;
		this.genre = genre;
	}

	//Getters and setters
	public String getMov_Name() {
		return mov_Name;
	}
	
	public void setMov_Name(String mov_Name) {
		this.mov_Name = mov_Name;
	}
	
	public String getLead_actor() {
		return lead_actor;
	}
	
	public void setLead_actor(String lead_actor) {
		this.lead_actor = lead_actor;
	}
	
	public String getLead_actress() {
		return lead_actress;
	}
	
	public void setLead_actress(String lead_actress) {
		this.lead_actress = lead_actress;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	//Overriding equals and hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mov_Name == null) ? 0 : mov_Name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie_Details other = (Movie_Details) obj;
		if (mov_Name == null) {
			if (other.mov_Name != null)
				return false;
		} else if (!mov_Name.equals(other.mov_Name))
			return false;
		return true;
	}

	//Display movie details
	@Override
	public String toString() {
		return "Movie_Details [mov_Name=" + mov_Name + ", lead_actor=" + lead_actor + ", lead_actress=" + lead_actress
				+ ", genre=" + genre + "]";
	}

	//Compare movies by movie name
	@Override
	public int compareTo(Movie_Details movie) {
		return this.mov_Name.compareTo(movie.mov_Name);
	}

}
