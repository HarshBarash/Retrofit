package harshbarash.github.retrofit

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import harshbarash.github.retrofit.model.Job
import harshbarash.github.retrofit.model.Post
import harshbarash.github.retrofit.model.User
import harshbarash.github.retrofit.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response
import retrofit2.http.OPTIONS

class MainViewModel(private val repository: Repository): ViewModel() {


    val myResponse: MutableLiveData<Response<Post>> = MutableLiveData()
    val myResponse2: MutableLiveData<Response<Post>> = MutableLiveData()
    val myCustomPosts: MutableLiveData<Response<List<Post>>> = MutableLiveData()
    val myCustomPosts2: MutableLiveData<Response<List<Post>>> = MutableLiveData()


    val Response: MutableLiveData<Response<Job>> = MutableLiveData()
    val Response2: MutableLiveData<Response<Job>> = MutableLiveData()
    val CustomJobs: MutableLiveData<Response<List<Job>>> = MutableLiveData()
    val CustomJobs2: MutableLiveData<Response<List<Job>>> = MutableLiveData()

    val Posts: MutableLiveData<Response<List<Post>>> = MutableLiveData()
    val Jobs: MutableLiveData<Response<List<Job>>> = MutableLiveData()
    val Users: MutableLiveData<Response<List<User>>> = MutableLiveData()


    val ResponseUser: MutableLiveData<Response<User>> = MutableLiveData()
    val Response2User: MutableLiveData<Response<User>> = MutableLiveData()
    val CustomUsers2: MutableLiveData<Response<List<User>>> = MutableLiveData()


    val SignInUsers: MutableLiveData<Response<User>> = MutableLiveData()

    //Json PlaceHolder Posts

//    fun pushPost(post: Post) {
//        viewModelScope.launch {
//            val response = repository.pushPost(post)
//            myResponse.value = response
//        }
//    }
//
//    fun pushPost2(userId: Int, id: Int, title: String, body: String) {
//        viewModelScope.launch {
//            val response = repository.pushPost2(userId, id, title, body)
//            myResponse.value = response
//        }
//    }
//
//    //dynamic
//    fun getPost(auth: String) {
//        viewModelScope.launch {
//            val  response = repository.getPost(auth)
//            myResponse.value = response
//        }
//    }
//
//    fun getPost2(number: Int) {
//        viewModelScope.launch {
//            val response = repository.getPost2(number)
//            myResponse2.value = response
//
//        }
//    }
//
//    fun getCustomPosts(userId: Int, sort: String, order: String) {
//        viewModelScope.launch {
//            val response = repository.getCustomPosts(userId, sort, order)
//            myCustomPosts.value = response
//        }
//    }
//
//    fun getCustomPosts2(userId: Int, options: Map<String, String>) {
//        viewModelScope.launch {
//            val response = repository.getCustomPosts2(userId, options)
//            myCustomPosts2.value = response
//        }
//    }
//
//    fun getPosts(sort: String, order: String) {
//        viewModelScope.launch {
//            val response = repository.getPosts(sort, order)
//            Posts.value = response
//        }
//    }

    //Rails Jobs

    fun pushJob(job: Job) {
        viewModelScope.launch {
            val response = repository.pushJob(job)
            Response.value = response
        }
    }

    fun pushJob2(id: Int, company: String,  position: String, description: String) {
        viewModelScope.launch {
            val response = repository.pushJob2(id, company, position, description)
            Response.value = response
        }
    }

//    dynamic
    fun getJob(auth: String) {
        viewModelScope.launch {
            val  response = repository.getJob(auth)
            Response.value = response
        }
    }

    fun getJob2(number: Int) {
        viewModelScope.launch {
            val response = repository.getJob2(number)
            Response2.value = response

        }
    }

    fun getCustomJobs(id: Int, sort: String, order: String) {
        viewModelScope.launch {
            val response = repository.getCustomJobs(id, sort, order)
            CustomJobs.value = response
        }
    }

    fun getCustomJobs2(id: Int, options: Map<String, String>) {
        viewModelScope.launch {
            val response = repository.getCustomJobs2(id, options)
            CustomJobs2.value = response
        }
    }

    fun getJobs(sort: String, order: String) {
        viewModelScope.launch {
            val response = repository.getJobs(sort, order)
            Jobs.value = response
        }
    }


    //devise

    fun pushSignIn(user: User) {
        viewModelScope.launch {
            val response = repository.pushSignIn(user)
            ResponseUser.value = response
        }
    }

    fun pushSignUp(user: User) {
        viewModelScope.launch {
            val response = repository.pushSignUp(user)
            ResponseUser.value = response
        }
    }


        fun pushSIgnUp2(email: String, encrypted_password: String, name: String) {
        viewModelScope.launch {
            val response = repository.pushSignUp2(email, encrypted_password, name)
            ResponseUser.value = response
        }
    }



}