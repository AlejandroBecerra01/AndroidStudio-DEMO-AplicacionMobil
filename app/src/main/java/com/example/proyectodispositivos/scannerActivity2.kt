package com.example.proyectodispositivos

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.budiyev.android.codescanner.*

private const val CAMERA_REQUEST_CODE = 101


class scannerActivity2 : AppCompatActivity() {

    private lateinit var codeScanner: CodeScanner

    private var texto: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scanner2)

        texto = findViewById(R.id.tv_textview)
        codeScanner()
    }

    private fun codeScanner(){
        val scannerView = findViewById<CodeScannerView>(R.id.scanner_view)
        codeScanner = CodeScanner(this, scannerView)

        codeScanner.apply {
            camera = CodeScanner.CAMERA_BACK
            formats = CodeScanner.ALL_FORMATS

            autoFocusMode = AutoFocusMode.SAFE
            scanMode = ScanMode.CONTINUOUS
            isAutoFocusEnabled = true
            isFlashEnabled = false



            decodeCallback = DecodeCallback {
                runOnUiThread {
                   // texto?.text ?:  = it.text
                }
            }
        }
    }
}



