package dev.shamy.anagramactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecurityActivity : AppCompatActivity() {
    lateinit var etWording1:EditText
    lateinit var btnAnag:Button
    lateinit var tvAnswers:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_security)
        etWording1=findViewById(R.id.etWording1)
        btnAnag=findViewById(R.id.btnAnag)
        tvAnswers=findViewById(R.id.tvAnswers)
        btnAnag.setOnClickListener {
            anagram()

        }
    }
    //create function pass nothing as parameter
    //create variable for holding the edit text
    //create list holding the possible answers
    //check if word is equal to the length of thefirst string and in list
    //print success in the text view
    //call the function
    fun anagram() {
        var wordess = etWording1.text.toString()
        var p = listOf<String>("Rescue", "Cesure", "Recuse", "Cereus", "rescue", "recuse", "cereus")
        var z = "cesure".length
        if(wordess.length==z && p.contains(wordess)){
            tvAnswers.text="Yay you have found the anagram of secure"
        }
        else{
            tvAnswers.text="Try again"
        }
//        if(wordess.isBlank()){
//            etWording1.setError("A word is required")
//        }
//        retur


    }



}

////private fun Button.setOnClickListener() {
//    TODO("Not yet implemented")
//}
