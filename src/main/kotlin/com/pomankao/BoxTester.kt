package com.pomankao.kotlin

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("You can enter -1 to leave.")
    choiceBox(scanner)
}

private fun choiceBox(scanner: Scanner) {
    val isExit = false
    do {
        print("Please enter object's length: ")
        val length = scanner.nextFloat()
        if (length.isExit()) break
        print("Please enter object's width: ")
        val width = scanner.nextFloat()
        if (width.isExit()) break
        print("Please enter object's height: ")
        val height = scanner.nextInt()
        if (height.isExit()) break

        val box = when {
            Box3().validate(
                length,
                width,
                height
            ) -> "The ${Box3().getName()} is recommended for you, ${Box3().printBoxInfo()}"
            Box5().validate(
                length,
                width,
                height
            ) -> "The ${Box5().getName()} is recommended for you, ${Box5().printBoxInfo()}"
            else -> "Sorry! There is no available box for you."
        }
        println(box)
    } while (!isExit)
}

fun Float.isExit(): Boolean {
    return (this == -1f)
}

fun Int.isExit(): Boolean {
    return this == -1
}

interface IBox {
    var bLength: Float
    var bWidth: Float
    var bHeight: Int

    fun validate(length: Float, width: Float, height: Int): Boolean
    fun printBoxInfo(): String
    fun getName(): String
}

abstract class Box(override var bLength: Float, override var bWidth: Float, override var bHeight: Int): IBox {

    override fun validate(length: Float,width: Float,height: Int): Boolean
            = (bLength > length) && (bWidth > width) && (bHeight > height)

    override fun printBoxInfo(): String = "The box size is length: $bLength, width: $bWidth, height: $bHeight."
}

class Box3: Box(23f,14f,13) {
    override fun getName() = "Box3"
}

class Box5: Box(39.5f,27.5f,23) {
    override fun getName() = "Box5"
}