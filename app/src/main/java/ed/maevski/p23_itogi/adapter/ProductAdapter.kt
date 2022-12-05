package ed.maevski.p23_itogi.adapter

import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter
import ed.maevski.p23_itogi.model.Item

class ProductAdapter() : ListDelegationAdapter<List<Item>>() {

    init {
        delegatesManager.addDelegate(ProductDelegateAdapter())
        delegatesManager.addDelegate(AdDelegateAdapter())
    }

    override fun setItems(items: List<Item>?) {
        super.setItems(items)
        notifyDataSetChanged()
    }
}