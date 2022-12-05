package ed.maevski.p23_itogi.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hannesdorfmann.adapterdelegates4.AbsListItemAdapterDelegate
import ed.maevski.p23_itogi.databinding.ItemAdBinding
import ed.maevski.p23_itogi.model.Ad
import ed.maevski.p23_itogi.model.Item

class AdDelegateAdapter : AbsListItemAdapterDelegate<Ad, Item, AdDelegateAdapter.ViewHolder>() {
    class ViewHolder(binding: ItemAdBinding): RecyclerView.ViewHolder(binding.root) {
        val textTitle = binding.title
        val textContent = binding.content
    }

    override fun isForViewType(item: Item, items: MutableList<Item>, position: Int): Boolean {
       return item is Ad
    }

    override fun onCreateViewHolder(parent: ViewGroup): ViewHolder {
        return ViewHolder(ItemAdBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(item: Ad, holder: ViewHolder, payloads: MutableList<Any>) {
        holder.textTitle.text = item.title
        holder.textContent.text = item.content
    }
}