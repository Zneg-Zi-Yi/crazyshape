package tw.edu.pu.s410855304.crazyshape

import android.content.Context
import android.content.Intent
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.activity_main.*


class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        btn.setOnClickListener(object:View.OnClickListener{
            override fun onClick(p0: View?) {
                handPaint.path.reset()
                handPaint.invalidate()
            }
        })


        btnBack.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                intent = Intent(this@GameActivity, MainActivity::class.java)
                startActivity(intent)
            }
        })


    }

}