package no.potetsos.kinasjakkapp

import android.app.Application
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import android.widget.SeekBar.OnSeekBarChangeListener



class MainActivity : AppCompatActivity(), View.OnClickListener {



    lateinit var antal: TextView
    lateinit var slider: SeekBar
    lateinit var knapp: Button

    lateinit var tim: EditText
    lateinit var min: EditText
    lateinit var sek: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tim = findViewById(R.id.TimID)
        min = findViewById(R.id.MinID)
        sek = findViewById(R.id.SekID)

        antal = findViewById(R.id.textViewID)
        slider = findViewById(R.id.seekBarID)
        knapp = findViewById(R.id.buttonID)

        slider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                // Display the current progress of SeekBar
                antal.text = (i+2).toString()
            }
            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Do something
                //Toast.makeText(applicationContext,"start tracking",Toast.LENGTH_SHORT).show()
            }
            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Do something
               //Toast.makeText(applicationContext,"stop tracking",Toast.LENGTH_SHORT).show()
            }
        } )

        knapp.setOnClickListener(this)
    }


    override fun onClick(view: View?) {
        val antal_ruter = slider.progress + 2
        val nesteTing : Intent = Intent(this, Main2Activity::class.java)

        var timer : Int = tim.text.toString().toInt()
        var minutt : Int = min.text.toString().toInt()
        var sekunder : Int = sek.text.toString().toInt()

        var millis: Int = sekunder * 1000 + minutt*1000*60 + timer * 3600 * 1000



        nesteTing.putExtra("antal", antal_ruter.toString())
        //nesteTing.putExtra("yo", "hei")

        nesteTing.putExtra("millis", millis.toString())

        startActivity(nesteTing)

        /*
        when(antal_ruter){
            6 -> {
                //antal.text = "yolo"
                //launch new activity og send antal_ruter videre
            }
        }
        */
    }

}
