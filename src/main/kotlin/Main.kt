import java.util.Stack

fun main(args: Array<String>) {


    Archive.pushToStack()
    val screen = Archive.forwardStack.pop()
    Archive.backwardStack.push(screen)
    screen.startScreen()


}