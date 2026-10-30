

import kotlinx.datetime.LocalDate
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

class ToDoList() {

    // tats to store all the tasks 
    private val items = mutableListOf<ToDoItem>()

    //  thats to returns the total number of tasks
    val size: Int
        get() = items.size

    // to counts tasks based on their status
    val notStarted: Int
        get() {
            var count = 0
            for (item in items) {
                if (item.status == ItemStatus.NotStarted) {
                    count++
                }
            }
            return count
        }

    val inProgress: Int
        get() {
            var count = 0
            for (item in items) {
                if (item.status == ItemStatus.InProgress) {
                    count++
                }
            }
            return count
        }

    val done: Int
        get() {
            var count = 0
            for (item in items) {
                if (item.status == ItemStatus.Done) {
                    count++
                }
            }
            return count
        }

    //to basically  counts tasks that are overdue
    val overdue: Int
        get() {
            var count = 0
            for (item in items) {
                if (item.isOverdue()) {
                    count++
                }
            }
            return count
        }

    // creates a list and loads tasks from a file
    constructor(filename: String) : this() {
        load(filename)
    }
