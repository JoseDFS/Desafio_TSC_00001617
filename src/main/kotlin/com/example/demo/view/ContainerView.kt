package com.example.demo.view

import com.example.demo.app.Styles
import com.example.demo.controller.MainController
import javafx.geometry.Pos
import javafx.scene.layout.BorderPane
import tornadofx.*

class ContainerView : View() {
    val mainController:MainController  by inject()
    override val root: BorderPane = borderpane{

        center {

            vbox {
                fitToParentHeight()
                var s =slideshow {
                    defaultTransition = ViewTransition.Swap(0.5.seconds)
                    slide(ModeloView::class, ViewTransition.Metro(1.seconds))
                    slide(DominioView::class, ViewTransition.Explode(1.seconds))
                    slide(Condiciones_ModeloView::class, ViewTransition.Explode(1.seconds))
                    slide(Tabla_ConectView::class, ViewTransition.Explode(1.seconds))
                    slide(MefView::class, ViewTransition.Explode(1.seconds))
                    slide(EnsamblajeView::class, ViewTransition.Explode(1.seconds))
                    slide(EnsamblajeCView::class, ViewTransition.Explode(1.seconds))
                    slide(CondicionesView::class, ViewTransition.Explode(1.seconds))
                }
                hbox {
                    minHeight = 72.0
                    spacing = 100.0
                    alignment =Pos.CENTER
                    button ("Anterior"){
                        action {s.previous()}

                    }
                    button ("Siguiente"){
                        action {s.next()}
                    }
                    addClass(Styles.bottomMenu)
                }
            }


        }

    }
}