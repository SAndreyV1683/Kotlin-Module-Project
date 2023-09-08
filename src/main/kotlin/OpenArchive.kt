class OpenArchive(create: String, exit: String): Screen(create, exit) {
    override fun startScreen() {
        println("Список заметок:")
        val menuList = arrayListOf("Создать заметку", "Выход")
        menuList.forEachIndexed { index, element -> println("$index. $element") }
    }

    override fun showNextScreen() {

    }

    override fun showPreviousScreen() {

    }
}