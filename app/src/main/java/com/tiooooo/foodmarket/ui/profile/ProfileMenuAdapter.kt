package com.tiooooo.foodmarket.ui.profile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.tiooooo.foodmarket.databinding.ItemHomeHorizontalBinding
import com.tiooooo.foodmarket.databinding.ItemMenuProfileBinding
import com.tiooooo.foodmarket.model.dummy.HomeModel
import com.tiooooo.foodmarket.model.dummy.ProfileMenuModel

class ProfileMenuAdapter(
    private val listData: List<ProfileMenuModel>,
    private val itemAdapterCallback: ItemAdapterCallBack
) : RecyclerView.Adapter<ProfileMenuAdapter.HomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        return HomeViewHolder(
            ItemMenuProfileBinding.inflate(
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

    class HomeViewHolder(private val binding: ItemMenuProfileBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: ProfileMenuModel, itemAdapterCallBack: ItemAdapterCallBack) {
            itemView.apply {
                with(binding) {
                    tvTitle.text = data.title
                }

                setOnClickListener {
                    itemAdapterCallBack.onClick(it, data)
                }
            }
        }
    }

    interface ItemAdapterCallBack {
        fun onClick(v: View, data: ProfileMenuModel)
    }
}