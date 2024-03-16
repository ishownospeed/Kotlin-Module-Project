fun main(args: Array<String>) {
    println("Добро пожаловать в приложение \"заметки\"")
    Archive().menu

}

/*
class Note(val name: String) {

    private val scanner: Scanner = Scanner(System.`in`)

    var menuItems: MutableList<String> = mutableListOf("Вернуться на предыдущий экран", "Создать заметку")
    *//*var menuItems: MutableMap<String, MutableList<String>> =
        mutableMapOf(name to mutableListOf("Вернуться на предыдущий экран", "Создать заметку"))*//*

    var listN: MutableList<String> = mutableListOf()
    fun start() {
        while (true) {
            println("Архив '$name'")
            printMenu()
            if (scanner.hasNextInt()) {
                when (val a = scanner.nextInt()) {
                    0 -> {
                        println("Возвращаемся")
                        break
                    }
                    1 -> createNote()
                    else -> println("Введите цифру из имеющегося меню")
                }
            } else {
                println("Введите цифру")
                scanner.nextLine()
            }
        }
    }

    private fun createNote() {
        scanner.nextLine()
        println("Напишите заметку")
        while (true) {
            val note = scanner.nextLine().trim()
            if (note.isEmpty()) {
                println("Пустая строка или строка отсутствует")
            } else {
                menuItems.add(note)
                listN.add(note)
                //notes[Archive(name)] = listN
                println("Заметка '$note' добавлена\n")
                break
            }
        }
    }

    private fun printMenu() {
        println("Список заметок:")
        menuItems.forEachIndexed { index, element -> println("$index. $element") }
    }
}*/
/*

import java.util.Scanner


class Archive {

    //private var listArchives: MutableList<Archive> = mutableListOf()
    private var menuItems: MutableList<String> = mutableListOf("Выход", "Создать архив")
    private val scanner: Scanner = Scanner(System.`in`)

    //var notes: MutableMap<Archive,MutableList<String>> = mutableMapOf()

    fun start() {
        while (true) {
            printMenu()
            if (scanner.hasNextInt()) {
                when (val number = scanner.nextInt()) {
                    0 -> return println("Выход из приложения")
                    1 -> createArchive()
                    in 2 until menuItems.size -> {
                        val nameArchive = menuItems[number]
                        */
/*if (notes.containsKey(Archive(nameArchive))){
                            Archive(nameArchive).menuItems.add(notes.getValue(Archive(nameArchive)).toString())
                        }*//*


                        Note(nameArchive).start()
                    }
                    else -> println("Введите цифру из имеющегося меню")
                }
            } else {
                println("Введите цифру")
                scanner.nextLine()
            }
        }
    }

    private fun createArchive() {
        scanner.nextLine()
        println("Придумайте название архиву")
        while (true) {
            val nameArchive = scanner.nextLine().trim()
            if (nameArchive.isEmpty()) {
                println("Пустая строка или строка отсутствует")
            } else {
                //listArchives.add(Archive(nameArchive))
                menuItems.add(nameArchive)
                println("Архив '$nameArchive' добавлен")
                break
            }
        }
    }

    private fun printMenu() {
        println("Список архивов:")
        menuItems.forEachIndexed { index, element -> println("$index. $element") }
    }
}
*/
