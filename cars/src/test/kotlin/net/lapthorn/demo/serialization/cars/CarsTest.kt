package net.lapthorn.demo.serialization.cars

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class CarsTest {
    @Test fun testConstructor() {
        val car = Car("ford")
        assertEquals("ford", car.name)
    }
}
