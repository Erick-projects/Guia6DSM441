package com.example.practica06layouts_dsm104

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val linearLayout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
            )
        }

        val btnFrame = Button(this).apply {
            text = "Frame Layout"
            setAllCaps(false)
            setOnClickListener {
                onClickFrame()
            }
        }

        val btnLinear = Button(this).apply {
            text = "Linear Layout"
            setAllCaps(false)
            setOnClickListener {
                onClickLinear()
            }
        }

        val btnRelative = Button(this).apply {
            text = "Relative Layout"
            setAllCaps(false)
            setOnClickListener {
                onClickRelative()
            }
        }

        val btnTable = Button(this).apply {
            text = "Table Layout"
            setAllCaps(false)
            setOnClickListener {
                onClickTable()
            }
        }

        val btnGrid = Button(this).apply {
            text = "Grid Layout"
            setAllCaps(false)
            setOnClickListener {
                onClickGrid()
            }
        }

        linearLayout.apply {
            addView(btnFrame)
            addView(btnLinear)
            addView(btnRelative)
            addView(btnTable)
            addView(btnGrid)
        }

        setContentView(linearLayout)
    }

    private fun onClickFrame() {
        val intent = Intent(this, FrameLayoutActivity::class.java)
        startActivity(intent)
    }

    private fun onClickLinear() {
        val intent = Intent(this, LinearLayoutActivity::class.java)
        startActivity(intent)
    }

    private fun onClickRelative() {
        val intent = Intent(this, RelativeLayoutActivity::class.java)
        startActivity(intent)
    }

    private fun onClickTable() {
        val intent = Intent(this, TableLayoutActivity::class.java)
        startActivity(intent)
    }

    private fun onClickGrid() {
        val intent = Intent(this, GridLayoutActivity::class.java)
        startActivity(intent)
    }
}
