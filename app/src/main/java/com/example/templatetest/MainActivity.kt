package com.example.templatetest

import android.app.Activity
import android.os.Build
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    private val counter = Counter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val padding = (24 * resources.displayMetrics.density).toInt()

        val title = TextView(this).apply {
            text = getString(R.string.hello_message)
            textSize = 24f
            gravity = Gravity.CENTER
        }

        val countView = TextView(this).apply {
            text = counter.value.toString()
            textSize = 48f
            gravity = Gravity.CENTER
        }

        val button = Button(this).apply {
            text = getString(R.string.tap_button)
            setOnClickListener {
                counter.increment()
                countView.text = counter.value.toString()
            }
        }

        val info = TextView(this).apply {
            text = getString(R.string.build_info, Build.VERSION.RELEASE, Build.VERSION.SDK_INT)
            gravity = Gravity.CENTER
        }

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(padding, padding, padding, padding)
            addView(title)
            addView(countView)
            addView(button)
            addView(info)
        }

        setContentView(root)
    }
}
