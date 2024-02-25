package com.example.assginment.utils

import com.example.assginment.R
import com.example.assginment.models.Filter
import com.example.assginment.models.MenuItem
import com.example.assginment.models.Offers
import com.example.assginment.models.PopularMeal
import com.example.assginment.models.Restaurant

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

    object menuLists{

        fun getList1(): ArrayList<MenuItem>{

            val list1= ArrayList<MenuItem>()
            val item1= MenuItem("Veg Thali", "59", "4.3", "79", "Dal + 5 Roti + Salad", true, R.drawable.food1)
            list1.add(item1)

            val item2= MenuItem("Non-Veg Thali", "95", "3.9", "97", "Gravy + 3 Nan + Salad", false, R.drawable.food2)
            list1.add(item2)

            val item3= MenuItem("Chole Bhature", "50", "4.6", "78", "Chole + 2 Bhature + Pickel", true, R.drawable.food3)
            list1.add(item3)

            val item4= MenuItem("Biryani", "89", "4.5", "765", "Biyani Bowl+ Salad", false, R.drawable.food4)
            list1.add(item4)

            val item5= MenuItem("Dosa", "40", "4.7", "755", "Sambar + 1 Dosa + Chutney", true, R.drawable.food5)
            list1.add(item5)

            val item6= MenuItem("Dal Fry", "50", "4.1", "76", "Dal + 4 Roti + Salad", true, R.drawable.food6)
            list1.add(item6)

            val item7= MenuItem("Chiken", "95", "3.8", "376", "2 Chiken piece+ 4 Nan + Salad", false, R.drawable.food7)
            list1.add(item7)

            val item8= MenuItem("Paneer", "87", "4.4", "543", "Paneer + 2 Roti + Onion", true, R.drawable.food8)
            list1.add(item8)

            return list1
        }

        fun getList2(): ArrayList<MenuItem>{

            val list1= ArrayList<MenuItem>()

            val item8= MenuItem("Paneer", "87", "4.4", "543", "Paneer + 2 Roti + Onion", true, R.drawable.food8)
            list1.add(item8)

            val item7= MenuItem("Chiken", "95", "3.8", "376", "2 Chiken piece+ 4 Nan + Salad", false, R.drawable.food7)
            list1.add(item7)

            val item1= MenuItem("Veg Thali", "59", "4.3", "79", "Dal + 5 Roti + Salad", true, R.drawable.food1)
            list1.add(item1)

            val item6= MenuItem("Dal Fry", "50", "4.1", "76", "Dal + 4 Roti + Salad", true, R.drawable.food6)
            list1.add(item6)

            val item2= MenuItem("Non-Veg Thali", "95", "3.9", "97", "Gravy + 3 Nan + Salad", false, R.drawable.food2)
            list1.add(item2)

            val item3= MenuItem("Chole Bhature", "50", "4.6", "78", "Chole + 2 Bhature + Pickel", true, R.drawable.food3)
            list1.add(item3)

            val item4= MenuItem("Biryani", "89", "4.5", "765", "Biyani Bowl+ Salad", false, R.drawable.food4)
            list1.add(item4)

            val item5= MenuItem("Dosa", "40", "4.7", "755", "Sambar + 1 Dosa + Chutney", true, R.drawable.food5)
            list1.add(item5)

            return list1
        }

        fun getList3(): ArrayList<MenuItem>{

            val list1= ArrayList<MenuItem>()

            val item2= MenuItem("Non-Veg Thali", "95", "3.9", "97", "Gravy + 3 Nan + Salad", false, R.drawable.food2)
            list1.add(item2)

            val item3= MenuItem("Chole Bhature", "50", "4.6", "78", "Chole + 2 Bhature + Pickel", true, R.drawable.food3)
            list1.add(item3)

            val item5= MenuItem("Dosa", "40", "4.7", "755", "Sambar + 1 Dosa + Chutney", true, R.drawable.food5)
            list1.add(item5)

            val item8= MenuItem("Paneer", "87", "4.4", "543", "Paneer + 2 Roti + Onion", true, R.drawable.food8)
            list1.add(item8)

            val item7= MenuItem("Chiken", "95", "3.8", "376", "2 Chiken piece+ 4 Nan + Salad", false, R.drawable.food7)
            list1.add(item7)

            val item1= MenuItem("Veg Thali", "59", "4.3", "79", "Dal + 5 Roti + Salad", true, R.drawable.food1)
            list1.add(item1)

            val item6= MenuItem("Dal Fry", "50", "4.1", "76", "Dal + 4 Roti + Salad", true, R.drawable.food6)
            list1.add(item6)

            val item4= MenuItem("Biryani", "89", "4.5", "765", "Biyani Bowl+ Salad", false, R.drawable.food4)
            list1.add(item4)

            return list1
        }
    }

    object restaurant{

        fun getList(): ArrayList<Restaurant>{

            val list= ArrayList<Restaurant>()
            val res1= Restaurant("Amar Restaurant", "4.1", "19 min", "1.3 km", "99", Constants.menuLists.getList1())
            list.add(res1)

            val res2= Restaurant("Anna Mess", "4.5", "10 min", "0.8 km", "69", Constants.menuLists.getList2())
            list.add(res2)

            val res3= Restaurant("Shyam Hotel", "3.9", "25 min", "1.8 km", "79", Constants.menuLists.getList3())
            list.add(res3)

            val res4= Restaurant("White Restaurant", "5.0", "6 min", "1.0 km", "999", Constants.menuLists.getList1())
            list.add(res4)

            val res5= Restaurant("Punjabi Mess", "4.5", "21 min", "1.8 km", "59", Constants.menuLists.getList2())
            list.add(res5)

            val res6= Restaurant("Sindh Hotel", "4.7", "30 min", "3.1 km", "99", Constants.menuLists.getList3())
            list.add(res6)

            return list
        }
    }
}