fun main(args: Array<String>) {
fun menu() {
    println("Возможные команды:")
    println("- Отобразить список задач (=)")
    println("- Добавить задачу (+)")
    println("- Отметить задачу как выполненную (^)")
    println("- Снять отметку о выполнении задачи с задачи (*)")
    println("- Удалить задачу(-)")
}

fun scanner(): String {
    return Scanner(System.`in`).next()
}
}