package io.github.oxiadenine

import org.xhtmlrenderer.simple.ImageRenderer
import java.io.File

object ResourceLoader

fun main() {
    val xhtmlFile = ResourceLoader.javaClass.classLoader.getResource("test.xhtml")
    val imageFile = File("./data/test.png")

    ImageRenderer.renderToImage(xhtmlFile!!.toExternalForm(), imageFile.absolutePath, 2048)
}