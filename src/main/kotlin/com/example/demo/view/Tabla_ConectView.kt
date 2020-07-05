package com.example.demo.view

import com.example.demo.app.Styles
import com.example.demo.controller.MainController
import javafx.geometry.Pos
import javafx.scene.image.Image
import tornadofx.*

class Tabla_ConectView : View("My View") {
    val mainController: MainController  by inject()

    override val root = borderpane {
        //mainController.labelText.value ="Modelo A Utilizar"
        //mainController.imagePath.value ="modelo.png"
        top{
            hbox {
                alignment = Pos.CENTER
                addClass(Styles.top)
                label("Tabla de Conectividades") {
                    addClass(Styles.heading)

                }
            }

        }
        center{
            minHeight = 790.0
            imageview{
                image = Image("tabla_conect.png",600.0,300.0,false,true)
            }
        }
    }
}
