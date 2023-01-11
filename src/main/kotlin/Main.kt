import java.util.*

fun main(args: Array<String>) {
    menu()
    val newTasks = TaskList()
    val doneTasks = TaskList()

    while (true) {
        print("Введите команду: ")
        val command = scanner()



        when(command) {
            "+" -> {
                print("Добавьте задачу: ")
                val task2 = scanner()
                newTasks.addTask(task2)
            }
            "=" -> {
                for (i in 0 .. newTasks.getValue().size -1) {
                    print("Невыполненные задачи: $i")
                    print(": ")
                    println(newTasks.getValue()[i])
                }
                for (i in 0 .. doneTasks.getValue().size -1) {
                    print("Выполненные задачи: $i")
                    print(": ")
                    println(doneTasks.getValue()[i])
                }

            }
            "-" -> {
                print("Какую задачу удалить?: ")
                val index = Scanner(System.`in`).nextInt()
                newTasks.remove(index)
            }
            "^" -> {
                print("Какую задачу отметить как выполненую?: ")
                val index = Scanner(System.`in`).nextInt()
                val task = newTasks.getValue().get(index)
                newTasks.remove(index)
                doneTasks.addTask(task)

            }
            "*" -> {
                print("С какой задачи снять отметку?: ")
                val index = Scanner(System.`in`).nextInt()
                val task = doneTasks.getValue().get(index)
                doneTasks.remove(index)
                newTasks.addTask(task)
            }
        }
    }
}

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


class TaskList {
    private var value: MutableList<String> = mutableListOf()
    fun addTask(task: String) {
        value.add(task)
    }
    fun getValue(): MutableList<String> {
        return value
    }

    fun remove(index: Int) {
        value.removeAt(index)
    }
}