// Main.java
public class Main {
    public static void main(String[] args) {
        // Create a student record
        Student model = new Student();
        model.setName("John Doe");
        model.setId("12345");
        model.setGrade("A");

        // Create a view to display student details
        StudentView view = new StudentView();

        // Create a controller to manage the model and view
        StudentController controller = new StudentController(model, view);

        // Display the initial details
        controller.updateView();

        // Update student details
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("A+");

        // Display the updated details
        controller.updateView();
    }
}
