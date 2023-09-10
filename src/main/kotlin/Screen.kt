import App.backwardStack
import App.forwardStack
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
    open fun getNavNumber(maxValue: Int): Int {
        var isNumber = false
        var navNumber = -1
        while (!isNumber) {
            if (scanner.hasNextInt()) {
                navNumber = scanner.nextInt()
                if (navNumber > maxValue || navNumber < 0) {
                    println("Введите число в диапазоне от 0 до $maxValue")
                    scanner = Scanner(System.`in`)
                } else {
                    isNumber = true
                }
            } else if (scanner.hasNextFloat()) {
                println("Введите целое число!")
                scanner = Scanner(System.`in`)
            } else {
                println("Введите число!")
                scanner = Scanner(System.`in`)
            }
        }
        return navNumber
    }
}