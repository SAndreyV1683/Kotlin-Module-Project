import App.archive


class OpenNote(create: String, exit: String): Screen(create, exit) {

    private var archName = ""
    override fun startScreen(archiveName: String, noteName: String) {
        archName = archiveName
        println("Заметка: $noteName")
        showMenu()
        var input = -1

        while (input != menuList.size - 1) {
            input = getNavNumber(menuList.size - 1)
            if (input == 0) {
                println("Текст заметки: ${archive[archiveName]?.get(noteName)}\n")
                showMenu()
            } else if (input == menuList.size - 1) {
                showPreviousScreen(archName, this)
                break
            }
        }
    }
}