package com.bombadu.mvp1.model

import com.bombadu.mvp1.contract.ContractInterface.Model

class MainActivityModel : Model {

    private var mCounter = 0

    override fun getCounter() = mCounter

    override fun incrementCounter() {
        mCounter++
    }

    override fun decrementCounter() {
        mCounter--
    }
}