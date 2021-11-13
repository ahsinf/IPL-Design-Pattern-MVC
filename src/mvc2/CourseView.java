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
public class CourseView {
    public void printCourseDetails(String courseName, String courseId, String courseCategory) {
        System.out.println("Course Details: ");
	System.out.println("Name: " + courseName);
	System.out.println("Course ID: " + courseId);
	System.out.println("Course Category: " + courseCategory);
    }
}