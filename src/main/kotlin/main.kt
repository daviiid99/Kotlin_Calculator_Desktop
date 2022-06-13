import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
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
    // Declaration of operation variables
    var contador : String = "0.0"
    var display : Double = contador.toDouble()

    Window(
        onCloseRequest = ::exitApplication,
        title = "Kotlin Calculator for Desktop",
        state = rememberWindowState(width = 300.dp, height = 400.dp)

    ) {
        var count = remember {
            mutableStateOf("")
        }
        var numberOne = remember {
            mutableStateOf(0.0)
        }

        var numberTwo = remember {
            mutableStateOf(0.0)
        }

        var symbol = remember {
            mutableStateOf("")
        }
        var display = remember {
            mutableStateOf("Type your number :)")
        }
        MaterialTheme {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.background(Color.Black)
            ) {
                Text(
                    text = "",
                    style = typography.h5,
                    color = Color.White,
                    textAlign = TextAlign.Start,
                    modifier = Modifier.background(Color.Black),
                )
                Text(
                    text = "${display.value}",
                    style = typography.h5,
                    color = Color.White,
                    textAlign = TextAlign.Start,
                    modifier = Modifier.background(Color.Black),
                )
                Text(
                    text = "",
                    style = typography.h5,
                    color = Color.White,
                    textAlign = TextAlign.Start,
                    modifier = Modifier.background(Color.Black),
                )
                Text(
                    text = "",
                    style = typography.h5,
                    color = Color.White,
                    textAlign = TextAlign.Start,
                    modifier = Modifier.background(Color.Black),
                )
                Row(modifier = Modifier
                    .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                    Button(
                        onClick = {
                            var number : String = count.value +  "1"
                            count.value = number
                            display.value = "${count.value}"


                        }) {
                        Text("1")
                    }

                    Button(
                        onClick = {
                            var number : String = count.value +  "2"
                            count.value = number
                            display.value = "${count.value}"
                        }) {
                        Text("2")
                    }

                    Button(
                        onClick = {
                            var number : String = count.value +  "3"
                            count.value = number
                            display.value = "${count.value}"
                        }) {
                        Text("3")
                    }

                    Button(
                        onClick = {
                            // Covertimos a double el primer numero y lo guardamos en una variable
                            // Lo usaremos mas tarde
                            numberOne.value = (count.value).toDouble()

                            // Vaciamos la cadena donde guardamos temporalmente los numeros
                            count.value = ""

                            // Guardar el simbolo
                            symbol.value = "/"

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
                        }) {
                        Text("4")
                    }

                    Button(
                        onClick = {
                            var number : String = count.value +  "5"
                            count.value = number
                            display.value = "${count.value}"
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
                            numberOne.value = (count.value).toDouble()

                            // Vaciamos la cadena donde guardamos temporalmente los numeros
                            count.value = ""

                            // Guardar el simbolo
                            symbol.value = "*"
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
                        }) {
                        Text("7")
                    }

                    Button(
                        onClick = {
                            var number : String = count.value +  "8"
                            count.value = number
                            display.value = "${count.value}"
                        }) {
                        Text("8")
                    }

                    Button(
                        onClick = {
                            var number : String = count.value +  "9"
                            count.value = number
                            display.value = "${count.value}"
                        }) {
                        Text("9")
                    }

                    Button(
                        onClick = {
                            // Covertimos a double el primer numero y lo guardamos en una variable
                            // Lo usaremos mas tarde
                            numberOne.value = (count.value).toDouble()

                            // Vaciamos la cadena donde guardamos temporalmente los numeros
                            count.value = ""

                            // Guardar el simbolo
                            symbol.value = "-"
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
                            // Covertimos a double el primer numero y lo guardamos en una variable
                            // Lo usaremos mas tarde
                            numberTwo.value = (count.value).toDouble()

                            // Vaciamos la cadena donde guardamos temporalmente los numeros
                            count.value = ""

                            // Guardar el simbolo
                            var resultado : Double = 0.0
                            if (symbol.value == "+"){
                                display.value = "${numberOne.value + numberTwo.value}"

                            } else if (symbol.value == "-"){
                                display.value = "${numberOne.value - numberTwo.value}"
                            } else if (symbol.value == "/"){
                                display.value = "${numberOne.value / numberTwo.value}"
                            } else {
                                display.value = "${numberOne.value * numberTwo.value}"
                            }



                        }) {
                        Text("=")
                    }

                    Button(
                        onClick = {
                            // Covertimos a double el primer numero y lo guardamos en una variable
                            // Lo usaremos mas tarde
                            numberOne.value = (count.value).toDouble()

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