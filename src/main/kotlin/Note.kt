var archiveWithNotes: MutableMap<String, MutableList<String>> = mutableMapOf()

var notes: MutableMap<String, String> = mutableMapOf()
class Note(private val nameArchive: String) {

    private var menuItems: MutableList<String> =
        mutableListOf("Вернуться на предыдущий шаг", "Создать заметку")

    private fun printMenu() {
        println("Архив '$nameArchive'")
        println("Список заметок:")
        if (!archiveWithNotes.containsKey(nameArchive)) {
            menuItems.forEachIndexed { index, element -> println("$index. $element") }
        } else {
            archiveWithNotes.getValue(nameArchive).forEachIndexed { index, element -> println("$index. $element") }
        }
    }

    private fun createNote() {
        scanner.nextLine()
        println("Придумайте название заметке")
        while (true) {
            val note = scanner.nextLine().trim()
            if (note.isEmpty()) {
                println("Пустая строка или строка отсутствует")
            } else {
                if (archiveWithNotes.containsKey(nameArchive) && archiveWithNotes.getValue(nameArchive).size != menuItems.size) {
                    menuItems.addAll(archiveWithNotes.getValue(nameArchive))
                    menuItems.add(note)
                    archiveWithNotes[nameArchive]?.add(note)
                    createNoteDescription(note)
                    break
                }
                menuItems.add(note)
                archiveWithNotes[nameArchive] = menuItems
                createNoteDescription(note)
                break
            }
        }
    }

    private fun createNoteDescription(note: String) {
        println("Добавьте описание заметке")
        while (true) {
            val description = scanner.nextLine().trim()
            if (description.isEmpty()) {
                println("Пустая строка или строка отсутствует")
            } else {
                notes[note] = description
                println("Заметка '$note' с описанием \"$description\" добавлена")
                break
            }
        }
    }

    private fun selectNote(currencyNote: Int) {
        val nameArchive: String = archiveWithNotes.getValue(nameArchive)[currencyNote]
        ViewNote(nameArchive).menu
    }

    private val selectMenu: MutableList<String> =
        if (!archiveWithNotes.containsKey(nameArchive)) {
            menuItems
        } else {
            archiveWithNotes.getValue(nameArchive)
        }

    val menu = Handler().menu(
        menuItems = selectMenu,
        printMenu = { printMenu() },
        create = { createNote() },
        itemSelect = { scanner.nextLine(); selectNote(it) }
    )

}