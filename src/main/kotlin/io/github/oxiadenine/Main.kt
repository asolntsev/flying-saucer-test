package io.github.oxiadenine

import org.xhtmlrenderer.simple.ImageRenderer
import java.io.File

object ResourceLoader

fun main() {
    val xhtmlFile = ResourceLoader.javaClass.classLoader.getResource("test.html")
    val imageFile = File("build/test.png")

    ImageRenderer.renderToImage(xhtmlFile!!.toExternalForm(), imageFile.absolutePath, 2048)
}