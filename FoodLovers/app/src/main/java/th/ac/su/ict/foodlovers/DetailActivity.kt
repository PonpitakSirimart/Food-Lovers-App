package th.ac.su.ict.foodlovers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.list_item_food.view.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)


        val title=intent.getStringExtra("title")
        val caption=intent.getStringExtra("caption")
        val foodImg=intent.getStringExtra("imageFiLe")
        val shopName=intent.getStringExtra("shopName")
        val rate=intent.getStringExtra("rate")

//        val rating = rate.toString().toFloat()


        foodName.setText(title)
        storeName.setText(shopName)
        description.setText(caption)
//        rtbStar.getRating(rating)

        val res = resources
        val drawableId : Int=res.getIdentifier(foodImg,"drawable",packageName)
        val drawablePp : Int=res.getIdentifier(rate,"drawable",packageName)

        imgView.setImageResource(drawableId)
        rtbStar.setImageResource(drawablePp)



    }
}