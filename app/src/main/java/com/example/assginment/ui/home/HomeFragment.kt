package com.example.assginment.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.assginment.adapters.FiltersAdapter
import com.example.assginment.adapters.PopularMealsAdapter
import com.example.assginment.databinding.FragmentHomeBinding
import com.example.assginment.models.Filter
import com.example.assginment.models.PopularMeal
import com.example.assginment.utils.Constants

class HomeFragment : Fragment() {

    private val TAG= "HomeFragment"

    private lateinit var binding: FragmentHomeBinding
    private lateinit var popularMealsAdapter: PopularMealsAdapter
    lateinit var rvPopularMeals: RecyclerView
    private lateinit var filtersAdapter: FiltersAdapter
    lateinit var rvfilters: RecyclerView
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

        rvfilters= binding.iFilter.rvFilters
        rvPopularMeals= binding.iPopularMeals.rvPopularMeals
        setUpFiltersRV()
        setUpPopulalMealsRV()
    }

    private fun setUpFiltersRV(){

        filtersAdapter= FiltersAdapter(Constants.filters.getList())
        rvPopularMeals.isVisible= true

        rvfilters.apply {
            layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
            adapter = filtersAdapter
        }

        filtersAdapter.setOnClickListener(object : FiltersAdapter.OnClickListener{
            override fun onCLick(position: Int, model: Filter) {
                Toast.makeText(requireContext(), model.name, Toast.LENGTH_LONG).show()
                binding.iActionbar.etSearchBar.setText(model.name)
            }

        })
    }

    private fun setUpPopulalMealsRV(){

        popularMealsAdapter= PopularMealsAdapter(Constants.popualMeals.getList())
        rvPopularMeals.isVisible= true

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