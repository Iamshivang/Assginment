package com.example.assginment.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.assginment.R
import com.example.assginment.adapters.PopularMealsAdapter
import com.example.assginment.databinding.FragmentHomeBinding
import com.example.assginment.models.PopularMeal
import com.example.assginment.utils.Constants

class HomeFragment : Fragment() {

    private val TAG= "HomeFragment"

    private lateinit var binding: FragmentHomeBinding
    private lateinit var popularMealsAdapter: PopularMealsAdapter
    lateinit var rvPopularMeals: RecyclerView
//    private lateinit var popularMealsAdapter: PopularMealsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpPopulalMealsRV()
    }

    private fun setUpPopulalMealsRV(){

        popularMealsAdapter= PopularMealsAdapter(requireContext(), Constants.popualMeals.getList())
        rvPopularMeals= binding.iPopularMeals.rvPopularMeals

        rvPopularMeals.apply {
            layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
            adapter = popularMealsAdapter
        }

        popularMealsAdapter.setOnClickListener(object : PopularMealsAdapter.OnClickListener{
            override fun onCLick(position: Int, model: PopularMeal) {
                Toast.makeText(requireContext(), model.name, Toast.LENGTH_LONG).show()
            }

        })
    }
}