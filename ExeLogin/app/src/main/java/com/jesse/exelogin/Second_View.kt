package com.jesse.exelogin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jesse.exelogin.databinding.ActivitySecondViewBinding
import androidx.core.net.toUri

class Second_View : AppCompatActivity() {
    private lateinit var binding: ActivitySecondViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondViewBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        binding.back.setOnClickListener { goBackView()  }
        video()
    }

//    fun goBackView(){
//        finish()
//    }

    fun video(){
        val video = binding.videoView

        val mediacontroller = android.widget.MediaController(this)
        mediacontroller.setAnchorView(video)
        video.setMediaController(mediacontroller)

        val uri = ("android.resource://" + packageName + "/" + R.raw.we).toUri()
        video.setVideoURI(uri)

        video.setAudioFocusRequest(android.media.AudioManager.AUDIOFOCUS_GAIN)
        video.start()
    }
}