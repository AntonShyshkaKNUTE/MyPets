package com.mypets

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dog = Animal("Dog", R.drawable.dog, "Dogs, our devoted companions, come" +
                " in diverse breeds, displaying unique traits. Their loyalty, intelligence, and" +
                " affection make them cherished members of our families. They excel in roles " +
                "ranging from working partners to beloved pets, offering unconditional love and joy" +
                " in our lives.")
        val cat = Animal("Cat", R.drawable.cat, "Cats, independent and graceful, " +
                "captivate with their enigmatic charm. With their sleek coats and piercing eyes, " +
                "they exude an aura of mystery. Agile hunters and affectionate companions, they " +
                "bring a touch of elegance to our homes, forming deep, cherished connections with" +
                " those who earn their trust.")
        val bird = Animal("Bird", R.drawable.bird, "Birds, diverse in species, grace" +
                " our skies with vibrant plumage and melodious songs. From soaring raptors to " +
                "delicate songbirds, they enchant with their remarkable adaptations and behaviors." +
                " Masters of flight, some migrate vast distances while others display dazzling " +
                "courtship rituals. They inhabit varied ecosystems, contributing to the intricate " +
                "web of life.")


        val dogDetailsButton: Button = findViewById(R.id.dogDetailsButton)
        dogDetailsButton.setOnClickListener {
            val intent = Intent(this, AnimalDetailsActivity::class.java)
            intent.putExtra("animal", dog)
            startActivity(intent)
        }

        val catDetailsButton: Button = findViewById(R.id.catDetailsButton)
        catDetailsButton.setOnClickListener {
            val intent = Intent(this, AnimalDetailsActivity::class.java)
            intent.putExtra("animal", cat)
            startActivity(intent)
        }

        val birdDetailsButton: Button = findViewById(R.id.birdDetailsButton)
        birdDetailsButton.setOnClickListener {
            val intent = Intent(this, AnimalDetailsActivity::class.java)
            intent.putExtra("animal", bird)
            startActivity(intent)
        }
    }
}