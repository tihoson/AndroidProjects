package com.example.task3

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_image.*
import java.io.File

class ViewImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_image)

        textView.text = intent.getStringExtra("name")
        imageView.setImageURI(Uri.fromFile(File(intent.getStringExtra("path"))))
    }
}
