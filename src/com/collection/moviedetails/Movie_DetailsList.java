package com.collection.moviedetails;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Movie_DetailsList {
	
	public TreeSet<Movie_Details> movies=new TreeSet<>();
	int flag=0;
	
	public void add_movie(Movie_Details movie)
	{
		movies.add(movie);  //Add movie to Treeset
	}
	
	public void remove_movie(Movie_Details movie)
	{
		movies.remove(movie);  //Remove movie from Treeset
	}
	
	public void remove_AllMovies()
	{
		movies.removeAll(movies);  //Remove all movies from Treeset
	}
	
	public void find_movie_By_mov_Name(String movieName) //Find a movie with specified movie name
	{
		for(Movie_Details mov:movies) {
			if(mov.getMov_Name().equals(movieName)) {
				flag=1;
				System.out.println(mov);
			}	
		}
		if(flag==0)
			System.out.println("Movie with name "+movieName+" not found");
	}
	
	public void find_movie_By_Genre(String genre)  //Find a movie with specified genre
	{
		for(Movie_Details mov:movies) {
			if(mov.getGenre().equals(genre)) {
				flag=1;
				System.out.println(mov);
			}
		}	
		if(flag==0)
			System.out.println("Movie with genre "+genre+" not found");
	}
	
	//Sort movies based on parameter entered by user
	public void decide_sort(int choice) {
		ArrayList<Movie_Details> movieSetList= new ArrayList<>(movies);
		
		Comparator<Movie_Details> compareByMovieName = (movie1,movie2) -> movie1.getMov_Name().compareTo(movie2.getMov_Name());
		Comparator<Movie_Details> compareByLeadActor = (movie1,movie2) -> movie1.getLead_actor().compareTo(movie2.getLead_actor());
		Comparator<Movie_Details> compareByLeadActress = (movie1,movie2) -> movie1.getLead_actress().compareTo(movie2.getLead_actress());
		Comparator<Movie_Details> compareByGenre = (movie1,movie2) -> movie1.getGenre().compareTo(movie2.getGenre());
		
		switch(choice)
		{
		case 1: Collections.sort(movieSetList, compareByMovieName);
			    break;
		case 2: Collections.sort(movieSetList, compareByLeadActor);
				break;
		case 3: Collections.sort(movieSetList, compareByLeadActress);
				break;
		case 4: Collections.sort(movieSetList, compareByGenre);
				break;
		default:System.out.println("Invalid choice");
				break;
		}
	
	}
	
}
