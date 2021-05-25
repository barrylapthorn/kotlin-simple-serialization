package net.lapthorn.demo.serialization.cars

import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.io.Serializable

class Car(var name: String) : Serializable {
    private fun writeObject(oos : ObjectOutputStream) {
        println("Writing object")
        oos.writeUTF(name)
    }

    private fun readObject(ois : ObjectInputStream) {
        println("Reading object")
        name = ois.readUTF()
    }
}

