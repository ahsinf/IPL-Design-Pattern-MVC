/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc2;

/**
 *
 * @author Ahsin Fauzi
 */
public class MVCPatternDemo {
    public static void main(String[] args) {
        Course model = retriveCourseFromDatabase();
	CourseView view = new CourseView();
	CourseController controller = new CourseController(model, view);
	controller.updateView();
	controller.setCourseName("Logika Matematika");
        System.out.println("\nTampilan Setelah diupdate menjadi ");
        controller.updateView();
    }
    
    private static Course retriveCourseFromDatabase() {
        Course course = new Course();
	course.setName("Matematika Diskrit");
	course.setId("06");
	course.setCategory("Matematika");
	return course;
    }
}
