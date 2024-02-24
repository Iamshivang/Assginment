package com.example.assginment.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assginment.databinding.FiltersItemBinding
import com.example.assginment.models.Filter

class FiltersAdapter(private val items: List<Filter>): RecyclerView.Adapter<FiltersAdapter.ViewHolder>() {

    private var onClickListener: OnClickListener?= null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(FiltersItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
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
        fun onCLick(position: Int, model: Filter)
    }

    class ViewHolder(private val itemBinding:FiltersItemBinding): RecyclerView.ViewHolder(itemBinding.root){
        fun bindItem(model: Filter){

            model.isImage?.let {
                if(it){
                    itemBinding.ivDownArro.visibility= View.VISIBLE
                }else{
                    itemBinding.ivDownArro.visibility= View.GONE
                }
            }

            model.name.let {
                itemBinding.tvFilter.text= it
            }
        }
    }
}