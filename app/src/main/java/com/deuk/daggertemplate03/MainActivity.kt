package com.deuk.daggertemplate03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.deuk.daggertemplate03.di.DaggerAppComponent
import com.deuk.daggertemplate03.di.qualifiers.TonyStark
import javax.inject.Inject
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @Inject
    @field:TonyStark
    lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerAppComponent.create().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameTextView.text = user.name
        ageTextView.text = user.age.toString()
    }
}