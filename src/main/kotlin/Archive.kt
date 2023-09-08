import java.util.Stack

object Archive {
    val archive = mutableMapOf<String, Map<String, String>>()
    val notes = mutableMapOf<String, String>()
    val forwardStack = Stack<Screen>()
    val backwardStack = Stack<Screen>()
    fun pushToStack() {
        forwardStack.push(OpenNote("Открыть заметку", "Выход"))
        forwardStack.push(OpenArchive("Открыть архив", "Выход "))
        forwardStack.push(ArchivesScreen("Создать архив", "Выход "))
    }
}