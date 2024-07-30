public class Task {
    private int taskId;
    private String taskName;
    private String status;

    Task next;

    public Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", taskName='" + taskName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public static void main(String[] args) {
        linked lin=new linked();
        lin.add(new Task(1,"problem solving","done"));
        lin.add(new Task(2,"Aptitude","not done"));
        lin.add((new Task(3,"project","done")));
        System.out.println("Traverseing");
        lin.traverse();
        System.out.println("searching");
        Task found=lin.search(2);
        System.out.println(found);
        System.out.println("Deleting");
        lin.delete(2);
        lin.traverse();
    }
}
