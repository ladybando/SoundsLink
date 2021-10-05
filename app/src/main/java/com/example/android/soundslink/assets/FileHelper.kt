package com.example.android.soundslink.assets

import android.util.Log
import java.io.BufferedReader
import java.io.File
import java.util.Scanner

class FileHelper {

    private val file = File("./soundslink/GTASoundtrack.txt")
    private val bufferedReader: BufferedReader = file.bufferedReader()
    private val fileText: List<String> = bufferedReader.readLines()



    fun printText(){
        try {
           val myfile = File("./soundslink/GTASoundtrack.txt");
           val sc = Scanner(myfile);

            while ( sc.hasNextLine() ) {
                System.out.println(sc.nextLine());
            }

        } catch ( e:Exception) {
            println(e);      // Quick and dirty error handling
        }
/*        for (lines in fileText) {
            Log.d("FileHelper text",lines)
        }*/
    }
}