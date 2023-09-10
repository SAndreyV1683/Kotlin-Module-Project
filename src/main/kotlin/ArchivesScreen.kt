import App.archive

class ArchivesScreen(create: String, exit: String): Screen(create, exit) {
    override fun startScreen(archiveName: String, noteName: String) {
        println("Список архивов:")
        showMenu()
        var input: Int

        while (true) {
            input = getNavNumber(menuList.size - 1)
            if (input == 0) {
                println("Введите название архива")
                val archName = getText()
                archive[archName] = mutableMapOf()
                menuList.add(1, archName)
                showMenu()
            } else if (input < menuList.size - 1) {
                showNextScreen(menuList[input], "", this)
                break
            } else if (input == menuList.size - 1) {
                break
            }
        }
    }
}