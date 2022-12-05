package ed.maevski.p23_itogi.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hannesdorfmann.adapterdelegates4.AbsListItemAdapterDelegate
import ed.maevski.p23_itogi.R
import ed.maevski.p23_itogi.databinding.ItemBinding
import ed.maevski.p23_itogi.model.Item
import ed.maevski.p23_itogi.model.Product

class ProductDelegateAdapter :
    AbsListItemAdapterDelegate<Product, Item, ProductDelegateAdapter.ViewHolder>() {
    class ViewHolder(binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val icon = binding.icon
        val textName = binding.textName
        val textDesc = binding.textDesc
    }

    override fun isForViewType(item: Item, items: MutableList<Item>, position: Int): Boolean {
        return item is Product
    }

    override fun onCreateViewHolder(parent: ViewGroup): ViewHolder {
        return ViewHolder(ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(item: Product, holder: ViewHolder, payloads: MutableList<Any>) {
        holder.icon.setImageResource(item.idIcon)
        holder.textName.text = item.name
        holder.textDesc.text = item.desc
    }
}