// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(triangle: Triangle): Boolean {  // To checks whether three side lengths might form a real triangle
    val (y, x, z) = triangle // Basically to unpack the three side lengths
    return y < x + z && x < y + z && z < y + x // everyside must be smaller than the sum of the other 2
}
// to calculate the area of the triangle from its lengths
fun triangleArea(triangle: Triangle): Double {
    if (!isValidTriangle(triangle)) return 0.0 // Invalid triangle so 0
    val (y, x, z) = triangle 
    val s = (y + x + z) / 2 
    return sqrt(s * (s - y) * (s - x) * (s - z)) // Heron's formula gives the area
}
