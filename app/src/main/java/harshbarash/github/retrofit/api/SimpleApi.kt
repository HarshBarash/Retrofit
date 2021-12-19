package harshbarash.github.retrofit.api

import harshbarash.github.retrofit.model.Post
import retrofit2.Response
import retrofit2.http.*

interface SimpleApi {
    @GET("posts/1")
    suspend fun getPost(): Response<Post>

    @GET("posts/{postNumber}")
    suspend fun getPost2(
        @Path("postNumber") number: Int
    ): Response<Post>

    @GET("posts")
    suspend fun getCustomPosts(
        @Query("userId") userId: Int,
        @Query("_sort") sort: String,
        @Query("_order") order: String
    ): Response<List<Post>>

    @GET("posts")
    suspend fun getCustomPosts2(
        @Query("userID") userId: Int,
        @QueryMap options: Map<String, String>
    ) : Response<List<Post>>
}