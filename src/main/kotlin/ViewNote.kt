class ViewNote(private val nameNote: String) {

    private val menuItems: MutableList<String> =
        mutableListOf("Вернуться на предыдущий шаг", "Посмотреть заметку")

    private fun printMenu() {
        println("Заметка '$nameNote'")
        menuItems.forEachIndexed { index, element -> println("$index. $element") }
    }

    private fun viewContent() {
        println("Её описание: ${notes[nameNote]}")

        println("0. Вернуться на предыдущий шаг")
        while (true) {
            if (scanner.hasNextInt()) {
                when (scanner.nextInt()) {
                    0 -> {
                        scanner.nextLine()
                        return
                    }
                    else -> {
                        println("Введите цифру из имеющегося меню")
                        scanner.nextLine()
                    }
                }
            } else {
                println("Введите цифру")
                scanner.nextLine()
            }
        }
    }

    val menu = Handler().menuViewNote(
        menuItems = menuItems,
        printMenu = { printMenu() },
        itemSelect = { scanner.nextLine(); viewContent() }
    )
}