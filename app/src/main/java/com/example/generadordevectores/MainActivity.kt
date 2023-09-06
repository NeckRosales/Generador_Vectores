package com.example.generadordevectores
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var vectorTextView: TextView
    private lateinit var menTextView: TextView
    private lateinit var mayTextView: TextView
    private lateinit var averageTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vectorTextView = findViewById(R.id.vectorTextView)
        menTextView = findViewById(R.id.menTextView)
        mayTextView = findViewById(R.id.mayTextView)
        averageTextView = findViewById(R.id.averageTextView)

        val generateButton: Button = findViewById(R.id.generateButton)
        generateButton.setOnClickListener {
            generateAndDisplayVector()
        }
    }

    private fun generateAndDisplayVector() {
        val vector = IntArray(10) { Random.nextInt(1, 101) }
        val vectorString = vector.joinToString(", ")

        val men = vector.minOrNull()
        val may = vector.maxOrNull()
        val average = vector.average()

        vectorTextView.text = "Vector Generado: $vectorString"
        menTextView.text = "Menor: $men"
        mayTextView.text = "Mayor: $may"
        averageTextView.text = "Promedio: $average"
        }
}