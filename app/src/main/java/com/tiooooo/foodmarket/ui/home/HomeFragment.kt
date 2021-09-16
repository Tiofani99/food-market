package com.tiooooo.foodmarket.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.tiooooo.foodmarket.R
import com.tiooooo.foodmarket.databinding.FragmentHomeBinding
import com.tiooooo.foodmarket.model.dummy.HomeModel
import com.tiooooo.foodmarket.ui.detail.DetailActivity


class HomeFragment : Fragment(),HomeAdapter.ItemAdapterCallBack {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private var foodList:ArrayList<HomeModel> = ArrayList()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initDataDummy()
        val homeAdapter = HomeAdapter(foodList,this)
        with(binding.recyclerView){
            layoutManager = LinearLayoutManager(requireActivity(),LinearLayoutManager.HORIZONTAL,false)
            adapter = homeAdapter
        }

        val sectionsPagerAdapter = SectionsPagerAdapter(childFragmentManager)
        binding.viewPager.adapter = sectionsPagerAdapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)


    }

    private fun initDataDummy(){
        foodList = ArrayList()
        foodList.add(HomeModel("Cherry Healthy","",5f))
        foodList.add(HomeModel("Burger Tamayo","",4f))
        foodList.add(HomeModel("Bakwan Healthy","",4.5f))
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onClick(v: View, data: HomeModel) {
        startActivity(Intent(requireActivity(),DetailActivity::class.java))
    }


}