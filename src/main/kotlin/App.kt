import java.util.Stack

object App {
    val archive = mutableMapOf<String, MutableMap<String, String>>()
    val forwardStack = Stack<Screen>()
    val backwardStack = Stack<Screen>()
    fun pushToStack() {
        forwardStack.push(OpenNote("Открыть заметку", "Предыдущий экран"))
        forwardStack.push(OpenArchive("Создать заметку", "Предыдущий экран "))
        forwardStack.push(ArchivesScreen("Создать архив", "Выход "))
    }
}