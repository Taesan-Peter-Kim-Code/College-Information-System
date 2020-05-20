package CMS;

import java.util.Arrays;
import java.util.Date;

public class Student extends BasicInfo{
    private String major;
    private String minor;
    private Double gpa;
    private String academicYear;
    private String courses;

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
     * @param major
     * @param minor
     * @param gpa
     * @param academicYear
     * @param courses
     */
    public Student(String firstName, String lastName, Integer idNumber, long phoneNumber, String email, Date birthDate, Date enrollmentDate, String address, String department, String major, String minor, Double gpa, String academicYear, String courses) {
        super(firstName, lastName, idNumber, phoneNumber, email, birthDate, enrollmentDate, address, department);
        this.major = major;
        this.minor = minor;
        this.gpa = gpa;
        this.courses = courses;

        // throw an exception if the academic year is invalid otherwise, construct academicYear
        if (!validAcademicYear(academicYear)) {
            throw new IllegalArgumentException("Invalid academic year");
        }
        else {
            this.academicYear = academicYear;
        }
    }

    /**
     * empty constructor
     */
    public Student() {
    }
    /**
     * get major
     * @return
     */
    public String getMajor() {
        return this.major;
    }

    /**
     * get minor
     * @return
     */
    public String getMinor() {
        return this.minor;
    }

    /**
     * get gpa
     * @return
     */
    public Double getGpa() {
        return this.gpa;
    }

    /**
     * get academic year
     * @return 
     */
    public String getAcademicYear() {
        return this.academicYear;
    }

    /**
     * get courses
     * @return 
     */
    public String getCourses() {
        return this.courses;
        
    }

    /**
     * check if the academic year is valid
     * @param academicYear
     * @return
     */
    public boolean validAcademicYear (String academicYear) {
        String[] academicYear1 = {"freshman", "sophomore", "junior", "senior"};
        if (Arrays.asList(academicYear1).contains(academicYear)) {
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "{" +
            " major='" + getMajor() + "'" +
            ", minor='" + getMinor() + "'" +
            ", gpa='" + getGpa() + "'" +
            ", academicYear='" + getAcademicYear() + "'" +
            ", courses='" + getCourses() + "'" +
            "}";
    }
    

}