package CMS;

import java.text.SimpleDateFormat;
import java.util.Date;


public class BasicInfo {
    private String firstName;
    private String lastName;
    private Integer idNumber;
    private long phoneNumber;
    private String email;
    private Date birthDate;
    private Date enrollmentDate;
    private String address;
    private String department;
    
    // empty constructor
    public BasicInfo() {
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
     */
    public BasicInfo(String firstName, String lastName, Integer idNumber, Long phoneNumber, String email, Date birthDate, Date enrollmentDate, String address, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthDate = birthDate;
        this.enrollmentDate = enrollmentDate;
        this.address = address;
        this.department = department;
        
    }
    public String dateFormat (Date birthDate, Date enrollmentDate) {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return pattern;
    }

    /**
     * get first name
     * @return
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * get last name
     * @return
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * get id number
     * @return
     */
    public Integer getIdNumber() {
        return this.idNumber;
    }

    /**
     * get phone number
     * @return
     */
    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * get email
     * @return
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * get birth date
     * @return
     */
    public Date getBirthDate() {
        return this.birthDate;
    }

    /**
     * get enrollment date
     * @return
     */
    public Date getEnrollmentDate() {
        return this.enrollmentDate;
    }

    /**
     * get address
     * @return
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * get department
     * @return
     */
    public String getDepartment() {
        return this.department;
    }

    /**
     * set first name
     * @param firstName
     */
    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * set last name
     * @param lastName
     */
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * set id number
     * @param idNumber
     */
    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * set phone number
     * @param phoneNumber
     */
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * set email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * set birth date
     * @param birthDate
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * set enrollment date
     * @param enrollmentDate
     */
    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    /**
     * set address
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * set department
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }


    /**
     * toString method 
     */
    @Override
    public String toString() {
        return "{" +
            " firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", idNumber='" + getIdNumber() + "'" +
            ", phoneNumber='" + getPhoneNumber() + "'" +
            ", email='" + getEmail() + "'" +
            ", birthDate='" + getBirthDate() + "'" +
            ", enrollmentDate='" + getEnrollmentDate() + "'" +
            ", address='" + getAddress() + "'" +
            ", department='" + getDepartment() + "'" +
            "}";
    }

}