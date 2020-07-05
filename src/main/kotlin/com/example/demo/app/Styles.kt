package com.example.demo.app

import javafx.scene.text.FontWeight
import tornadofx.*
import javafx.scene.paint.Color
import java.awt.Image
import java.net.URI


class Styles : Stylesheet() {
    companion object {
        val heading by cssclass()
        val bottomMenu by cssclass()
        val top by cssclass()
        val label_t by cssclass()
        val center by cssclass()
        val buttonEnsamble by cssclass()
        val ini by cssclass()
        val heading_m by cssclass()

    }

    init {
        heading {
            padding = box(10.px)
            fontSize = 30.px
            fontWeight = FontWeight.BOLD
            spacing = 50.px
            // = Color.WHITE
        }
        heading_m {
            padding = box(10.px)
            fontSize = 30.px
            fontWeight = FontWeight.BOLD
            spacing = 50.px
            textFill = Color.WHITE
        }
        label_t{
            padding = box(10.px)
            fontSize = 20.px
            fontWeight = FontWeight.BOLD
            spacing = 50.px
        }
        bottomMenu {
            backgroundColor = multi(c("#406580"))
            fontSize = 20.px
            button{
                textFill = Color.WHITE
                backgroundColor= multi(c("#36393F"))
                and(hover){
                    backgroundColor= multi( c("#7289DA"))
                }
            }

        }
        top {
            backgroundColor = multi(c("#888c8f"))
        }
        center {
            backgroundColor = multi(c("#fff"))
        }
        buttonEnsamble {
            fontSize = 20.px
            button{
                textFill = Color.WHITE
                backgroundColor= multi(c("#36393F"))
                and(hover){
                    backgroundColor= multi( c("#7289DA"))
                }
            }

        }
        ini {
            backgroundColor = multi(c("#000"))

        }

    }
}