package harshbarash.github.retrofit.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import harshbarash.github.retrofit.databinding.ItemLayoutBinding
import harshbarash.github.retrofit.model.Job
import harshbarash.github.retrofit.model.Post

class MyAdapter: RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    //Placeholder
//    private var myList = emptyList<Post>()

    //Rails
    private var myList = emptyList<Job>()

    inner class MyViewHolder(val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root)

   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return myList.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = myList[position]
        // JSON PLACEHOLDER
//        holder.binding.userIdTxt.text = myList[position].userId.toString()
//        holder.binding.idTxt.text = myList[position].id.toString()
//        holder.binding.titleTxt.text = myList[position].title
//        holder.binding.bodyTxt.text = myList[position].body

        // Rails LOCALHOST:3000
        holder.binding.userIdTxt.text = myList[position].id.toString()
        holder.binding.idTxt.text = myList[position].company.toString()
        holder.binding.titleTxt.text = myList[position].position
        holder.binding.bodyTxt.text = myList[position].description

    }

    //Placeholder. Posts
//    fun setData(newList: List<Post>){
//        myList = newList
//        notifyDataSetChanged()
//    }

    //Rails Jobs
    fun setData(newList: List<Job>){
        myList = newList
        notifyDataSetChanged()
    }
}