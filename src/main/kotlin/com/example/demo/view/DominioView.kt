package com.example.demo.view

import com.example.demo.app.Styles
import com.example.demo.controller.MainController
import javafx.geometry.Pos
import javafx.scene.image.Image
import tornadofx.*

class DominioView : View("My View") {
    val mainController: MainController  by inject()
    override val root = borderpane {
       // mainController.labelText.value ="Malla y Dominio"
        top{
            hbox {
                alignment = Pos.CENTER
                addClass(Styles.top)
                label("Malla y Dominio") {
                    addClass(Styles.heading)

                }
            }

        }
        center{
            minHeight = 790.0
            hbox {
                alignment = Pos.CENTER
                spacing = 16.0
                imageview{
                    image = Image("malla.png",600.0,300.0,false,true)
                }
                imageview{
                    image = Image("cubo.gif",600.0,300.0,false,true)
                }

            }

        }
    }
}
