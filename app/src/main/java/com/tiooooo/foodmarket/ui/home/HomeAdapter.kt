package com.tiooooo.foodmarket.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.tiooooo.foodmarket.databinding.ItemHomeHorizontalBinding
import com.tiooooo.foodmarket.model.dummy.HomeModel

class HomeAdapter(
    private val listData: List<HomeModel>,
    private val itemAdapterCallback: ItemAdapterCallBack
) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        return HomeViewHolder(
            ItemHomeHorizontalBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.bind(listData[position], itemAdapterCallback)
    }

    override fun getItemCount(): Int = listData.size

    class HomeViewHolder(private val binding: ItemHomeHorizontalBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: HomeModel, itemAdapterCallBack: ItemAdapterCallBack) {
            itemView.apply {
                with(binding) {
                    tvTitle.text = data.title
                    rbFood.rating = data.rating
//                    ivPoster.load(data.src) {
//                        crossfade(true)
//                    }
                }

                setOnClickListener {
                    itemAdapterCallBack.onClick(it, data)
                }
            }
        }
    }

    interface ItemAdapterCallBack {
        fun onClick(v: View, data: HomeModel)
    }
}