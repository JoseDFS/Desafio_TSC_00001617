package com.example.demo.view

import com.example.demo.app.Styles
import com.example.demo.controller.MainController
import javafx.geometry.Pos
import javafx.scene.image.Image
import tornadofx.*

class CondicionesView : View("My View") {
    val mainController: MainController  by inject()

    override val root = borderpane {
        //mainController.labelText.value ="Modelo A Utilizar"
        //mainController.imagePath.value ="modelo.png"
        addClass(Styles.center)
        top{
            hbox {
                alignment = Pos.CENTER
                addClass(Styles.top)
                label("Paso 9") {
                    addClass(Styles.heading)

                }
            }

        }
        center{
            minHeight = 790.0
            imageview{
                image = Image("Ensamblaje/condiciones.gif",1100.0,700.0,false,true)
            }
        }
    }
}
