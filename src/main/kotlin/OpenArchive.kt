import App.archive


import java.util.Scanner

class OpenArchive(private val create: String, private val exit: String): Screen() {
    override fun startScreen(archiveName: String, noteName: String) {

        println("Список заметок в архиве $archiveName:")
        val menuList = arrayListOf(create, exit)
        archive[archiveName]?.keys?.toList()?.let { menuList.addAll(1, it) }

        menuList.forEachIndexed { index, element -> println("$index. $element") }
        var input = -1

        while (input != menuList.size - 1) {
            input = getNavNumber(menuList.size - 1)
            if (input == 0) {
                println("Введите название заметки")
                scanner = Scanner(System.`in`)
                val nName = scanner.nextLine()
                val notes = archive[archiveName]
                println("Введите текст заметки")
                notes?.set(nName, scanner.nextLine())
                menuList.add(1, nName)
                menuList.forEachIndexed { index, element -> println("$index. $element") }
            } else if (input < menuList.size - 1) {
                showNextScreen(archiveName, menuList[input], this)
                break
            } else if (input == menuList.size - 1) {
                showPreviousScreen("",this)
            }
        }
    }
}