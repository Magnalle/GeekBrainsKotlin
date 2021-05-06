package com.magnalleexample.geekbrainskotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.magnalleexample.geekbrainskotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.lifecycleOwner = this;
        viewModel = ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(application))
                .get(MainViewModel::class.java)
        binding.viewModel = viewModel

    }

}