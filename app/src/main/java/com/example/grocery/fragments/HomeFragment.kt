package com.example.grocery.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.grocery.ProductAdapter
import com.example.grocery.R
import com.example.grocery.data.products
import com.example.grocery.databinding.FragmentHomeBinding


class HomeFragment: Fragment(), View.OnClickListener {
    private lateinit var binding : FragmentHomeBinding
    private lateinit var navController: NavController
    private lateinit var viewModel: HomeViewModel
    companion object {
        fun newInstance() = HomeFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        binding.exclusiveRecycle.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        binding.exclusiveRecycle.adapter = ProductAdapter(products)

        binding.bestselling.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        binding.bestselling.adapter = ProductAdapter(products)

    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }


}