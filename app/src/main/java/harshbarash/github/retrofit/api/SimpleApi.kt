package harshbarash.github.retrofit.api

import harshbarash.github.retrofit.model.Job
import harshbarash.github.retrofit.model.Post
import retrofit2.Response
import retrofit2.http.*

interface SimpleApi {


    //---------------------JSON PlaceHolder----------------//
    //control
//    @GET("posts/1")
//    suspend fun getPost(@Header("Auth") auth: String): Response<Post>
//
//    @GET("posts/{postNumber}")
//    suspend fun getPost2(
//        @Path("postNumber") number: Int
//    ): Response<Post>
//
//    @GET("posts")
//    suspend fun getCustomPosts(
//        @Query("userId") userId: Int,
//        @Query("_sort") sort: String,
//        @Query("_order") order: String
//    ): Response<List<Post>>
//
//    @GET("posts")
//    suspend fun getCustomPosts2(
//        @Query("userID") userId: Int,
//        @QueryMap options: Map<String, String>
//    ) : Response<List<Post>>
//
//    @POST("posts")
//    suspend fun pushPost(
//        @Body post: Post
//    ): Response<Post>
//
//    @FormUrlEncoded
//    @POST("posts")
//    suspend fun pushPost2(
//        @Field("userId") userId: Int,
//        @Field("id") id: Int,
//        @Field("title") title: String,
//        @Field("body") body: String
//    ): Response<Post>
//
//    @GET("posts")
//    suspend fun getPosts(
//    @Query("_sort") sort: String,
//    @Query("_order") order: String
//    ): Response<List<Post>>


    //---------------------Rails. localhost:3000--------------------------//

    @GET("/api/v1/jobs/1")
    suspend fun getJob(@Header("Auth") auth: String): Response<Job>

    @GET("/api/v1/jobs/{jobNumber}")
    suspend fun getJob2(
        @Path("jobNumber") number: Int
    ): Response<Job>

    @GET("/api/v1/jobs")
    suspend fun getCustomJobs(
        @Query("id") userId: Int,
        @Query("_sort") sort: String,
        @Query("_order") order: String
    ): Response<List<Job>>

    @GET("/api/v1/jobs")
    suspend fun getCustomJobs2(
        @Query("id") id: Int,
        @QueryMap options: Map<String, String>
    ) : Response<List<Job>>

    @POST("/api/v1/jobs")
    suspend fun pushJob(
        @Body job: Job
    ): Response<Job>

    @FormUrlEncoded
    @POST("/api/v1/jobs")
    suspend fun pushJob2(
        @Field("id") id: Int,
        @Field("company") company: String,
        @Field("position") position: String,
        @Field("description") description: String
    ): Response<Job>

    @GET("/api/v1/jobs")
    suspend fun getJobs(
    @Query("_sort") sort: String,
    @Query("_order") order: String
    ): Response<List<Job>>

}