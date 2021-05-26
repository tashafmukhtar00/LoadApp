package com.udacity

enum class DownloadLink(val title: Int, val link: String) {
    GLIDE(R.string.glide_download, "https://github.com/bumptech/glide"),
    RETROFIT(R.string.retrofit_download, "https://github.com/square/retrofit"),
    UDACITY(
        R.string.udacity_download,
        "https://github.com/udacity/nd940-c3-advanced-android-programming-project-starter"
    )
}