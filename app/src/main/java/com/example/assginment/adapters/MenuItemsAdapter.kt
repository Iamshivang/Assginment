package com.example.assginment.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.assginment.databinding.PopularMealsItemBinding
import com.example.assginment.databinding.ResturantMenuItemBinding
import com.example.assginment.databinding.ResturantsItemBinding
import com.example.assginment.models.MenuItem
import com.example.assginment.models.PopularMeal
import com.example.assginment.models.Restaurant

class MenuItemsAdapter(private val items: List<MenuItem>): RecyclerView.Adapter<MenuItemsAdapter.ViewHolder>() {

    private var onClickListener: OnClickListener?= null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ResturantMenuItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
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
        fun onCLick(position: Int, model: MenuItem)
    }

    class ViewHolder(private val itemBinding:ResturantMenuItemBinding): RecyclerView.ViewHolder(itemBinding.root){
        fun bindItem(model: MenuItem){

            model.name.let {
                itemBinding.tvMenuItemName.text= it
            }

            model.content.let {
                itemBinding.tvFoodContents.text= it
            }

            model.price.let {
                itemBinding.tvPrice.text= it
            }

            model.rating.let {
                itemBinding.tvRating.text= it
            }

            model.reviews.let {
                itemBinding.tvReviews.text= it
            }

            model.image.let {
                itemBinding.ivFoodMenuItem.setImageResource(it)
            }

            model.isVeg.let {

                if(it){
                    itemBinding.ivVeg.isVisible= true
                    itemBinding.ivNonVeg.isVisible= false
                }else{

                    itemBinding.ivVeg.isVisible= false
                    itemBinding.ivNonVeg.isVisible= true
                }
            }
        }
    }
}