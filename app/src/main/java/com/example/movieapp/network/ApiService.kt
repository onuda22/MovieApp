package com.example.movieapp.network

import com.example.movieapp.model.GetMoviesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("discover/movie")
    fun getMoviesByGenre(
        @Query("api_key") apiKey: String = "61751efb816265243f345d4a734d0190",
        @Query("with_genres") genreId: String
    ): Call<GetMoviesResponse>

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "61751efb816265243f345d4a734d0190",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}