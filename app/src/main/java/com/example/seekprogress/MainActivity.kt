package com.example.seekprogress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //images
        val img1 = findViewById<ImageView>(R.id.imageView)
        val img2 = findViewById<ImageView>(R.id.imageView2)
        val img3 = findViewById<ImageView>(R.id.imageView3)

        //widthbars
        val wb1 = findViewById<SeekBar>(R.id.seekBar)
        val wb2 = findViewById<SeekBar>(R.id.seekBar2)
        val wb3 = findViewById<SeekBar>(R.id.seekBar3)
        wb1.progress = 100;
        wb2.progress = 100;
        wb3.progress = 100;

        //heightbars
        val hb1 = findViewById<SeekBar>(R.id.seekBar4)
        val hb2 = findViewById<SeekBar>(R.id.seekBar5)
        val hb3 = findViewById<SeekBar>(R.id.seekBar6)
        hb1.progress = 100;
        hb2.progress = 100;
        hb3.progress = 100;


        //IMAGE 1
        wb1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                img1.scaleX = progress.toFloat() / 100f
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
        hb1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                img1.scaleY = progress.toFloat() / 100f
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        //IMAGE 2
        wb2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                img2.scaleX = progress.toFloat() / 100f
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
        hb2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                img2.scaleY = progress.toFloat() / 100f
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        //IMAGE 3
        wb3.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                img3.scaleX = progress.toFloat() / 100f
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
        hb3.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                img3.scaleY = progress.toFloat() / 100f
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

    }
}