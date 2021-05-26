package com.udacity

import android.app.NotificationManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.udacity.util.cancelNotifications
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.content_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar)
        cancelNotification()

        if (intent.hasExtra(AppConstant.SUCCESS))
            if (intent.getBooleanExtra(AppConstant.SUCCESS, false)) {
                status.text = getString(R.string.success)
                status.setTextColor(ContextCompat.getColor(this, R.color.colorPrimaryDark))
            } else {
                status.text = getString(R.string.fail)
                status.setTextColor(ContextCompat.getColor(this, R.color.color_red))
            }
        if (intent.hasExtra(AppConstant.TITLE)) {
            file_name.text = intent.getStringExtra(AppConstant.TITLE)
        }

        backButton.setOnClickListener {
            finish()
        }
    }

    private fun cancelNotification() {
        val notificationManager =
            ContextCompat.getSystemService(
                applicationContext,
                NotificationManager::class.java
            ) as NotificationManager
        notificationManager.cancelNotifications()
    }
}
