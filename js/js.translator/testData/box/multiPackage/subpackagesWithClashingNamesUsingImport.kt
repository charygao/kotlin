// IGNORE_BACKEND: JS_IR
// EXPECTED_REACHABLE_NODES: 1109
// FILE: a.kt
package a.foo

import b.foo.f

fun box() = if (f() == 1) "OK" else "fail"


// FILE: b.kt
package b.foo

fun f() = 1