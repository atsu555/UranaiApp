package com.example.uranaiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.*
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // １)　idを取得
        val tv:TextView  = findViewById(R.id.uranaiText)
        val btn:Button = findViewById(R.id.uranaiBtn)

        // test修正しました。

        // ２) クリック処理
        btn.setOnClickListener {
            // ４）配列で、文言を用意
            var uranai = arrayOf("大吉", "中吉", "小吉", "吉", "凶")

            // ３） 乱数を作ってみる
            var num = Random().nextInt(uranai.count())
//            tv.text = num.toString()

            tv.text = uranai.get(num)
        }
    }
}