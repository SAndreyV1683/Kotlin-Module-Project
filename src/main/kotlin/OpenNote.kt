import Archive.archive


class OpenNote(create: String, exit: String): Screen() {

    private val menuList = arrayListOf(create, exit)
    private var archName = ""
    override fun startScreen(archiveName: String, noteName: String) {
        archName = archiveName
        println("Заметка: $noteName")
        menuList.forEachIndexed { index, element -> println("$index. $element") }
        var input = -1

        while (input != menuList.size - 1) {
            input = scanner.nextInt()
            if (input == 0) {
                println("Текст заметки: ${archive[archiveName]?.get(noteName)}")

            } else if (input == menuList.size - 1) {
                showPreviousScreen(archName, this)
                break
            }
        }
    }
}