package com.example.seekprogress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resetbtn = findViewById<Button>(R.id.resetbtn)

        //progressBars
        val widthBar = findViewById<ProgressBar>(R.id.progressBar)
        val heightBar = findViewById<ProgressBar>(R.id.progressBar2)

        //images
        val img1 = findViewById<ImageView>(R.id.imageView)
        val img2 = findViewById<ImageView>(R.id.imageView2)
        val img3 = findViewById<ImageView>(R.id.imageView3)

        //widthbars
        val wb1 = findViewById<SeekBar>(R.id.seekBar)
        val wb2 = findViewById<SeekBar>(R.id.seekBar2)
        val wb3 = findViewById<SeekBar>(R.id.seekBar3)

        //heightbars
        val hb1 = findViewById<SeekBar>(R.id.seekBar4)
        val hb2 = findViewById<SeekBar>(R.id.seekBar5)
        val hb3 = findViewById<SeekBar>(R.id.seekBar6)


        resetbtn.setOnClickListener {
            wb1.progress = 100
            wb2.progress = 100
            wb3.progress = 100
            widthBar.progress = 100

            hb1.progress = 100
            hb2.progress = 100
            hb3.progress = 100
            heightBar.progress = 100
        }

        fun heightBars() {
            heightBar.progress = (hb1.progress + hb2.progress + hb3.progress) / 3
        }

        fun widthBars() {
            widthBar.progress = (wb1.progress + wb2.progress + wb3.progress) / 3
        }


        //IMAGE 1
        wb1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                img1.scaleX = progress.toFloat() / 100f
                widthBars()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
        hb1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                img1.scaleY = progress.toFloat() / 100f
                heightBars()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        //IMAGE 2
        wb2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                img2.scaleX = progress.toFloat() / 100f
                widthBars()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
        hb2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                img2.scaleY = progress.toFloat() / 100f
                heightBars()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        //IMAGE 3
        wb3.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                img3.scaleX = progress.toFloat() / 100f
                widthBars()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
        hb3.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                img3.scaleY = progress.toFloat() / 100f
                heightBars()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

    }
}