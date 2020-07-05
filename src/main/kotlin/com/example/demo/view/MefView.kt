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

class MefView : View("My View") {
    val mainController: MainController  by inject()
    override val root = borderpane {
        addClass(Styles.center)
        top{
            hbox {
                alignment = Pos.CENTER
                addClass(Styles.top)
                label("Aplicación MEF") {
                    addClass(Styles.heading)

                }
            }

        }
        center{
            //addClass(Styles.label_t)
            scrollpane {
                isFitToWidth =true
                isFitToHeight=true
                stackpane {
                    addClass(Styles.center)
                    alignment = Pos.TOP_CENTER
                    vbox {
                        vbox {
                            alignment = Pos.CENTER
                            imageview{
                                image = Image("Mef/Pasos-01.png",900.0,600.0,false,true)
                            } }
                        vbox {
                            alignment = Pos.CENTER
                            imageview{
                                image = Image("Mef/Pasos-02.png",900.0,600.0,false,true)
                            } }
                        vbox {
                            alignment = Pos.CENTER
                            imageview{
                                image = Image("Mef/Pasos-03.png",900.0,600.0,false,true)
                            } }
                        vbox {
                            alignment = Pos.CENTER
                            imageview{
                                image = Image("Mef/Pasos-04.png",900.0,600.0,false,true)
                            } }
                        vbox {
                            alignment = Pos.CENTER
                            imageview{
                                image = Image("Mef/Pasos-05.png",900.0,600.0,false,true)
                            } }
                        vbox {
                            alignment = Pos.CENTER
                            imageview{
                                image = Image("Mef/Pasos-06.png",900.0,600.0,false,true)
                            } }
                        vbox {
                            alignment = Pos.CENTER
                            imageview{
                                image = Image("Mef/Pasos-07.png",900.0,600.0,false,true)
                            } }
                        vbox {
                            alignment = Pos.CENTER
                            imageview{
                                image = Image("Mef/Pasos-08.png",900.0,600.0,false,true)
                            } }
                        vbox {
                            alignment = Pos.CENTER
                            imageview{
                                image = Image("Mef/Pasos-09.png",900.0,600.0,false,true)
                            } }
                        vbox {
                            alignment = Pos.CENTER
                            imageview{
                                image = Image("Mef/Pasos-10.png",900.0,600.0,false,true)
                            } }
                        vbox {
                            alignment = Pos.CENTER
                            imageview{
                                image = Image("Mef/Pasos-11.png",900.0,600.0,false,true)
                            } }
                        vbox {
                            alignment = Pos.CENTER
                            imageview{
                                image = Image("Mef/Pasos-12.png",900.0,600.0,false,true)
                            } }
                        vbox {
                            alignment = Pos.CENTER
                            imageview{
                                image = Image("Mef/Pasos-13.png",900.0,600.0,false,true)
                            } }
                    }
                }

            }


        }
    }
}
