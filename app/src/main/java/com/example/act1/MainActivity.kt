package com.example.act1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        llamarBoton()
        SaltarVen2()
        /*

         /* Lenguaje de koptlin */
        /*
        var firtVariable = "Hola mundo"
        println(firtVariable)
        var secondVariable = "Jhoel Ordonez"
        println(secondVariable)
        firtVariable = "Hola mundo 2"
        println(firtVariable)
        val firtConstant = "Presidente"
        println(firtConstant)
        val secondConstant = firtConstant
        println(secondConstant)
        val myString = "Hola Android"
        val myString2 = "Desarrollo de plataformas móviles"
        val myString3 = myString + "" + myString2
        println(myString3)

        // Enteros
        val myInt = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        println(myInt3)

        // Decimales
        val myFloat = 1.5f
        val myDouble = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1
        val myDouble4 = myDouble + myDouble2 + myDouble3
        println(myDouble4)

        // Booleanos
        val myBool = true
        val myBool2 = false
        println(myBool == myBool2)
        println(myBool && myBool2)

        var myNumber = myInt3

        val county = "Colombia"

        when(county){
            "Ecuador", "Colombia", "Peru" -> {
                println("Idioma Español")}
        }
        val name = "Jhoel"
        val surname = "Ordoñez"
        val university = "UTPL"
        val age = "21"
        val myArray = arrayListOf<String>()
        myArray.add(name)
        myArray.add(surname)
        myArray.add(university)
        myArray.add(age)

        println(myArray)
        myArray.addAll(listOf("Hola", "Curso de android"))
        println(myArray)

        myArray.removeAt(4)
        println(myArray)

        myArray.forEach{
            println(it)
        }

        println(myArray.count())
        println(myArray.count())
        myArray.first()
        myArray.last()
        myArray.sort()
        myArray.clear()

        var myMap: Map<String,Int> = mapOf()

        myMap = mutableMapOf("Ramiro" to 1, "Pedro" to 2, "Sara" to 5, "6" to 6)
        println(myMap)
        myMap["Carlos"] = 7
        myMap.put("Abigail", 8)
        println(myMap)
        myMap.put("Samantha", 8)
        println(myMap["Samantha"])

        myMap.remove("Samantha")


        /* Ejercicio 1 */

        var cedula = 1900691161
        var comprobar = 212121212

        var lista = cedula.toString().map { it.toString().toInt() }
        var listaC = comprobar.toString().map { it.toString().toInt() }
        var contador = 0
        var c = 0
        var redo= 0
        for( i in 0 until lista.size -1){

            contador = lista[i] * listaC[i]
            if(contador >= 10){
                var num = contador.toString().map { it.toString().toInt() }
                contador = num.sum()
            }
            c += contador
        }
        redo = redondearAMultiploDeDiez(c)
        var final = redo - c
        println("hola "+final)
        println(redo)
        if(final == lista.last()){
            println("El numero " +final +"es igual al ultimo valor de la lista que es: "+lista.last())
        }

        /* Ejercicio 2 */

        var array = arrayListOf<Int>(2,5,7,15,96,41,5,8,10,14,27,35,62,45,24,14,42,15,63,18)
        val listaPar = arrayListOf<Int>()
        val listaImpar = arrayListOf<Int>()
        for(j in array){
            if(j % 2 == 0){
                listaPar.add(j)
            }else{
                listaImpar.add(j)
            }
        }
        println("Lista par \n" +listaPar)
        println("Lista Impar \n" +listaImpar)

        /* Ejercicio 3 */

        val personas = listOf(
            Person("Jhoel", "1900691161", 80, "soltero"),
            Person("Gerald", "1900691161", 30, "casado"),
            Person("Jamil", "1900691161", 65, "soltero"),
            Person("Gabby", "1900691161", 58, "soltero"),
            Person("Ximena", "1900691161", 10, "divorciado")
        )

        val mayoresDeEdadSolteros = personas.filter { it.edad > 60 && it.estadoCivil == "soltero" }

        if (mayoresDeEdadSolteros.isEmpty()) {
            println("No hay personas mayores de 60 años con estado civil 'soltero'.")
        } else {
            println("Personas mayores de 60 años con estado civil 'soltero':")
            for (persona in mayoresDeEdadSolteros) {
                println("Nombre: ${persona.nombre}, Cédula: ${persona.cedula}, Edad: ${persona.edad}")
            }
        }*/

         */
    }
/*
    fun redondearAMultiploDeDiez(c: Int): Int {
        return (c + 9) / 10 * 10
    }
*/
/*
    data class Person(val nombre: String, val cedula: String, val edad: Int, val estadoCivil: String)
*/
    fun llamarBoton(){
        val boton1= findViewById<Button>(R.id.btn_01)
        val tw_01= findViewById<TextView>(R.id.tw_01)
        boton1.setOnClickListener(){
            tw_01.setText("Hola este es un nuevo mensaje")
        }
    }
    fun SaltarVen2(){
        val botom2 = findViewById<Button>(R.id.btn_02)
        botom2.setOnClickListener(){
            val saltar:Intent=Intent(this,Ventana2::class.java)
            startActivity(saltar)
        }

    }
}