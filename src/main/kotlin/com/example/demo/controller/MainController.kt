package com.example.demo.controller

import javafx.beans.property.SimpleStringProperty
import tornadofx.Controller

class MainController:Controller(){
    val labelText = SimpleStringProperty()
    val imagePath = SimpleStringProperty()
}