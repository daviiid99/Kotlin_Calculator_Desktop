import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
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


fun assignNumberToArraySpace (list: List<Double>, number: Double):  Int {
    var found: Boolean = true
    var position = 0

    while (found) {
        for (n in 0 until 9) {
            if (list[n] == 0.0) {
                position = n
                found = false
            }
        }
    }
    return position
}

fun assignSymbolToArraySpace(list: List<String>):  Int {
    var found: Boolean = true
    var position = 0

    while (found) {
        for (n in 0 until 9) {
            if (list[n] == "") {
                position = n
                found = false
            }
        }
    }
    return position
}


fun main() = application {

    Window(
        onCloseRequest = ::exitApplication,
        title = "Kotlin Calculator for Desktop",
        state = rememberWindowState(width = 300.dp, height = 400.dp),

    ) {
        MaterialTheme(colors = darkColors()) {
            Box(Modifier.fillMaxSize().background(MaterialTheme.colors.background))
        }
        var arrayNumbers = remember {
            listOf<Double>(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
        }.toMutableList()

        var arraySymbols = remember {
            listOf<String>("", "", "", "", "", "", "", "", "")
        }.toMutableList()

        var position = remember {
            0
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
            mutableStateOf(0.0)
        }

        var symbol = remember {
            mutableStateOf("")
        }
        var display = remember {
            mutableStateOf("Type your number :)")
        }

        var displayOperation = remember {
            mutableStateOf("Type your operation :)")
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
                            // Show on display the number
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
                            // Save the number into an array
                            if (count.value != ""){
                                position =  assignNumberToArraySpace(arrayNumbers, (count.value).toDouble())
                                arrayNumbers[position] =  (count.value).toDouble()
                                count.value = ""
                            }

                            // Guardar el simbolo
                            symbol.value = "/"
                            displayOperation.value = "/"

                            // Save the number into an array
                            position =  assignSymbolToArraySpace(arraySymbols)
                            arraySymbols[position] =  "/"

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
                            displayOperation.value = display.value

                        }) {
                        Text("6")
                    }

                    Button(
                        onClick = {
                            // Save the number into an array
                            if (count.value != ""){
                                position =  assignNumberToArraySpace(arrayNumbers, (count.value).toDouble())
                                arrayNumbers[position] =  (count.value).toDouble()
                                count.value = ""
                            }

                            // Guardar el simbolo
                            symbol.value = "x"
                            displayOperation.value = "x"

                            // Save the number into an array
                            position =  assignSymbolToArraySpace(arraySymbols)
                            arraySymbols[position] =  "x"

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
                            if (count.value != ""){
                                position =  assignNumberToArraySpace(arrayNumbers, (count.value).toDouble())
                                arrayNumbers[position] =  (count.value).toDouble()
                                count.value = ""
                            }

                            // Guardar el simbolo
                            symbol.value = "-"
                            displayOperation.value = "-"

                            // Save the number into an array
                            position =  assignSymbolToArraySpace(arraySymbols)
                            arraySymbols[position] =  "-"

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
                            displayOperation.value = display.value

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
                            // Save the number into an array
                            position =  assignNumberToArraySpace(arrayNumbers, (count.value).toDouble())
                            arrayNumbers[position] =  (count.value).toDouble()
                            count.value = ""

                            // W.I.P

                            var result = 0.0
                            for (n in arrayNumbers) {
                                if (symbol.value == "+") {
                                    result += n
                                }
                                if (symbol.value == "-") {
                                    if (n >= result) {
                                        result = n - result
                                    } else if (result < n) {
                                        result -= n
                                    }
                                }
                                if (symbol.value == "x") {
                                    if (n != 0.0) {
                                        if (result == 0.0){
                                            result = n

                                        } else if (n != 0.0 && result != 0.0 && numberResult.value == 0.0) {
                                            result = result * n

                                        } else if (numberResult.value > 0.0) {
                                            result = numberResult.value * result
                                        }


                                    }
                                }
                                if (symbol.value == "/") {
                                    if (n != 0.0){
                                        result /= n
                                    }

                                }
                            }

                            // Si existe un resultado previo
                            // Lo añadimos al total con el operando correspondiente
                            if (numberResult.value != 0.0 && symbol.value == "+"){
                                result = result + numberResult.value

                            }
                            if (symbol.value == "-"){
                                result = numberResult.value - result

                            }
                            if (numberResult.value != 0.0 && symbol.value == "/") {
                                if (numberResult.value > result ){
                                    result = numberResult.value / result

                                }


                            }

                            // Vaciamos al array de posiciones para nuevos digitos
                            arrayNumbers =  listOf<Double>(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0).toMutableList()

                            // Preparamos el resultado para mostrarlo por pantalla
                            display.value = "${result}"
                            result = (display.value).toDouble()
                            numberResult.value = result
                            displayOperation.value =  display.value
                            symbol.value = ""


                        }) {
                        Text("=")
                    }

                    Button(
                        onClick = {
                            // Save the number into an array
                            if (count.value != ""){
                                position =  assignNumberToArraySpace(arrayNumbers, (count.value).toDouble())
                                arrayNumbers[position] =  (count.value).toDouble()
                                count.value = ""
                            }

                            // Guardar el simbolo
                            symbol.value = "+"
                            displayOperation.value = "+"

                            position =  assignSymbolToArraySpace(arraySymbols)
                            arraySymbols[position] =  "+"
                        }) {
                        Text("+")
                    }

        
                }


            }

            }
        }
    }