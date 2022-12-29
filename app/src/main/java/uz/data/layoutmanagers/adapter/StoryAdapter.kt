package uz.data.layoutmanagers.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.data.layoutmanagers.R
import uz.data.layoutmanagers.model.Story

class StoryAdapter(val list: ArrayList<Story>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_story, parent, false)
        return StoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val story = list[position]
        if (holder is StoryViewHolder) {
            holder.apply {
                image.setImageResource(story.image)
                name.text = story.name
            }
        }
    }

    override fun getItemCount() = list.size

    class StoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image = view.findViewById<ImageView>(R.id.iv_story)
        val name = view.findViewById<TextView>(R.id.tv_name)
    }


}