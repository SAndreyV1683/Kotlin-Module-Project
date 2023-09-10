import App.archive
import java.util.Scanner

class ArchivesScreen(create: String, exit: String): Screen() {

    private val menuList = arrayListOf(create, exit)
    override fun startScreen(archiveName: String, noteName: String) {
        println("Список архивов:")
        menuList.forEachIndexed { index, element -> println("$index. $element") }
        var input = -1

        while (input != menuList.size - 1) {
            input = getNavNumber(menuList.size - 1)
            if (input == 0) {
                println("Введите название архива")
                scanner = Scanner(System.`in`)
                val archName = scanner.nextLine()
                archive[archName] = mutableMapOf()
                menuList.add(1, archName)
                menuList.forEachIndexed { index, element -> println("$index. $element") }
            } else if (input < menuList.size - 1) {
                showNextScreen(menuList[input], "", this)
                break
            }
        }
    }
}