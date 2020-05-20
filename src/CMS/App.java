
package CMS;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author [Taesan Peter Kim]
 * @email [peterkim3002@gmail.com]
 * @create date 2020-05-19 16:55:31
 * @modify date 2020-05-19 16:55:31
 * @desc [This is a system to manage college information including studnets,
 *       professors, and staffs]
 */


public class App {
    public static void main(String[] args) throws Exception {
        //-----------------------Students---------------------------//
        //add students
        Student student1 = new Student("firstName", "lastName", 1231, 1231231231, "s1@email", new Date() , new Date() , "s_address1", "department", "major1", "minor1", 3.89, "junior", "courses");
        Student student2 = new Student("firstName", "lastName", 1232, 1231231232, "s2@email", new Date() , new Date() , "s_address2", "department", "major2", "minor2", 3.89, "junior", "courses");
        Student student3 = new Student("firstName", "lastName", 1233, 1231231233, "s3@email", new Date() , new Date() , "s_address3", "department", "major3", "minor3", 3.89, "junior", "courses");
        Student student4 = new Student("firstName", "lastName", 1234, 1231231234, "s4@email", new Date() , new Date() , "s_address4", "department", "major4", "minor4", 3.89, "junior", "courses");
        //create an arraylist of students
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        //-----------------------Professors---------------------------//
        //add professors
        Professor professor1 = new Professor("firstName", "lastName", 2231, 223123121, "p1@email", new Date(), new Date(), "p_address1", "department", "courses", 32.3);
        Professor professor2 = new Professor("firstName", "lastName", 2231, 223123122, "p2@email", new Date(), new Date(), "p_address2", "department", "courses", 32.3);
        Professor professor3 = new Professor("firstName", "lastName", 2231, 223123123, "p3@email", new Date(), new Date(), "p_address3", "department", "courses", 32.3);
        Professor professor4 = new Professor("firstName", "lastName", 2231, 223123124, "p4@email", new Date(), new Date(), "p_address4", "department", "courses", 32.3);
        //create an arraylist of professors
        ArrayList<Professor> professors = new ArrayList<Professor>();
        professors.add(professor1);
        professors.add(professor2);
        professors.add(professor3);
        professors.add(professor4);

        //-----------------------Staffs---------------------------//
        //add staffs
        Staff staff1 = new Staff("firstName", "lastName", 3121, 323123121, "f1@email", new Date(), new Date(), "f_address1", "department", 20.12);
        Staff staff2 = new Staff("firstName", "lastName", 3121, 323123121, "f2@email", new Date(), new Date(), "f_address2", "department", 20.12);
        Staff staff3 = new Staff("firstName", "lastName", 3121, 323123121, "f3@email", new Date(), new Date(), "f_address3", "department", 20.12);
        Staff staff4 = new Staff("firstName", "lastName", 3121, 323123121, "f4@email", new Date(), new Date(), "f_address4", "department", 20.12);
        //create an arraylist of staffs
        ArrayList<Staff> staffs = new ArrayList<Staff>();
        staffs.add(staff1);
        staffs.add(staff2);
        staffs.add(staff3);
        staffs.add(staff4);


    }
}
