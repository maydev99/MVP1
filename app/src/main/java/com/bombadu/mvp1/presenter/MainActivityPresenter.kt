package com.bombadu.mvp1.presenter

import com.bombadu.mvp1.contract.ContractInterface.*
import com.bombadu.mvp1.model.MainActivityModel

class MainActivityPresenter(_view: View) : Presenter {

    private var view: View = _view
    private var model: Model = MainActivityModel()

    init {
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateViewData()
    }

    override fun decrementValue() {
        model.decrementCounter()
        view.updateViewData()
    }

    override fun getCounter() = model.getCounter().toString()
}