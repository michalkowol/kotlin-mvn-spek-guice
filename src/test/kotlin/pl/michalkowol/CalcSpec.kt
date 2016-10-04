package pl.michalkowol

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.*
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith
import kotlin.test.*

@RunWith(JUnitPlatform::class)
class CalcSpec : Spek({

    describe("a calculator") {
        val calculator = Calc()

        it("should return the result of adding the first number to the second number") {
            val sum = calculator.sum(2, 4)
            assertEquals(6, sum)
        }

        it("should return the result of subtracting the second number from the first number") {
            val subtract = calculator.subtract(2, 4)
            assertEquals(-2, subtract)
        }
    }
})
