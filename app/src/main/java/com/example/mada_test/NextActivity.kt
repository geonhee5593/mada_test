package com.example.mada_test

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        // MainActivity에서 전달된 선택된 관심 분야를 받음
        val selectedInterests = intent.getStringArrayListExtra("selectedInterests")

        // TextView에 선택된 관심 분야를 표시
        val resultTextView = findViewById<TextView>(R.id.tv_result)
        resultTextView.text = selectedInterests?.joinToString(separator = ", ") ?: "선택된 항목이 없습니다."
    }
}
