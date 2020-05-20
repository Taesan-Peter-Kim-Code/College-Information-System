package CMS;

import java.util.Date;

public class Professor extends BasicInfo {
    private String courses;
    private Double salary;

    /**
     * empty constructor
     */
    public Professor() {
    }

    /**
     * constructor
     * @param firstName
     * @param lastName
     * @param idNumber
     * @param phoneNumber
     * @param email
     * @param birthDate
     * @param enrollmentDate
     * @param address
     * @param department
     * @param courses
     * @param salary
     */
    public Professor(String firstName, String lastName, Integer idNumber, long phoneNumber, String email, Date birthDate, Date enrollmentDate, String address, String department, String courses, Double salary) {
        super(firstName, lastName, idNumber, phoneNumber, email, birthDate, enrollmentDate, address, department);
        this.courses = courses;
        this.salary = salary;
    }

    /**
     * get courses
     * @return
     */
    public String getCourses() {
        return this.courses;
    }
    
    /**
     * get salary
     * @return
     */
    public Double getSalary() {
        return this.salary;
    }
    

    @Override
    public String toString() {
        return "{" + " courses='" + getCourses() + "'" + ", salary='" + getSalary() + "'" + "}";
    }

    
}