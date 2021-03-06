/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package net.lapthorn.demo.serialization.app

import net.lapthorn.demo.serialization.cars.Car
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream


fun main() {
    val car = Car("Ford")
    println("Serialized Car is a ${car.name}")

    val byteArrayOutputStream = ByteArrayOutputStream()
    ObjectOutputStream(byteArrayOutputStream).use { oos ->
        oos.writeObject(car)
        oos.flush()
    }
    byteArrayOutputStream.flush()
    val bytes = byteArrayOutputStream.toByteArray()
    byteArrayOutputStream.close()

    val byteArrayInputStream = ByteArrayInputStream(bytes)
    ObjectInputStream(byteArrayInputStream).use {
        val newCar = it.readObject() as Car
        println("Deserialized Car is a ${newCar.name}")
    }
    byteArrayInputStream.close()
}
