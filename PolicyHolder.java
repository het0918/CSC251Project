// PolicyHolder class representing a person associated with an insurance policy
public class PolicyHolder {

    // Attributes directly related to the policy holder
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height; // in inches
    private double weight; // in pounds

    /**
     * Constructor to initialize the policy holder's information.
     * @param firstName Policy holder's first name
     * @param lastName Policy holder's last name
     * @param age Policy holder's age
     * @param smokingStatus Policy holder's smoking status
     * @param height Policy holder's height in inches
     * @param weight Policy holder's weight in pounds
     */
    public PolicyHolder(String firstName, String lastName, int age, String smokingStatus, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    // Getter and setter methods for encapsulation
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getSmokingStatus() { return smokingStatus; }
    public void setSmokingStatus(String smokingStatus) { this.smokingStatus = smokingStatus; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = Math.round(height * 100.0) / 100.0; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    /**
     * Calculates the BMI of the policyholder.
     * @return BMI value
     */
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }
}
