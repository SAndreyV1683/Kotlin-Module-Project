import Archive.backwardStack
import Archive.forwardStack
import java.util.Scanner

abstract class Screen {
    open var scanner = Scanner(System.`in`)
    abstract fun startScreen(archiveName: String = "", noteName: String = "")
    open fun showNextScreen(archiveName: String = "", noteName: String = "", screen: Screen) {
        val sc = forwardStack.pop()
        backwardStack.push(screen)
        sc.startScreen(archiveName, noteName)
    }
    open fun showPreviousScreen(name: String, screen: Screen) {
        val sc = backwardStack.pop()
        forwardStack.push(screen)
        sc.startScreen(name)
    }
}