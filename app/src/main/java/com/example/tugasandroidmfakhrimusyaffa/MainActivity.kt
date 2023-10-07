package com.example.tugasandroidmfakhrimusyaffa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.tugasandroidmfakhrimusyaffa.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tv = findViewById(R.id.textView2)

        binding.btnfragment1.setOnClickListener {
            replaceFragments(Fragment_01())
        }

        binding.btnfragment2.setOnClickListener {
            replaceFragments(Fragment_02())
        }

        val email = intent.getParcelableExtra<User>("User")?.email
        val password = intent.getParcelableExtra<User>("User")?.password
        tv.text = """Silahkan cek kembali
            |
            |Email : $email
            |Password : $password
            |
            |Apakah perlu disimpan?
        """.trimMargin()
    }

    private fun replaceFragments(fragment : Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment, fragment)
        fragmentTransaction.commit()
    }
}
