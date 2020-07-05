package com.example.demo.view

import com.example.demo.app.Styles
import com.example.demo.controller.MainController
import javafx.geometry.Pos
import javafx.scene.image.Image
import tornadofx.*

class EnsamblajeCView : View("My View") {
    val mainController: MainController  by inject()

    override val root = borderpane {
        //mainController.labelText.value ="Modelo A Utilizar"
        //mainController.imagePath.value ="modelo.png"
        top{
            hbox {
                alignment = Pos.CENTER
                addClass(Styles.top)
                label("Ensamblaje Completo") {
                    addClass(Styles.heading)

                }
            }

        }
        center{
            minHeight = 790.0
            imageview{
                image = Image("Ensamblaje/ensamble_completo.png",1400.0,500.0,false,true)
            }
        }
    }
}
