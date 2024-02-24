package com.example.assginment.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView
import com.example.assginment.databinding.PopularMealsItemBinding
import com.example.assginment.models.PopularMeal

class PopularMealsAdapter(private val context: Context, private val items: List<PopularMeal>): RecyclerView.Adapter<PopularMealsAdapter.ViewHolder>() {

    private var onClickListener: OnClickListener?= null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(PopularMealsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
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
        fun onCLick(position: Int, model: PopularMeal)
    }

    class ViewHolder(private val itemBinding:PopularMealsItemBinding): RecyclerView.ViewHolder(itemBinding.root){
        fun bindItem(model: PopularMeal){

            model.image?.let {
                try {
//                    Glide
//                        .with(itemBinding.root.context)
//                        .load(it)
//                        .fitCenter()
//                        .placeholder(R.drawable.place_holder)
//                        .into(itemBinding.ivSimilarApp)

                    itemBinding.civPopularMeals.setImageResource(it)
                }catch (e: Exception){

//                    Timber.tag(TAG).e("An Error occurred: %s", e)
                }
            }

            model.name.let {
                itemBinding.tvPopularMealsName.text= it
            }
        }
    }
}