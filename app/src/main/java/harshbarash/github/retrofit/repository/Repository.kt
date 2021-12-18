package harshbarash.github.retrofit.repository

import harshbarash.github.retrofit.api.RetrofitInstance
import harshbarash.github.retrofit.model.Post
import retrofit2.Response
import retrofit2.Retrofit
import java.nio.ByteOrder

class Repository {
    suspend fun getPost(): Response<Post> {
        return RetrofitInstance.api.getPost()
    }

    suspend fun getPost2(number: Int): Response<Post> {
        return RetrofitInstance.api.getPost2(number)
    }

    suspend fun getCustomsPosts(userId: Int, sort: String, order: String ): Response<List<Post>> {
        return RetrofitInstance.api.getCustomPosts(userId, sort, order)
    }

}