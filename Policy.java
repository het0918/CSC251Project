// Policy class representing an insurance policy
public class Policy {

    // Declaring necessary attributes
    private String policyNumber;
    private String providerName;
    private String policyHolderFirstName;
    private String policyHolderLastName;
    private int policyHolderAge;
    private String policyHolderSmokingStatus;
    private double policyHolderHeight;
    private double policyHolderWeight;

    /**
     * No-argument constructor initializing default values.
     */
    public Policy() {
        policyNumber = "";
        providerName = "";
        policyHolderFirstName = "";
        policyHolderLastName = "";
        policyHolderAge = 0;
        policyHolderSmokingStatus = "";
        policyHolderHeight = 0.0;
        policyHolderWeight = 0.0;
    }

    /**
     * Constructor with parameters.
     * @param pcNumber Policy number
     * @param insuranceProvider Insurance provider name
     * @param firstName Policy holder's first name
     * @param lastName Policy holder's last name
     * @param age Policy holder's age
     * @param smokingStatus Policy holder's smoking status
     * @param height Policy holder's height in inches
     * @param weight Policy holder's weight in pounds
     */
    public Policy(String pcNumber, String insuranceProvider, String firstName, String lastName, int age, String smokingStatus, double height, double weight) {
        policyNumber = pcNumber;
        providerName = insuranceProvider;
        policyHolderFirstName = firstName;
        policyHolderLastName = lastName;
        policyHolderAge = age;
        policyHolderSmokingStatus = smokingStatus;
        policyHolderHeight = height;
        policyHolderWeight = weight;
    }

    // Mutator (setter) methods

    /**
     * Sets the policy number.
     * @param pcNumber Policy number
     */
    public void setPolicyNumber(String pcNumber) {
        policyNumber = pcNumber;
    }

    /**
     * Sets the provider name.
     * @param insuranceProvider Insurance provider name
     */
    public void setProviderName(String insuranceProvider) {
        providerName = insuranceProvider;
    }

    /**
     * Sets the policy holder's first name.
     * @param firstName Policy holder's first name
     */
    public void setPolicyHolderFirstName(String firstName) {
        policyHolderFirstName = firstName;
    }

    /**
     * Sets the policy holder's last name.
     * @param lastName Policy holder's last name
     */
    public void setPolicyHolderLastName(String lastName) {
        policyHolderLastName = lastName;
    }

    /**
     * Sets the policy holder's age.
     * @param age Policy holder's age
     */
    public void setPolicyHolderAge(int age) {
        policyHolderAge = age;
    }

    /**
     * Sets the policy holder's smoking status.
     * @param smokingStatus Policy holder's smoking status
     */
    public void setPolicyHolderSmokingStatus(String smokingStatus) {
        policyHolderSmokingStatus = smokingStatus;
    }

    /**
     * Sets the policy holder's height.
     * @param height Policy holder's height in inches
     */
    public void setPolicyHolderHeight(double height) {
        policyHolderHeight = Math.round(height * 100.0) / 100.0;
    }

    /**
     * Sets the policy holder's weight.
     * @param weight Policy holder's weight in pounds
     */
    public void setPolicyHolderWeight(double weight) {
        policyHolderWeight = weight;
    }

    // Accessor (getter) methods

    /**
     * Gets the policy number.
     * @return Policy number
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Gets the provider name.
     * @return Provider name
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Gets the policy holder's first name.
     * @return Policy holder's first name
     */
    public String getPolicyHolderFirstName() {
        return policyHolderFirstName;
    }

    /**
     * Gets the policy holder's last name.
     * @return Policy holder's last name
     */
    public String getPolicyHolderLastName() {
        return policyHolderLastName;
    }

    /**
     * Gets the policy holder's age.
     * @return Policy holder's age
     */
    public int getPolicyHolderAge() {
        return policyHolderAge;
    }

    /**
     * Gets the policy holder's smoking status.
     * @return Policy holder's smoking status
     */
    public String getPolicyHolderSmokingStatus() {
        return policyHolderSmokingStatus;
    }

    /**
     * Gets the policy holder's height.
     * @return Policy holder's height in inches
     */
    public double getPolicyHolderHeight() {
        return policyHolderHeight;
    }

    /**
     * Gets the policy holder's weight.
     * @return Policy holder's weight in pounds
     */
    public double getPolicyHolderWeight() {
        return policyHolderWeight;
    }

    /**
     * Calculates the BMI of the policyholder.
     * @return BMI value
     */
    public double calculateBMI() {
        return (policyHolderWeight * 703) / (policyHolderHeight * policyHolderHeight);
    }

    /**
     * Calculates the insurance policy cost and includes additional charges if applicable.
     * @return Total insurance cost
     */
    public double calculateInsuranceCost() {
        double baseFee = 600.0;
        double additionalFees = 0.0;

        if (policyHolderAge > 50) {
            additionalFees += 75.0;
        }
        
        if (policyHolderSmokingStatus.equalsIgnoreCase("smoker")) {
            additionalFees += 100.0;
        }
        
        if (calculateBMI() > 35.0) {
            additionalFees += (calculateBMI() - 35.0) * 20.0;
        }

        return baseFee + additionalFees;
    }
}
