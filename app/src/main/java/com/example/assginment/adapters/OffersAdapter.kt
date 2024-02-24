package com.example.assginment.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assginment.databinding.OffersJustForYouItemBinding
import com.example.assginment.models.Offers

class OffersAdapter(private val items: List<Offers>): RecyclerView.Adapter<OffersAdapter.ViewHolder>() {

    private var onClickListener: OnClickListener?= null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(OffersJustForYouItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
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
        fun onCLick(position: Int, model: Offers)
    }

    class ViewHolder(private val itemBinding:OffersJustForYouItemBinding): RecyclerView.ViewHolder(itemBinding.root){
        fun bindItem(model: Offers){

            model.images?.let {
                try {
//                    Glide
//                        .with(itemBinding.root.context)
//                        .load(it)
//                        .fitCenter()
//                        .placeholder(R.drawable.place_holder)
//                        .into(itemBinding.ivSimilarApp)

                    itemBinding.ivOffersJustForYou.setImageResource(it)
                }catch (e: Exception){

//                    Timber.tag(TAG).e("An Error occurred: %s", e)
                }
            }
        }
    }
}