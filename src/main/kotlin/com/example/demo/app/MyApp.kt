package com.example.demo.app

import com.example.demo.view.ContainerView
import com.example.demo.view.MainView
import javafx.stage.Stage
import tornadofx.App
import tornadofx.reloadStylesheetsOnFocus

class MyApp: App(MainView::class, Styles::class){

    override fun start(stage:Stage){
        with(stage){
            width=1500.0
            height=900.0
        }
        super.start(stage)
    }
    init {
        reloadStylesheetsOnFocus()
    }
}