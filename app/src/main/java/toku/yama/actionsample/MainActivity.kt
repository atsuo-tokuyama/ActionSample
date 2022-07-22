package toku.yama.actionsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = BuildConfig.SECRET_KEY.plus(" ").plus(BuildConfig.SAMPLE_KEY).plus(" ${BuildConfig.PROP}")


        val ans = addition(1, 3)
        println(ans)
    }

    private fun addition(a:Int, b:Int):Int {
        return a+b
    }
}
