package ed.maevski.p23_itogi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import ed.maevski.p23_itogi.adapter.ProductAdapter
import ed.maevski.p23_itogi.databinding.ActivityMainBinding
import ed.maevski.p23_itogi.decoration.MyItemDecoration
import ed.maevski.p23_itogi.model.Ad
import ed.maevski.p23_itogi.model.Item
import ed.maevski.p23_itogi.model.Product

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = ProductAdapter()

        fun getItems(): ArrayList<Item> {
            return arrayListOf(
                Product(
                    0,
                    R.drawable.ic_apple,
                    "Apple",
                    "Juicy Apple fruit, which is eaten fresh, serves as a raw material in cooking and for making drinks."
                ),
                Ad("Акция", "Скидка на бананы 15%"),
                Product(
                    1,
                    R.drawable.ic_banana,
                    "Banana",
                    "It is one of the oldest food crops, and for tropical countries it is the most important food plant and the main export item."
                ),
                Product(
                    2,
                    R.drawable.ic_lemon,
                    "Lemon",
                    "Lemons are eaten fresh, and are also used in the manufacture of confectionery and soft drinks, in the liquor and perfume industry."
                ),
                Product(
                    3,
                    R.drawable.ic_pear,
                    "Pear",
                    "Under favorable conditions, the pear reaches a large size-up to 5-25 meters in height and 5 meters in diameter of the crown."
                ),
                Product(
                    4,
                    R.drawable.ic_strawberry,
                    "Strawberry",
                    "A perennial herbaceous plant 5-20 cm high, with a thick brown rhizome. \"Mustache\" is short. The stem is thin."
                ),
                Ad("Акция", "Товар недели - Груши"),
                Product(
                    5,
                    R.drawable.ic_pear,
                    "Pear",
                    "Under favorable conditions, the pear reaches a large size-up to 5-25 meters in height and 5 meters in diameter of the crown."
                ),
                Product(
                    6,
                    R.drawable.ic_pear,
                    "Pear",
                    "Under favorable conditions, the pear reaches a large size-up to 5-25 meters in height and 5 meters in diameter of the crown."
                ),
                Product(
                    7,
                    R.drawable.ic_pear,
                    "Pear",
                    "Under favorable conditions, the pear reaches a large size-up to 5-25 meters in height and 5 meters in diameter of the crown."
                ),
                Product(
                    8,
                    R.drawable.ic_orange,
                    "Orange",
                    "Orange juice is widely used as a drink in restaurants and cafes."
                ), Product(
                    9,
                    R.drawable.ic_orange,
                    "Orange",
                    "Orange juice is widely used as a drink in restaurants and cafes."
                ),
                Ad("Акция", "Апельсины очень полезны"),
                Product(
                    10,
                    R.drawable.ic_orange,
                    "Orange",
                    "Orange juice is widely used as a drink in restaurants and cafes."
                ), Product(
                    11,
                    R.drawable.ic_orange,
                    "Orange",
                    "Orange juice is widely used as a drink in restaurants and cafes."
                )
            )
        }

        adapter.items = getItems()
        binding.recyclerView.adapter = adapter

        val dividerItemDecoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        binding.recyclerView.addItemDecoration(dividerItemDecoration)

        val myItemDecoration = MyItemDecoration(this);
        binding.recyclerView.addItemDecoration(myItemDecoration)
    }
}