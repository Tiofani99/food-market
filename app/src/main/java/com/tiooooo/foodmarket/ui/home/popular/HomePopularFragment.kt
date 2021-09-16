package com.tiooooo.foodmarket.ui.home.popular

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.tiooooo.foodmarket.R
import com.tiooooo.foodmarket.databinding.FragmentHomeNewTasteBinding
import com.tiooooo.foodmarket.databinding.FragmentHomePopularBinding
import com.tiooooo.foodmarket.model.dummy.HomeVerticalModel
import com.tiooooo.foodmarket.ui.home.newtaste.HomeNewTasteAdapter
import com.tiooooo.foodmarket.utils.Helper


class HomePopularFragment :Fragment(), HomeNewTasteAdapter.ItemAdapterCallBack {

    private var _binding : FragmentHomePopularBinding? = null
    private val binding get() = _binding!!
    private var foodList: ArrayList<HomeVerticalModel> = ArrayList()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomePopularBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Helper.initDataDummy(foodList)
        val homeNewTasteAdapter = HomeNewTasteAdapter(foodList,this)
        with(binding.rvPopular){
            layoutManager = LinearLayoutManager(requireActivity())
            adapter = homeNewTasteAdapter
        }
    }

    override fun onClick(v: View, data: HomeVerticalModel) {

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}