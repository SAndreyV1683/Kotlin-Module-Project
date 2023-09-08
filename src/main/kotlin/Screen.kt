import java.util.Scanner
import java.util.Stack

abstract class Screen(create: String, exit: String) {
    open val scanner = Scanner(System.`in`)


    abstract fun startScreen()
    abstract fun showNextScreen()
    abstract fun showPreviousScreen()
}