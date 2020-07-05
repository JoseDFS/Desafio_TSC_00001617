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

class EnsamblajeView : View("My View") {
    //val mainController: MainController  by inject()
    override val root = borderpane {
        addClass(Styles.center)
        top {
            hbox {
                alignment = Pos.CENTER
                addClass(Styles.top)
                label("Ensamblaje") {
                    addClass(Styles.heading)

                }
            }

        }
        center {
            minHeight = 790.0
            hbox {
                alignment = Pos.CENTER
                spacing = 30.0
                val s = slideshow {
                    //spacing = 50.0
                    defaultTransition = ViewTransition.Swap(0.5.seconds)
                    slide(E1::class, ViewTransition.Metro(0.5.seconds))
                    slide(E2::class, ViewTransition.Metro(0.5.seconds))
                    slide(E3::class, ViewTransition.Metro(0.5.seconds))
                    slide(b::class, ViewTransition.Metro(0.5.seconds))
                    //slide(E5::class, ViewTransition.Metro(0.5.seconds))
                    //slide(E6::class, ViewTransition.Metro(0.5.seconds))

                }
                vbox {
                    alignment= Pos.CENTER
                    spacing = 30.0
                    addClass(Styles.buttonEnsamble)
                    button ("Anterior Elemento"){
                        action {s.previous()}

                    }
                    button ("Siguiente Elemento"){
                        action {s.next()}
                    }
                    //addClass(Styles.bottomMenu)
                }
            }


        }

    }


}


class E1 : View() {
    override val root = borderpane {
        center {
            hbox {
                alignment =Pos.CENTER
                spacing = 20.0
                imageview {
                    image = Image("Ensamblaje/E1.gif",1100.0,700.0,false,true)
                }
            }

        }
    }
}
class E2 : View() {
    override val root = borderpane {
        center {
            hbox {
                alignment =Pos.CENTER
                spacing = 20.0
                imageview {
                    image = Image("Ensamblaje/E2.gif",1100.0,700.0,false,true)
                }
            }

        }
    }
}
class E3 : View() {
    override val root = borderpane {
        center {
            hbox {
                alignment =Pos.CENTER
                spacing = 20.0
                imageview {
                    image = Image("Ensamblaje/E3.gif",1100.0,700.0,false,true)
                }
            }

        }
    }
}
class b : View() {
    override val root = borderpane {
        center {
            hbox {
                alignment =Pos.CENTER
                spacing = 20.0
                imageview {
                    image = Image("Ensamblaje/b.gif",1100.0,700.0,false,true)
                }
            }

        }
    }
}





