fun main() {
    App.pushToStack()
    val screen = App.forwardStack.pop()
    screen.startScreen()
}