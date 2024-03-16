class Handler {

    fun menu(
        menuItems: MutableList<String>,
        printMenu: () -> Unit,
        create: () -> Unit,
        itemSelect: (Int) -> Unit
    ) {
        while (true) {
            printMenu()
            if (scanner.hasNextInt()) {
                when (val number = scanner.nextInt()) {
                    0 -> {
                        scanner.nextLine()
                        return println(menuItems[0])
                    }
                    1 -> create()
                    in 2 until menuItems.size -> itemSelect(number)
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

    fun menuViewNote(
        menuItems: MutableList<String>,
        printMenu: () -> Unit,
        itemSelect: () -> Unit
    ) {
        while (true) {
            printMenu()
            if (scanner.hasNextInt()) {
                when (scanner.nextInt()) {
                    0 -> {
                        scanner.nextLine()
                        return println(menuItems[0])
                    }
                    1 -> itemSelect()
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

}