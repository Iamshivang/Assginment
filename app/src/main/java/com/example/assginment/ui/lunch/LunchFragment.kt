package com.example.assginment.ui.lunch

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.assginment.adapters.FiltersAdapter
import com.example.assginment.adapters.RestaurantsAdapter
import com.example.assginment.databinding.FragmentLunchBinding
import com.example.assginment.models.Filter
import com.example.assginment.models.Restaurant
import com.example.assginment.utils.Constants
import io.bloco.faker.Faker

class LunchFragment : Fragment() {

    private val TAG= "LunchFragment"

    private lateinit var binding: FragmentLunchBinding
    private lateinit var filtersAdapter: FiltersAdapter
    private lateinit var rvfilters: RecyclerView
    private lateinit var restaurantsAdapter: RestaurantsAdapter
    private lateinit var rvRestaurants: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLunchBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val faker = Faker()
        val d1= faker.name.firstName()        // "Aaron"
        val d2= faker.company.name()          // "Hirthe-Ritchie"
        val d3= faker.address.countryCode()   // "PT"
        val d4= faker.commerce.price()        // "31.89"
        faker.internet.email()        // "eliza@mann.net"
        faker.lorem.sentence()        // "Dolore illum animi et neque accusantium."
        faker.number.number(10)       // "1968353479"
        faker.app.version()

        Log.e("d1", d1.toString())
        Log.e("d12", d2.toString())
        Log.e("d13", d3.toString())
        Log.e("d14", d4.toString())

        setUpViews()
        setUpFiltersRV()
        setUpRestaurantsRV()
    }

    private fun setUpViews(){

        rvfilters= binding.iFilter.rvFilters
        rvRestaurants= binding.rvRestaurants

        binding.iActionbar.ivBackArrow.setOnClickListener{
            requireActivity().onBackPressed()
        }
    }

    private fun setUpFiltersRV(){

        filtersAdapter= FiltersAdapter(Constants.filters.getList())
        rvfilters.isVisible= true

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

    private fun setUpRestaurantsRV(){

        restaurantsAdapter= RestaurantsAdapter(requireActivity(), Constants.restaurant.getList())
        rvRestaurants.isVisible= true

        rvRestaurants.apply {
            layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
            adapter = restaurantsAdapter
        }

        restaurantsAdapter.setOnClickListener(object : RestaurantsAdapter.OnClickListener{
            override fun onCLick(position: Int, model: Restaurant) {
                Toast.makeText(requireContext(), model.name, Toast.LENGTH_LONG).show()
            }
        })
    }
}