package www.smktelkommlg.myintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MoveWithObjectActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_PERSON = "extra_person"
    }

    private lateinit var TvObject : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_object)

        TvObject = findViewById(R.id.tv_object)

        val person = intent.getParcelableExtra<Person>(EXTRA_PERSON) as Person
        val text = "Name : ${person.name.toString()}, \nEmail : ${person.email}, \nAge : ${person.age}, \nCity : ${person.city}"

        TvObject.text = text

    }
}