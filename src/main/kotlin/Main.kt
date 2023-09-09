fun main() {
    Archive.pushToStack()
    val screen = Archive.forwardStack.pop()
    screen.startScreen()
}