package mvc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsin Fauzi
 */
public class MVCPatternDemo {
    public static void main (String[] args) {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Ahsin Fauzi");
        controller.updateView();
    }
    
    private static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Ahsin");
        student.setRollNo("03");
        return student;
    }
}
