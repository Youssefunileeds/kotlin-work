// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

// to creates a triangle class with 3 side lengths
class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {

    // Checks whether the three sides can form a valid triangle
     init {
        val (y, x, z) = Triple(sideA, sideB, sideC)

        require(
            y > 0 && x > 0 && z > 0 &&
            y < x + z && x < y + z && z < y + x
        ) { "Invalid triangle sides: $y, $x, $z" }
    }

    // to be able to calculates the total perimeter of the triangle
    val perimeter: Double
        get() = sideA + sideB + sideC

    // to be able to calculates half of the perimeter
    val semiPerimeter: Double
        get() = perimeter / 2

    //so we can  calculates the area using Heron's formula
    val area: Double
        get() {
            val (y, x, z) = Triple(sideA, sideB, sideC)
            val s = semiPerimeter

            return sqrt(s * (s - y) * (s - x) * (s - z))
        }

    // to returns the triangles side lengths as a readable string
    override fun toString(): String {
        return "Triangle($sideA, $sideB, $sideC)"
    }
}
