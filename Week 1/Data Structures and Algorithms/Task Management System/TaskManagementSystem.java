public class TaskManagementSystem {

    static class Task {
        int taskId;
        String taskName;
        String status;
        Task next;

        public Task(int taskId, String taskName, String status) {
            this.taskId = taskId;
            this.taskName = taskName;
            this.status = status;
            this.next = null;
        }
    }

    static class TaskList {
        private Task head;

        public void addTask(int taskId, String taskName, String status) {
            Task newTask = new Task(taskId, taskName, status);
            if (head == null) {
                head = newTask;
                return;
            }
            Task current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTask;
        }

        public Task searchTask(int taskId) {
            Task current = head;
            while (current != null) {
                if (current.taskId == taskId) {
                    return current;
                }
                current = current.next;
            }
            return null;
        }

        public boolean deleteTask(int taskId) {
            if (head == null) return false;

            if (head.taskId == taskId) {
                head = head.next;
                return true;
            }

            Task current = head;
            while (current.next != null && current.next.taskId != taskId) {
                current = current.next;
            }

            if (current.next == null) return false;

            current.next = current.next.next;
            return true;
        }

        public void displayTasks() {
            Task current = head;
            while (current != null) {
                System.out.println("ID: " + current.taskId + ", Name: " + current.taskName + ", Status: " + current.status);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        taskList.addTask(1, "Build Frontend", "In Progress");
        taskList.addTask(2, "Build Backend", "In Progress");
        taskList.addTask(3, "Testing", "Pending");

        System.out.println("All Tasks:");
        taskList.displayTasks();

        System.out.println("\nSearching for Task with ID 2:");
        Task task = taskList.searchTask(2);
        if (task != null)
            System.out.println("Found: " + task.taskName + " - " + task.status);
        else
            System.out.println("Task not found");

        System.out.println("\nDeleting Task with ID 1:");
        boolean deleted = taskList.deleteTask(1);
        System.out.println("Deleted: " + deleted);

        System.out.println("\nTasks after deletion:");
        taskList.displayTasks();
    }
}
