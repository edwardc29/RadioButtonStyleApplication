package pe.com.carrion.edward.radiobuttonstyleapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rg.setOnCheckedChangeListener { _, checkedId ->
            /*
            Toast.makeText(
                this,
                "Checked $checkedId",
                Toast.LENGTH_SHORT
            ).show()
             */

            val checkedRadioButton = rg.findViewById(checkedId) as RadioButton

            Toast.makeText(
                this,
                "Checked ${checkedRadioButton.text}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
