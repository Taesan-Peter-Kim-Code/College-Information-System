package CMS;

import java.util.Date;

public class Staff extends BasicInfo {
    private Double salary;

    /**
     * empty constructor
     */
    public Staff() {
    }

    /**
     * constructor
     * @param salary
     */
    public Staff(String firstName, String lastName, Integer idNumber, long phoneNumber, String email, Date birthDate, Date enrollmentDate, String address, String department, Double salary) {
        super(firstName, lastName, idNumber, phoneNumber, email, birthDate, enrollmentDate, address, department);
        this.salary = salary;
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
        return "{" +
            " salary='" + getSalary() + "'" +
            "}";
    }
}