class Archive {

    private var menuItems: MutableList<String> = mutableListOf("Выход из приложения", "Создать архив")

    private fun printMenu() {
        println("Список архивов:")
        menuItems.forEachIndexed { index, element -> println("$index. $element") }
    }

    private fun createArchive() {
        scanner.nextLine()
        println("Придумайте название архиву")
        while (true) {
            val nameArchive = scanner.nextLine().trim()
            if (nameArchive.isEmpty()) {
                println("Пустая строка или строка отсутствует")
            } else {
                menuItems.add(nameArchive)
                println("Архив '$nameArchive' добавлен")
                break
            }
        }
    }

    private fun selectArchive(currencyArchive: Int) {
        val nameArchive: String = menuItems[currencyArchive]
        Note(nameArchive).menu
    }

    val menu = Handler().menu(
        menuItems = menuItems,
        printMenu = { printMenu() },
        create = { createArchive() },
        itemSelect = { scanner.nextLine(); selectArchive(it) }
    )

}
