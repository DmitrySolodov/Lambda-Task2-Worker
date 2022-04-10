public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener error = taskNumber -> {
            if (taskNumber == 33) { // Задача № 33 не будет выполнена
            System.out.println("Task " + taskNumber + " isn't done, error");
            return true;
            } else {
                return false;
            }
        };
        Worker worker = new Worker(listener, error);
        worker.start();
    }
}
