package com.randi.myapplication.posts.api;

import com.randi.myapplication.posts.models.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
 // https://jsonplaceholder.typicode.com
public interface PostApi {
    @GET("/posts")
    Call<List<Post>> getPosts();

}
