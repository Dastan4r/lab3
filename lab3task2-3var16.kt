import kotlin.math.*;

fun main () {
    var x = -1.0;
    var y = -4.0;
    var16z2(x, y);
    var16z3(x);
}

fun var16z2(x: Double, y: Double): Boolean {
    var pointInRadius = (x - 0).pow(2) + (y - 0).pow(2) < 2.0.pow(2)
    var pointInSquare = x in 0.0..-2.0 && y in 0.0..-2.0

    return pointInRadius || pointInSquare
}

fun var16z3(x: Double) : Double {
    return if(x <= -1) {
        1.0
    } else if (x in 0.0..2.0) {
        abs(x.pow(2));
    } else {
        -2.0;
    }
}