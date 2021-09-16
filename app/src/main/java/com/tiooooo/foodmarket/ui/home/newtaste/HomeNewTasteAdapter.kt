package com.tiooooo.foodmarket.ui.home.newtaste

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.tiooooo.foodmarket.databinding.ItemHomeHorizontalBinding
import com.tiooooo.foodmarket.databinding.ItemHomeVerticalBinding
import com.tiooooo.foodmarket.model.dummy.HomeModel
import com.tiooooo.foodmarket.model.dummy.HomeVerticalModel
import com.tiooooo.foodmarket.utils.Helper.formatPrice

class HomeNewTasteAdapter(
    private val listData: List<HomeVerticalModel>,
    private val itemAdapterCallback: ItemAdapterCallBack
) : RecyclerView.Adapter<HomeNewTasteAdapter.HomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        return HomeViewHolder(
            ItemHomeVerticalBinding.inflate(
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

    class HomeViewHolder(private val binding: ItemHomeVerticalBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: HomeVerticalModel, itemAdapterCallBack: ItemAdapterCallBack) {
            itemView.apply {
                with(binding) {
                    tvTitle.text = data.title
                    tvPrice.formatPrice(data.price)
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
        fun onClick(v: View, data: HomeVerticalModel)
    }
}