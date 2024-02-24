package com.example.assginment.utils

import com.example.assginment.R
import com.example.assginment.models.Filter
import com.example.assginment.models.Offers
import com.example.assginment.models.PopularMeal

object Constants {

    object popualMeals{

        fun getList(): ArrayList<PopularMeal>{

            val list: ArrayList<PopularMeal> = ArrayList()
            val meal1 = PopularMeal("Veg Thali", R.drawable.food5)
            list.add(meal1)

            val meal2 = PopularMeal("Chiken Thali", R.drawable.food6)
            list.add(meal2)

            val meal3 = PopularMeal("Nonveg", R.drawable.food7)
            list.add(meal3)

            val meal4 = PopularMeal("Soya Chap", R.drawable.food8)
            list.add(meal4)

            val meal5 = PopularMeal("Polao", R.drawable.food4)
            list.add(meal5)

            val meal6 = PopularMeal("Chole Bhature", R.drawable.food3)
            list.add(meal6)

            val meal7 = PopularMeal("Chole Rice", R.drawable.food2)
            list.add(meal7)

            val meal8 = PopularMeal("Fried Rice", R.drawable.food1)
            list.add(meal8)

            return list
        }
    }

    object offers{

        fun getList(): ArrayList<Offers>{

            val list: ArrayList<Offers> = ArrayList()
            val offer1 = Offers(R.drawable.offer2)
            list.add(offer1)

            val offer2 = Offers(R.drawable.offer1)
            list.add(offer2)

            val offer3 = Offers(R.drawable.offer2)
            list.add(offer3)

            return list
        }
    }

    object filters{

        fun getList(): ArrayList<Filter>{

            val list: ArrayList<Filter> = ArrayList()
            val filter1 = Filter("Sort by", true)
            list.add(filter1)

            val filter2 = Filter("Veg")
            list.add(filter2)

            val filter3 = Filter("Non Veg")
            list.add(filter3)

            val filter4 = Filter("4+ Rating")
            list.add(filter4)

            val filter5 = Filter("Under Rs 100")
            list.add(filter5)

            val filter6 = Filter("Popular")
            list.add(filter6)

            val filter7 = Filter("Trending")
            list.add(filter7)

            return list
        }
    }
}