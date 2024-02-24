package com.example.assginment.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.assginment.R
import com.example.assginment.adapters.FiltersAdapter
import com.example.assginment.adapters.OffersAdapter
import com.example.assginment.adapters.PopularMealsAdapter
import com.example.assginment.databinding.FragmentHomeBinding
import com.example.assginment.models.Filter
import com.example.assginment.models.Offers
import com.example.assginment.models.PopularMeal
import com.example.assginment.utils.Constants

class HomeFragment : Fragment() {

    private val TAG= "HomeFragment"

    private lateinit var binding: FragmentHomeBinding
    private lateinit var popularMealsAdapter: PopularMealsAdapter
    private lateinit var rvPopularMeals: RecyclerView
    private lateinit var filtersAdapter: FiltersAdapter
    lateinit var rvfilters: RecyclerView
    private lateinit var offersAdapter: OffersAdapter
    private lateinit var rvOffers: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpViews()
        setUpFiltersRV()
        setUpPopularMealsRV()
        setUPOffers()
    }

    private fun setUpViews(){

        rvfilters= binding.iFilter.rvFilters
        rvPopularMeals= binding.iPopularMeals.rvPopularMeals
        rvOffers= binding.iOffersJustForYou.rvOffersJustForYou

        binding.iSubscriptions.llcLunch.setOnClickListener{

            findNavController().navigate(R.id.action_homeFragment_to_lunchFragment)
        }

        binding.iSubscriptions.llcBreakfast.setOnClickListener {
            Toast.makeText(requireContext(), getText(R.string.breakfast), Toast.LENGTH_LONG).show()
        }

        binding.iSubscriptions.llcDinner.setOnClickListener {
            Toast.makeText(requireContext(), getText(R.string.dinner), Toast.LENGTH_LONG).show()
        }

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

    private fun setUpPopularMealsRV(){

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

    private fun setUPOffers(){

        offersAdapter= OffersAdapter(Constants.offers.getList())
        rvOffers.isVisible= true

        rvOffers.apply {
            layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
            adapter = offersAdapter
        }

        offersAdapter.setOnClickListener(object : OffersAdapter.OnClickListener{
            override fun onCLick(position: Int, model: Offers) {
                Toast.makeText(requireContext(), model.images.toString(), Toast.LENGTH_LONG).show()
            }

        })
    }
}