import kotlin.math.*;

fun main () {
    var x = -1.0;
    var y = -4.0;
    var1z2(x, y);
    var1z3(x);
}

fun var1z2(x: Double, y: Double): Boolean {
    var triangleAX = 0;
    var triangleAY = 0;
    var triangleBX = -4;
    var triangleBY = 0;
    var triangleCX = 0;
    var triangleCY = -4;

    var a = (triangleAX - x) * (triangleBY - triangleAY) - (triangleBX - triangleAX) * (triangleAY - y);
    var b = (triangleBX - x) * (triangleCY - triangleBY) - (triangleCX - triangleBX) * (triangleBY - y);
    var c = (triangleCX - x) * (triangleAY - triangleCY) - (triangleAX - triangleCX) * (triangleCY - y);

    var pointInTriangle = (a >= 0 && b >= 0 && c >= 0) || (a <= 0 && b <= 0 && c <= 0)
    var pointInRadius = (x - 0).pow(2) + (y - 0).pow(2) < 2.0.pow(2)
    var pointInSquare = x in 2.0..4.0 && y in 2.0..4.0

    return pointInTriangle || (pointInSquare && !pointInRadius)
}

fun var1z3(x: Double) : Double {
    return if(x == 0.0) {
        0.0;
    } else if (x < 0) {
        abs(x);
    } else {
        -x.pow(2);
    }
}