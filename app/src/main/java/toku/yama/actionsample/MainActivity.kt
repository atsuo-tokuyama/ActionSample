package toku.yama.actionsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ans = addition(1, 3)
        println(ans)
    }

    fun addition(a:Int, b:Int):Int {
        return a+b
        aaa
    }
}
