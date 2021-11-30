package com.example.topnews.ui.listfragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.example.topnews.R
import com.example.topnews.databinding.ItemBinding
import com.example.topnews.domain.data.Results

class NewsListAdapter (private val listener: OnItemClickListener) : PagingDataAdapter<Results, NewsListAdapter.PhotoViewHolder>(PHOTO_COMPARATOR) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        val binding = ItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return PhotoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        val currentItem = getItem(position)

        if (currentItem != null) holder.bind(currentItem)
    }

    inner class PhotoViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.root.setOnClickListener {
                val position = bindingAdapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val item = getItem(position)
                    if (item != null) {
                        listener.onItemClick(item)
                    }
                }
            }
        }

        fun bind(results: Results) {
            binding.apply {
                Glide.with(itemView)
                    .load(results.multimedia?.firstOrNull()?.url)
                    .centerCrop()
                    .transition(DrawableTransitionOptions.withCrossFade())
                    .error(R.drawable.ic_baseline_error_outline_24)
                    .into(imageNews)

                val date = results.publishedDate?.substringBefore("T")
                val time = results.publishedDate?.substringAfter("T")
                val timeTask = time?.substringBefore("-")

                textHeadline.text = results.title
                textDate.text = date + " " + timeTask

            }
        }
    }
    interface OnItemClickListener {
        fun onItemClick(results: Results)
    }

    companion object {
        private val PHOTO_COMPARATOR = object : DiffUtil.ItemCallback <Results>() {
            override fun areItemsTheSame(oldItem: Results, newItem: Results): Boolean =
                oldItem.title == newItem.title

            override fun areContentsTheSame(
                oldItem: Results,
                newItem: Results
            ): Boolean = oldItem == newItem
        }
    }
}
