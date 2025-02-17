// Policy class representing an insurance policy
public class Policy {

    // Declaring necessary attributes
    private String policyNumber;
    private String providerName;
    private String policyHolderFirstName;
    private String policyHolderLastName;
    private int policyHolderAge;
    private String policyHolderSmokingStatus;
    private int policyHolderHeight;
    private double policyHolderWeight;

    // No-argument constructor
    public Policy() {
        policyNumber = "";
        providerName = "";
        policyHolderFirstName = "";
        policyHolderLastName = "";
        policyHolderAge = 0;
        policyHolderSmokingStatus = "";
        policyHolderHeight = 0;
        policyHolderWeight = 0.0;
    }

    // Constructor with parameters
    public Policy(String pcNumber, String insuranceProvider, String firstName, String lastName, int age, String smokingStatus, int height, double weight) {
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
    public void setPolicyNumber(String pcNumber) {
        policyNumber = pcNumber;
    }

    public void setProviderName(String insuranceProvider) {
        providerName = insuranceProvider;
    }

    public void setPolicyHolderFirstName(String firstName) {
        policyHolderFirstName = firstName;
    }

    public void setPolicyHolderLastName(String lastName) {
        policyHolderLastName = lastName;
    }

    public void setPolicyHolderAge(int age) {
        policyHolderAge = age;
    }

    public void setPolicyHolderSmokingStatus(String smokingStatus) {
        policyHolderSmokingStatus = smokingStatus;
    }

    public void setPolicyHolderHeight(int height) {
        policyHolderHeight = height;
    }

    public void setPolicyHolderWeight(double weight) {
        policyHolderWeight = weight;
    }

    // Accessor (getter) methods
    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getPolicyHolderFirstName() {
        return policyHolderFirstName;
    }

    public String getPolicyHolderLastName() {
        return policyHolderLastName;
    }

    public int getPolicyHolderAge() {
        return policyHolderAge;
    }

    public String getPolicyHolderSmokingStatus() {
        return policyHolderSmokingStatus;
    }

    public int getPolicyHolderHeight() {
        return policyHolderHeight;
    }

    public double getPolicyHolderWeight() {
        return policyHolderWeight;
    }

    // Method to calculate the BMI of the policyholder
    public double calculateBMI() {
        return (policyHolderWeight * 703) / (policyHolderHeight * policyHolderHeight);
    }

    // Method to calculate the insurance policy cost
    public double calculateInsuranceCost() {
        double baseFee = 600.0;
        double additionalFees = 0.0;

        if (policyHolderAge > 50) {
            additionalFees += 75.0;
        }
        
        if (policyHolderSmokingStatus.equalsIgnoreCase("smoker")) {
            additionalFees += 100.0;
        }
        double bmi = calculateBMI();
        
        if (bmi > 35.0) {
            additionalFees += (bmi - 35.0) * 20.0;
        }

        return baseFee + additionalFees;
    }
}
