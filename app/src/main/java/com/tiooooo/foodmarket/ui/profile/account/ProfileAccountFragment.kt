package com.tiooooo.foodmarket.ui.profile.account

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tiooooo.foodmarket.R
import com.tiooooo.foodmarket.databinding.FragmentProfileAccountBinding
import com.tiooooo.foodmarket.model.dummy.ProfileMenuModel
import com.tiooooo.foodmarket.ui.profile.ProfileMenuAdapter
import com.tiooooo.foodmarket.utils.Helper


class ProfileAccountFragment : Fragment(), ProfileMenuAdapter.ItemAdapterCallBack {

    private var _binding: FragmentProfileAccountBinding ? = null
    private val binding get() = _binding!!
    private var menuAccountList: ArrayList<ProfileMenuModel> = ArrayList()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileAccountBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Helper.initDataMenuAccountDummy(menuAccountList)
        val menuAdapter = ProfileMenuAdapter(menuAccountList,this)
        binding.rvMenu.apply {
            layoutManager = LinearLayoutManager(requireActivity())
            adapter = menuAdapter
        }


    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onClick(v: View, data: ProfileMenuModel) {

    }


}