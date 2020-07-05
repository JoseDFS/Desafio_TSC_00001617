package com.example.demo.view

import com.example.demo.app.Styles
import com.example.demo.controller.MainController
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.image.Image
import javafx.scene.text.Font
import javafx.scene.text.FontWeight
import sun.font.FontFamily
import tornadofx.*

class Condiciones_ModeloView : View("My View") {
    val mainController: MainController  by inject()
    override val root = borderpane {

        top{
            hbox {
                alignment = Pos.CENTER
                addClass(Styles.top)
                label("Condiciones De Contorno") {
                    addClass(Styles.heading)

                }
            }

        }
        center{
            addClass(Styles.label_t)
            scrollpane {
                isFitToWidth =true
                isFitToHeight=true
                stackpane {
                    alignment = Pos.CENTER
                    vbox {
                        paddingAll= 30.0
                        spacing = 40.0

                        vbox {
                            alignment = Pos.CENTER
                            imageview{
                                image = Image("modelo_cond.png",600.0,500.0,false,true)
                            } }
                        vbox {
                            alignment = Pos.CENTER
                            label("Condiciones De Dirichlet = 4"){
                                spacing = 20.0
                                isUnderline =true
                            }
                            imageview{
                                image = Image("modelo_dir.png",1000.0,550.0,false,true)
                            } }

                        vbox {
                            alignment = Pos.CENTER
                            label("Condiciones De Newmann = 6dt/dn"){
                                spacing = 20.0
                                isUnderline =true
                            }
                            imageview{
                                image = Image("modelo_newmann.png",1000.0,550.0,false,true)
                            } }

                    }
                }

            }


        }
    }
}
