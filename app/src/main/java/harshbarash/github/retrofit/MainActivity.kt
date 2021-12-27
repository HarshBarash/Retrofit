package harshbarash.github.retrofit


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer

import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import harshbarash.github.retrofit.adapter.MyAdapter
import harshbarash.github.retrofit.databinding.ActivityMainBinding
import harshbarash.github.retrofit.model.Post
import harshbarash.github.retrofit.repository.Repository
class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private val myAdapter by lazy { MyAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()

        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory)[MainViewModel::class.java]




        //-------------------------JSON PlaceHolder Posts---------------------------
        //что стоит перед backlash, это комментаровано. OLD

        //dynamic control
        //viewModel.getPost("121")

                viewModel.getPosts("id", "desc")

                viewModel.Posts.observe(this, Observer { response ->
            if(response.isSuccessful){
                response.body()?.let { myAdapter.setData(it) }
        }
        })
    }

//        viewModel.pushPost2(2,2, "Title-test", "Body-test")

        //viewModel.getCustomPosts(2, "id", "desc")


//        viewModel.myCustomPosts.observe(this, Observer { response ->
//            if(response.isSuccessful){
//
//                Log.d("Main", response.body().toString())
//                Log.d("Main", response.code().toString())
//                Log.d("Main", response.message().toString())

                //response.body()?.let { myAdapter.setData(it) }
//        } else {
//            Toast.makeText(this, response.code(), Toast.LENGTH_SHORT).show()
//            }
//        })




        //-------------------------Rails Jobs ---------------------------
        //что стоит перед backlash, это комментаровано. OLD

        //dynamic control
        //viewModel.getPost("121")

//        viewModel.getJobs("id", "desc")

//        viewModel.pushJob2(2,"Junior", "Evrone", "They are the best. Ruby Life")



//        viewModel.Jobs.observe(this, Observer { response ->
//            if(response.isSuccessful){
//                response.body()?.let { myAdapter.setData(it) }
//        }
//        })
//    }

    private fun setupRecyclerView() {
        binding.RecyclerView.adapter = myAdapter
        binding.RecyclerView.layoutManager = LinearLayoutManager(this)
    }
}