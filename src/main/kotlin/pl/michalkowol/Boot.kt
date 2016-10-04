package pl.michalkowol

import com.google.inject.Guice

fun main(args: Array<String>) {
    val injector = Guice.createInjector(CalcModule())
    val app = injector.getInstance(App::class.java)
    println(app.start())
}