package com.mypets

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AnimalDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_details)

        val animal = intent.getParcelableExtra<Animal>("animal") as Animal

        val imageView: ImageView = findViewById(R.id.animalDetailImage)
        val nameTextView: TextView = findViewById(R.id.animalDetailName)
        val descriptionTextView: TextView = findViewById(R.id.animalDetailDescription)

        imageView.setImageResource(animal.imageResourceId)
        nameTextView.text = animal.name
        descriptionTextView.text = animal.description
    }
}