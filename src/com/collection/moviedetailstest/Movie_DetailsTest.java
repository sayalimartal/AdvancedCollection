package com.collection.moviedetailstest;

import java.util.Scanner;

import com.collection.moviedetails.Movie_Details;
import com.collection.moviedetails.Movie_DetailsList;

public class Movie_DetailsTest {

	public static void main(String[] args) {
		
		Movie_DetailsList movieList=new Movie_DetailsList();
		Movie_Details movie=new Movie_Details("Antman","Paul Rudd","Evangeline Lilly","Action");
		Movie_Details movie1=new Movie_Details("pqr","mno","jkl","comedy");
		Movie_Details movie2=new Movie_Details("stu","tuv","asd","Thriller");
		Movie_Details movie3=new Movie_Details("Conjuring","ab","abc","Horror");
		Movie_Details movie4=new Movie_Details("Summer","qwe","qwer","Fiction");
		
		movieList.add_movie(movie);    //add movies to the list
		movieList.add_movie(movie1);
		movieList.add_movie(movie2);
		movieList.add_movie(movie3);
		movieList.add_movie(movie4);
		
		movieList.remove_movie(movie2);  //Remove a movie from the list
		
		movieList.movies.stream().forEach(System.out::println);
		
		System.out.println("*********************************");
		movieList.find_movie_By_Genre("Fiction");
		System.out.println("*********************************");
		movieList.find_movie_By_mov_Name("Summer");
		
		System.out.println("Enter number according to choice\n1: Sort by movie name\n2: Sort by lead actor\n3: Sort by lead actress\n4: Sort by genre");
		Scanner scanner =new Scanner(System.in);
		int choice=scanner.nextInt();
		movieList.decide_sort(choice);  //Sort movies based on user entered parameter
		
		scanner.close();
		
		//List of sorted movie details
		System.out.println("List of sorted movie details is");
		movieList.movies.stream().forEach(System.out::println);
	}

}
