// IGNORE_BACKEND: JS_IR
// EXPECTED_REACHABLE_NODES: 1108
package foo

fun box(): String {
    var i = 0
    var b = true
    while (i < 100) {
        ++i;
        if (i >= 1) {
            continue;
        }
        b = false;
    }

    return if (b) "OK" else "fail"
}