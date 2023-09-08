import java.util.Scanner

class ArchivesScreen(create: String, exit: String): Screen(create, exit) {
    override fun startScreen() {
        println("Список архивов:")
        val menuList = arrayListOf("Создать архив", "Выход")
        menuList.forEachIndexed { index, element -> println("$index. $element") }
        val input = scanner.nextInt()
        if (input == 0) {

        } else if (input == menuList.size - 1) {

        }
    }

    override fun showNextScreen() {

    }

    override fun showPreviousScreen() {

    }


}