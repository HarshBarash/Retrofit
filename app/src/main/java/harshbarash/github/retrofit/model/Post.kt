package harshbarash.github.retrofit.model

import com.google.gson.annotations.SerializedName

data class Post (
//    @SerializedName("userId") для смены имени
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
        )

