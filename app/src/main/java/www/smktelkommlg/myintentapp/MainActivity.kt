package www.smktelkommlg.myintentapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)
        val btnMoveActivityData: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveActivityData.setOnClickListener(this)
        val btnMoveObject: Button = findViewById(R.id.btn_move_activity_object)
        btnMoveObject.setOnClickListener(this)
        val btnDialNumber: Button = findViewById(R.id.btn_dial_number)
        btnDialNumber.setOnClickListener(this)
    }
    override fun onClick(v: View){
        when (v.id){
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MainActivity,MoveActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_move_activity_data->{
                val intent= Intent(this@MainActivity,MoveActivity::class.java)
                intent.putExtra("data1","somestring data")
                intent.putExtra("data2","somestring data2")
                startActivity(intent)
            }
            R.id.btn_move_activity_object -> {
                val person = Person(
                    "Syahren",
                    17,
                    "sfa.asus@gmail.com",
                    "Kediri"
                )
                val moveWithObjectIntent = Intent(this@MainActivity, MoveWithObjectActivity::class.java)
                moveWithObjectIntent.putExtra(MoveWithObjectActivity.EXTRA_PERSON, person)
                startActivity(moveWithObjectIntent)
            }
            R.id.btn_dial_number -> {
                val phoneNumber = "0812345678"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }
        }
    }
}
