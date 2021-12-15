package harshbarash.github.retrofit.api

import harshbarash.github.retrofit.model.Post
import retrofit2.Response
import retrofit2.http.GET

interface SimpleApi {
    @GET("posts/1")
    suspend fun getPost(): Response<Post>
}