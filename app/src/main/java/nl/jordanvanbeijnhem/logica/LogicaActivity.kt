package nl.jordanvanbeijnhem.logica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_logica.*

class LogicaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logica)
        btnSubmit.setOnClickListener { onSubmit() }
    }

    private fun onSubmit() {
        if (etCase1.text.toString() == getString(R.string.case_1) &&
            etCase2.text.toString() == getString(R.string.case_2) &&
            etCase3.text.toString() == getString(R.string.case_3) &&
            etCase4.text.toString() == getString(R.string.case_4)
        ) {
            onAnswerCorrect()
        } else {
            onAnswerIncorrect()
        }
    }

    private fun onAnswerCorrect() {
        Toast.makeText(this, R.string.correct, Toast.LENGTH_LONG).show()
    }

    private fun onAnswerIncorrect() {
        Toast.makeText(this, R.string.incorrect, Toast.LENGTH_LONG).show()
    }
}
