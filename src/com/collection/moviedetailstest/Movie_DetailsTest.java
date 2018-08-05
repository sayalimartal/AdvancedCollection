package com.collection.moviedetailstest;

import java.util.Scanner;

import com.collection.moviedetails.Movie_Details;
import com.collection.moviedetails.Movie_DetailsList;

public class Movie_DetailsTest {

	public static void main(String[] args) {
		
		Movie_DetailsList movieList=new Movie_DetailsList();
		Movie_Details movie=new Movie_Details("abcc","asd","dsft","cdfr");
		Movie_Details movie1=new Movie_Details("fvsdv","tfrgt","dsft","cythdfr");
		Movie_Details movie2=new Movie_Details("htn","bvtrf","dsft","cdfuyjr");
		Movie_Details movie3=new Movie_Details("abcgbuyc","utyh","dsft","cdfujiir");
		Movie_Details movie4=new Movie_Details("abcgbuycgh","bvtrf","dsft","cdfujiir");
		
		movieList.add_movie(movie);
		movieList.add_movie(movie1);
		movieList.add_movie(movie2);
		movieList.add_movie(movie3);
		movieList.add_movie(movie4);
		
		movieList.remove_movie(movie2);
		
		movieList.movies.stream().forEach(System.out::println);
		
		movieList.find_movie_By_Genre("cdfr");
		movieList.find_movie_By_mov_Name("htn");
		
		System.out.println("Enter number according to choice\n1: Sort by movie name\n2: Sort by lead actor\n3: Sort by lead actress\n4: Sort by genre");
		Scanner scanner =new Scanner(System.in);
		int choice=scanner.nextInt();
		movieList.decide_sort(choice);
		
		movieList.movies.stream().forEach(System.out::println);
	}

}
