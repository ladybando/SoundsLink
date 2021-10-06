package com.example.android.soundslink.data

import android.content.Context
import java.io.BufferedReader

class FileHelper {
    fun readAsset(context: Context, fileName: String) : String =
        context
            .assets
            .open(fileName)
            .bufferedReader()
            .use(BufferedReader::readText)
}