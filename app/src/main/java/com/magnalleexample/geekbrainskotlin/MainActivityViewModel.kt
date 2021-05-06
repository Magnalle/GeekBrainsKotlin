package com.magnalleexample.geekbrainskotlin

import android.app.Application
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel

class MainViewModel(application: Application) : AndroidViewModel(application) {
    fun button1OnClickListener(){
        Toast.makeText(getApplication<Application>().applicationContext
                , "Button clicked!", Toast.LENGTH_SHORT).show()
    }
}