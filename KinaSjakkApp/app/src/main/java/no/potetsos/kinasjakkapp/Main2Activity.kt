package no.potetsos.kinasjakkapp

import android.app.ActionBar
import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.support.constraint.ConstraintLayout
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import android.widget.RelativeLayout
import java.lang.StringBuilder
import kotlin.concurrent.timer
import android.view.LayoutInflater




class Main2Activity : AppCompatActivity() {

    //var sek:Int = 100

    var bolTim = false

    var plasering : Int = 1


    var forrigeTrykk: Boolean = false

    lateinit var  test1: TextView
    lateinit var  test2: TextView
    lateinit var  test3: TextView
    lateinit var  test4: TextView
    lateinit var  test5: TextView
    lateinit var  test6: TextView
    lateinit var  test7: TextView
    lateinit var  test8: TextView

    lateinit var timerer : CountDownTimer

    var forst: Boolean = true


    lateinit var liste : MutableList<TextView>

    var listeTid: MutableList<Long> = mutableListOf()

    //var startTid = 50000

    var teller = -1

    //lateinit var tull: ConstraintLayout

    //lateinit var knapp: Button

    var sistePlasering : Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_main2)

        val forrige: Intent = intent
        val antal: Int = forrige.getStringExtra("antal").toInt()
        var startTid: Int = forrige.getStringExtra("millis").toInt()

        sistePlasering = antal


        var fTekst: String = ""
        var tmpHundredeler: Int = (startTid / 100)

        var timer: Int = tmpHundredeler / (3600 * 10)
        if (timer != 0) {
            tmpHundredeler -= timer * (3600 * 10)
            fTekst += timer.toString() + ":"
            bolTim = true
        } else {
            bolTim = false
        }

        var minutt: Int = tmpHundredeler / (60 * 10)
        if (minutt != 0 || bolTim) {
            tmpHundredeler -= minutt * (60 * 10)
            fTekst += minutt.toString() + ":"
        }
        var sekund: Int = tmpHundredeler / (10)
        fTekst += sekund.toString() + "."
        tmpHundredeler -= sekund * 10
        fTekst += tmpHundredeler.toString()

        //liste[teller].text = tekst


        when (antal) {
            2 -> {
                setContentView(R.layout.bita2)
                test1 = findViewById(R.id.ID1)
                test2 = findViewById(R.id.ID2)
                test1.setBackgroundColor(Color.RED)
                test2.setBackgroundColor(Color.GREEN)
                //legg til desse 2 i ei liste og kall metode for tid

                liste = mutableListOf(test1, test2)




            }

            3 -> {
                setContentView(R.layout.bita3)
                test1 = findViewById(R.id.ID1)
                test2 = findViewById(R.id.ID2)
                test3 = findViewById(R.id.ID3)

                test1.setBackgroundColor(Color.RED)
                test2.setBackgroundColor(Color.GREEN)
                test3.setBackgroundColor(Color.BLUE)

                liste = mutableListOf(test1, test2, test3)


            }
            4 -> {
                setContentView(R.layout.bita4)
                test1 = findViewById(R.id.ID1)
                test2 = findViewById(R.id.ID2)
                test3 = findViewById(R.id.ID3)
                test4 = findViewById(R.id.ID4)

                test1.setBackgroundColor(Color.RED)
                test2.setBackgroundColor(Color.GREEN)
                test3.setBackgroundColor(Color.BLUE)
                test4.setBackgroundColor(Color.YELLOW)

                liste = mutableListOf(test1, test2, test3, test4)





            }
            5 -> {
                setContentView(R.layout.bita5)
                test1 = findViewById(R.id.ID1)
                test2 = findViewById(R.id.ID2)
                test3 = findViewById(R.id.ID3)
                test4 = findViewById(R.id.ID4)
                test5 = findViewById(R.id.ID5)

                test1.setBackgroundColor(Color.RED)
                test2.setBackgroundColor(Color.GREEN)
                test3.setBackgroundColor(Color.BLUE)
                test4.setBackgroundColor(Color.YELLOW)
                test5.setBackgroundColor(Color.CYAN)

                liste = mutableListOf(test1, test2, test3, test4, test5)



            }
            6 -> {
                setContentView(R.layout.bita6)
                test1 = findViewById(R.id.ID1)
                test2 = findViewById(R.id.ID2)
                test3 = findViewById(R.id.ID3)
                test4 = findViewById(R.id.ID4)
                test5 = findViewById(R.id.ID5)
                test6 = findViewById(R.id.ID6)

                test1.setBackgroundColor(Color.RED)
                test2.setBackgroundColor(Color.GREEN)
                test3.setBackgroundColor(Color.BLUE)
                test4.setBackgroundColor(Color.YELLOW)
                test5.setBackgroundColor(Color.CYAN)
                test6.setBackgroundColor(Color.GRAY)

                liste = mutableListOf(test1, test2, test3, test4, test5, test6)


            }
            7 -> {
                setContentView(R.layout.bita7)
                test1 = findViewById(R.id.ID1)
                test2 = findViewById(R.id.ID2)
                test3 = findViewById(R.id.ID3)
                test4 = findViewById(R.id.ID4)
                test5 = findViewById(R.id.ID5)
                test6 = findViewById(R.id.ID6)
                test7 = findViewById(R.id.ID7)

                test1.setBackgroundColor(Color.RED)
                test2.setBackgroundColor(Color.GREEN)
                test3.setBackgroundColor(Color.BLUE)
                test4.setBackgroundColor(Color.YELLOW)
                test5.setBackgroundColor(Color.CYAN)
                test6.setBackgroundColor(Color.GRAY)
                test7.setBackgroundColor(Color.MAGENTA)

                liste = mutableListOf(test1, test2, test3, test4, test5, test6, test7)


            }
            8 -> {
                setContentView(R.layout.bita8)
                test1 = findViewById(R.id.ID1)
                test2 = findViewById(R.id.ID2)
                test3 = findViewById(R.id.ID3)
                test4 = findViewById(R.id.ID4)
                test5 = findViewById(R.id.ID5)
                test6 = findViewById(R.id.ID6)
                test7 = findViewById(R.id.ID7)
                test8 = findViewById(R.id.ID8)

                test1.setBackgroundColor(Color.RED)
                test2.setBackgroundColor(Color.GREEN)
                test3.setBackgroundColor(Color.BLUE)
                test4.setBackgroundColor(Color.YELLOW)
                test5.setBackgroundColor(Color.CYAN)
                test6.setBackgroundColor(Color.GRAY)
                test7.setBackgroundColor(Color.MAGENTA)
                test8.setBackgroundColor(Color.rgb(255, 165, 0))

                liste = mutableListOf(test1, test2, test3, test4, test5, test6, test7, test8)


            }
        }
        for (i: Int in 1..antal) {
            listeTid.add(startTid.toLong())
            liste[i - 1].text = fTekst
        }

        for (i:Int in 0..antal-1){
            liste[i].setOnLongClickListener {
                //Log.d("myTag", teller.toString());
                if (forrigeTrykk){
                    liste[teller].setBackgroundColor(Color.WHITE)
                    liste[teller].text = plasering.toString()
                    plasering+=1
                    liste.removeAt(teller)

                    listeTid.removeAt(teller)

                    teller -= 1
                    timerer.cancel()
                }
                forrigeTrykk = false


                return@setOnLongClickListener true
            }
        }


    }


    fun nesteTimer(tmpTeller: Int){
        //start ny timer med gammel tid
        //oppdaterer tv på inTick
        timerer = object : CountDownTimer(listeTid[tmpTeller], 100) {
            override fun onTick(millisUntilFinished: Long) {
                //liste[teller].text = (millisUntilFinished/100).toString()
                var tekst: String = ""
                var tmpHundredeler : Int = (millisUntilFinished/100).toInt()




                var timer : Int = tmpHundredeler /(3600 * 10)
                if (timer != 0){
                    tmpHundredeler -= timer * (3600 * 10)
                    tekst += timer.toString() + ":"
                    bolTim = true
                }
                else{
                    bolTim = false
                }

                var minutt: Int = tmpHundredeler /(60 *10)
                if (minutt != 0 || bolTim){
                    tmpHundredeler -= minutt*(60 * 10)
                    tekst += minutt.toString() + ":"
                }
                var sekund: Int = tmpHundredeler /(10)
                tekst += sekund.toString() + "."
                tmpHundredeler -= sekund * 10
                tekst += tmpHundredeler.toString()

                liste[tmpTeller].text = tekst
                //var strMin : Int =
                listeTid[tmpTeller] = millisUntilFinished
            }

            override fun onFinish() {

                //ferjn fra liste, gjer svart/mørkare
                liste[teller].setBackgroundColor(Color.BLACK)
                liste[teller].setTextColor(Color.WHITE)

                liste[teller].text = sistePlasering.toString()
                sistePlasering -=1

                liste.removeAt(tmpTeller)
                //timerer.cancel()
                listeTid.removeAt(tmpTeller)
                teller -= 1
                forrigeTrykk = false
            }

        }.start()

    }

    fun nesteMann(v: View){
        //Log.d("myTag", "This is my message");
        forrigeTrykk = true
        if (liste.size != 0){
            if (forst){
                forst = false
            }
            else{
                timerer.cancel()
            }
            teller += 1
            if (teller > liste.size-1){
                teller = 0
            }
            nesteTimer(teller)
        }
    }







}
