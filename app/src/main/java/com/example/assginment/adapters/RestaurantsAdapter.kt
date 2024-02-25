package com.example.assginment.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assginment.databinding.PopularMealsItemBinding
import com.example.assginment.databinding.ResturantsItemBinding
import com.example.assginment.models.PopularMeal
import com.example.assginment.models.Restaurant

class RestaurantsAdapter(private val items: List<Restaurant>): RecyclerView.Adapter<RestaurantsAdapter.ViewHolder>() {

    private var onClickListener: OnClickListener?= null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ResturantsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item= items.get(position)
        holder.bindItem(item)

        holder.itemView.setOnClickListener{
            if(onClickListener!= null)
            {
                onClickListener!!.onCLick(position, item)
            }
        }

    }


    fun setOnClickListener(onClickListener: OnClickListener) {
        this.onClickListener = onClickListener
    }

    interface OnClickListener{
        fun onCLick(position: Int, model: Restaurant)
    }

    class ViewHolder(private val itemBinding:ResturantsItemBinding): RecyclerView.ViewHolder(itemBinding.root){
        fun bindItem(model: Restaurant){

            model.name.let {
                itemBinding.tvRestaurantName.text= it
            }

            model.rating.let {
                itemBinding.tvRating.text= it
            }

            model.time.let {
                itemBinding.tvTime.text= it
            }

            model.distance.let {
                itemBinding.tvDistance.text= it
            }

            model.startsFrom.let {
                itemBinding.tvRupees.text= it
            }
        }
    }
}