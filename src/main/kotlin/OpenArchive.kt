import App.archive

class OpenArchive(create: String, exit: String): Screen(create, exit) {
    override fun startScreen(archiveName: String, noteName: String) {

        println("Список заметок в архиве $archiveName:")
        createNewArchiveMenu(archiveName)
        showMenu()
        var input = -1

        while (input != menuList.size - 1) {
            input = getNavNumber(menuList.size - 1)
            if (input == 0) {
                println("Введите название заметки")
                val nName = getText()
                val notes = archive[archiveName]
                println("Введите текст заметки")
                notes?.set(nName, getText())
                menuList.add(1, nName)
                showMenu()
            } else if (input < menuList.size - 1) {
                showNextScreen(archiveName, menuList[input], this)
                break
            } else if (input == menuList.size - 1) {
                showPreviousScreen("",this)
            }
        }
    }
}