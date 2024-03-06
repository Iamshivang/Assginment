package com.example.assginment.adapters

import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.assginment.R
import com.example.assginment.databinding.QuickGrabItemBinding
import com.example.assginment.models.QuickGrabItem

class QuickGrabAdapter(private val items: List<QuickGrabItem>): RecyclerView.Adapter<QuickGrabAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(QuickGrabItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item= items.get(position)
        holder.bindItem(item, position)

    }

    class ViewHolder(private val itemBinding:QuickGrabItemBinding): RecyclerView.ViewHolder(itemBinding.root){
        fun bindItem(model: QuickGrabItem,position: Int){

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

            val startColor:Int
            val context = itemBinding.root.context


            if(position%2== 0){
                startColor = ContextCompat.getColor(context, R.color.c1)
            }else{
                startColor = ContextCompat.getColor(context, R.color.c2)
            }
            val endColor = ContextCompat.getColor(context, R.color.c0)
            var cornerRadius = context.resources.getDimension(R.dimen.grab_item_radius)

            val gradientDrawable = GradientDrawable().apply {

                colors = intArrayOf(startColor, endColor)
                orientation = GradientDrawable.Orientation.TOP_BOTTOM
                this.cornerRadius = cornerRadius
            }
            itemBinding.llQuickGrab.background = gradientDrawable

        }
    }
}