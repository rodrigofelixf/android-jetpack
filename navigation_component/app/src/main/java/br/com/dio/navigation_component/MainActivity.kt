package br.com.dio.navigation_component

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.dio.navigation_component.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}