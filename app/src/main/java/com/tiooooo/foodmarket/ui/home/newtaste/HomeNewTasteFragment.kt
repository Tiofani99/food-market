package com.tiooooo.foodmarket.ui.home.newtaste

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.tiooooo.foodmarket.R
import com.tiooooo.foodmarket.databinding.FragmentHomeNewTasteBinding
import com.tiooooo.foodmarket.model.dummy.HomeModel
import com.tiooooo.foodmarket.model.dummy.HomeVerticalModel
import com.tiooooo.foodmarket.utils.Helper


class HomeNewTasteFragment : Fragment(), HomeNewTasteAdapter.ItemAdapterCallBack {

    private var _binding : FragmentHomeNewTasteBinding? = null
    private val binding get() = _binding!!
    private var foodList: ArrayList<HomeVerticalModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeNewTasteBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Helper.initDataDummy(foodList)
        val homeNewTasteAdapter = HomeNewTasteAdapter(foodList,this)
        with(binding.rvNewTaste){
            layoutManager = LinearLayoutManager(requireActivity())
            adapter = homeNewTasteAdapter
        }
    }



    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onClick(v: View, data: HomeVerticalModel) {

    }

}