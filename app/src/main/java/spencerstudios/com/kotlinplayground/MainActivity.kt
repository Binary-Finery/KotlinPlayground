package spencerstudios.com.kotlinplayground

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        init()
    }

    fun rgn() : Int{
        return (Random().nextInt(50) + 1) * 2
    }

    fun init() {
        var idx = 0
        val cmds = Const.commands(rgn())
        tv.text = cmds[idx]
        btn.setText(R.string.button_next)
        btn.setOnClickListener {
            idx++
            if (idx == cmds.size) init() else tv.text = cmds[idx]
            if (idx == cmds.size - 1) btn.setText(R.string.button_play_again)
        }
    }
}
