import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.material.darkColors
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState


fun main() = application {

    Window(
        onCloseRequest = ::exitApplication,
        title = "Kotlin Calculator for Desktop",
        state = rememberWindowState(width = 300.dp, height = 400.dp),

    ) {
        MaterialTheme(colors = darkColors()) {
            Box(Modifier.fillMaxSize().background(MaterialTheme.colors.background))
        }

        var count = remember {
            mutableStateOf("")
        }
        var numberOne = remember {
            mutableStateOf(0.0)
        }

        var numberTwo = remember {
            mutableStateOf(0.0)
        }

        var numberResult = remember {
            mutableStateOf(0.000)
        }

        var symbol = remember {
            mutableStateOf("")
        }
        var display = remember {
            mutableStateOf("Type your number :)")
        }

        var displayOperation = remember {
            mutableStateOf("Type your number :)")
        }

        MaterialTheme {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.background(Color(121212)),
            ) {
                Text(
                    text = "",
                    style = typography.h5,
                    color = Color.White,
                    textAlign = TextAlign.Start,
                    modifier = Modifier.background(Color(121212)),
                )
                Text(
                    text = "${displayOperation.value}",
                    style = typography.h5,
                    color = Color.White,
                    textAlign = TextAlign.Start,
                    modifier = Modifier.background(Color(121212)),
                )
                Text(
                    text = "",
                    style = typography.h5,
                    color = Color.White,
                    textAlign = TextAlign.Start,
                    modifier = Modifier.background(Color(121212)),
                )
                Text(
                    text = "",
                    style = typography.h5,
                    color = Color.White,
                    textAlign = TextAlign.Start,
                    modifier = Modifier.background(Color(121212)),
                )
                Row(modifier = Modifier
                    .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                    Button(
                        onClick = {
                            var number : String = count.value +  "1"
                            count.value = number
                            display.value = "${count.value}"
                            displayOperation.value = display.value


                        }) {
                        Text("1")
                    }

                    Button(
                        onClick = {
                            var number : String = count.value +  "2"
                            count.value = number
                            display.value = "${count.value}"
                            displayOperation.value = display.value

                        }) {
                        Text("2")
                    }

                    Button(
                        onClick = {
                            var number : String = count.value +  "3"
                            count.value = number
                            display.value = "${count.value}"
                            displayOperation.value = display.value

                        }) {
                        Text("3")
                    }

                    Button(
                        onClick = {
                            // Covertimos a double el primer numero y lo guardamos en una variable
                            // Lo usaremos mas tarde
                            if (numberResult.value == 0.000){
                                numberOne.value = (count.value).toDouble()
                            }

                            else {
                                numberOne.value = numberResult.value

                            }

                            // Vaciamos la cadena donde guardamos temporalmente los numeros
                            count.value = ""

                            // Guardar el simbolo
                            symbol.value = "/"
                            displayOperation.value = "/"

                        }) {
                        Text("÷")
                    }

        
                }

                Row(modifier = Modifier
                    .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                    Button(
                        onClick = {
                            var number : String = count.value +  "4"
                            count.value = number
                            display.value = "${count.value}"
                            displayOperation.value = display.value

                        }) {
                        Text("4")
                    }

                    Button(
                        onClick = {
                            var number : String = count.value +  "5"
                            count.value = number
                            display.value = "${count.value}"
                            displayOperation.value = display.value

                        }) {
                        Text("5")
                    }

                    Button(
                        onClick = {
                            var number : String = count.value +  "6"
                            count.value = number
                            display.value = "${count.value}"

                        }) {
                        Text("6")
                    }

                    Button(
                        onClick = {
                            // Covertimos a double el primer numero y lo guardamos en una variable
                            // Lo usaremos mas tarde
                            if (numberResult.value == 0.000){
                                numberOne.value = (count.value).toDouble()
                            }

                            else {
                                numberOne.value = numberResult.value

                            }

                            // Vaciamos la cadena donde guardamos temporalmente los numeros
                            count.value = ""

                            // Guardar el simbolo
                            symbol.value = "*"
                            displayOperation.value = "x"
                        }) {
                        Text("x")
                    }

        
                }

                Row(modifier = Modifier
                    .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                    Button(
                        onClick = {
                            var number : String = count.value +  "7"
                            count.value = number
                            display.value = "${count.value}"
                            displayOperation.value = display.value
                        }) {
                        Text("7")
                    }

                    Button(
                        onClick = {
                            var number : String = count.value +  "8"
                            count.value = number
                            display.value = "${count.value}"
                            displayOperation.value = display.value
                        }) {
                        Text("8")
                    }

                    Button(
                        onClick = {
                            var number : String = count.value +  "9"
                            count.value = number
                            display.value = "${count.value}"
                            displayOperation.value = display.value
                        }) {
                        Text("9")
                    }

                    Button(
                        onClick = {
                            // Covertimos a double el primer numero y lo guardamos en una variable
                            // Lo usaremos mas tarde
                            if (numberResult.value == 0.000){
                                numberOne.value = (count.value).toDouble()
                            }

                            else {
                                numberOne.value = numberResult.value

                            }

                            // Vaciamos la cadena donde guardamos temporalmente los numeros
                            count.value = ""

                            // Guardar el simbolo
                            symbol.value = "-"
                            displayOperation.value = "-"
                        }) {
                        Text("-")
                    }

        
                }

                Row(modifier = Modifier
                    .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                    Button(
                        onClick = {
                            var number : String = count.value +  "0"
                            count.value = number
                            display.value = "${count.value}"
                        }) {
                        Text("0")
                    }

                    Button(
                        onClick = {
                            count.value = "0.0"
                        }) {
                        Text(".")
                    }

                    Button(
                        onClick = {

                            // Almacenamos el primer numero
                            //numberOne.value = (count.value).toDouble()

                            // Covertimos a double el segundo numero y lo guardamos en una variable
                            // Lo usaremos mas tarde
                            numberTwo.value = (count.value).toDouble()

                            // Vaciamos la cadena donde guardamos temporalmente los numeros
                            count.value = ""

                            // Guardar el simbolo
                            if (symbol.value == "+"){
                                display.value = "${numberOne.value + numberTwo.value}"
                                displayOperation.value =  display.value

                            } else if (symbol.value == "-"){
                                display.value = "${numberOne.value - numberTwo.value}"
                                displayOperation.value =  display.value

                            } else if (symbol.value == "/"){
                                display.value = "${numberOne.value / numberTwo.value}"
                                displayOperation.value =  display.value

                            } else if (symbol.value == "*") {
                                display.value = "${numberOne.value * numberTwo.value}"
                                displayOperation.value =  display.value

                            }
                            // Salvamos el resultado actual para mas tarde
                            numberResult.value = (display.value).toDouble()


                        }) {
                        Text("=")
                    }

                    Button(
                        onClick = {
                            // Covertimos a double el primer numero y lo guardamos en una variable
                            // Lo usaremos mas tarde
                            if (numberResult.value == 0.000){
                                numberOne.value = (count.value).toDouble()
                            }

                            else {
                                numberOne.value = numberResult.value

                            }

                            // Vaciamos la cadena donde guardamos temporalmente los numeros
                            count.value = ""

                            // Guardar el simbolo
                            symbol.value = "+"
                        }) {
                        Text("+")
                    }

        
                }


            }

            }
        }
    }