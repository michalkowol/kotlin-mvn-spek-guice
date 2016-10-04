package pl.michalkowol

import com.google.inject.AbstractModule
import com.google.inject.Inject

class Calc {
    fun sum(a: Int, b: Int): Int = a + b
    fun subtract(a: Int, b: Int): Int = a - b
}

interface Foo {
    fun foo(): String
}

class FooBar : Foo {
    override fun foo(): String = "fooBAR"
}

class FooBaz : Foo {
    override fun foo(): String = "FOObaz"
}

class App @Inject constructor(val calc: Calc, val foo: Foo) {
    fun start(): String {
        return "${calc.sum(1, 2)} ${foo.foo()}"
    }
}

class CalcModule : AbstractModule() {
    override fun configure(): Unit {
//        bind(Calc::class.java).`in`(Scopes.SINGLETON)
        bind(Foo::class.java).to(FooBaz::class.java)
    }
}