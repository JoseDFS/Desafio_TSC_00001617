package com.example.demo.view

import com.example.demo.app.Styles
import com.example.demo.controller.MainController
import javafx.geometry.Pos
import javafx.scene.image.Image
import javafx.scene.layout.*
import tornadofx.*

class MainView : View() {

    override val root: BorderPane = borderpane {
        //addClass(Styles.ini)

        center {
            background = Background(BackgroundImage(Image("ini.png"),BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT))
            vbox {
                alignment = Pos.CENTER
                spacing = 100.0
                fitToParentHeight()
                label("MEF 3D") {
                    addClass(Styles.heading_m)

                    }
                hbox {
                    minHeight = 72.0
                    alignment = Pos.CENTER
                    addClass(Styles.bottomMenu)
                    button("Iniciar") {
                        action {  replaceWith<ContainerView>(ViewTransition.Swap(0.5.seconds))}

                    }
                }

            }

        }
    }
}