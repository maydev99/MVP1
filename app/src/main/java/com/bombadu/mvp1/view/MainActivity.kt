package com.bombadu.mvp1.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bombadu.mvp1.R
import com.bombadu.mvp1.contract.ContractInterface
import com.bombadu.mvp1.presenter.MainActivityPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ContractInterface.View {

    private var presenter: MainActivityPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainActivityPresenter(this)
    }

    override fun initView() {
        counterTextView.text = presenter?.getCounter()
        incrementButton.setOnClickListener { presenter?.incrementValue() }
        decrementButton.setOnClickListener { presenter?.decrementValue() }

    }

    override fun updateViewData() {
        counterTextView.text = presenter?.getCounter()

    }
}