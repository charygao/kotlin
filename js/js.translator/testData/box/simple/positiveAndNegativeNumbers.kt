// IGNORE_BACKEND: JS_IR
// EXPECTED_REACHABLE_NODES: 1108
package foo

fun box(): String {
    val b = -3
    val c = +3
    return if ((c - b) == 6) "OK" else "fail"
}