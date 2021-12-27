package harshbarash.github.retrofit.repository

import harshbarash.github.retrofit.api.RetrofitInstance
import harshbarash.github.retrofit.model.Job
import harshbarash.github.retrofit.model.Post
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.OPTIONS
import java.nio.ByteOrder

class Repository {

    //JSON PlaceHolder. Posts

    suspend fun getPost(auth: String): Response<Post> {
        return RetrofitInstance.api.getPost(auth)
    }

    suspend fun getPost2(number: Int): Response<Post> {
        return RetrofitInstance.api.getPost2(number)
    }

    suspend fun getCustomPosts(userId: Int, sort: String, order: String ): Response<List<Post>> {
        return RetrofitInstance.api.getCustomPosts(userId, sort, order)
    }

    suspend fun getCustomPosts2(userId: Int, options: Map<String, String>): Response<List<Post>> {
        return RetrofitInstance.api.getCustomPosts2(userId, options)
    }

    suspend fun pushPost(post: Post): Response<Post> {
        return RetrofitInstance.api.pushPost(post)
    }

    suspend fun pushPost2(userId: Int, id: Int, title: String, body: String): Response<Post> {
        return RetrofitInstance.api.pushPost2(userId, id, title, body)
    }

    suspend fun getPosts(sort: String, order: String ): Response<List<Post>> {
        return RetrofitInstance.api.getPosts(sort, order)
    }

    //Rails. Jobs

//    suspend fun getJob(auth: String): Response<Job> {
//        return RetrofitInstance.api.getJob(auth)
//    }
//
//    suspend fun getJob2(number: Int): Response<Job> {
//        return RetrofitInstance.api.getJob2(number)
//    }
//
//    suspend fun getCustomJobs(id: Int, sort: String, order: String ): Response<List<Job>> {
//        return RetrofitInstance.api.getCustomJobs(id, sort, order)
//    }
//
//    suspend fun getCustomJobs2(id: Int, options: Map<String, String>): Response<List<Job>> {
//        return RetrofitInstance.api.getCustomJobs2(id, options)
//    }
//
//    suspend fun pushJob(job: Job): Response<Job> {
//        return RetrofitInstance.api.pushJob(job)
//    }
//
//    suspend fun pushJob2(id: Int, company: String, position: String, description: String): Response<Job> {
//        return RetrofitInstance.api.pushJob2(id, company, position, description)
//    }
//
//    suspend fun getJobs(sort: String, order: String ): Response<List<Job>> {
//        return RetrofitInstance.api.getJobs(sort, order)
//    }

}