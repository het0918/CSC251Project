// Policy class representing an insurance policy
public class Policy {

    // Policy-specific attributes
    private String policyNumber;
    private String providerName;
    private PolicyHolder policyHolder; // PolicyHolder object
    
    // Static field to track the number of policies created
    private static int policyCount = 0;
    
    /**
     * Constructor with parameters.
     */
    public Policy(String policyNumber, String providerName, PolicyHolder policyHolder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = policyHolder;
        policyCount++; // Increment policy counter when a new policy is created
    }
   
    /**
     * Static method to get the number of policies created.
     */
    public static int getPolicyCount() {
        return policyCount;
    }

    // Getter and setter methods

    public String getPolicyNumber() { return policyNumber; }
    public void setPolicyNumber(String policyNumber) { this.policyNumber = policyNumber; }

    public String getProviderName() { return providerName; }
    public void setProviderName(String providerName) { this.providerName = providerName; }

    public PolicyHolder getPolicyHolder() { return policyHolder; }

    /**
     * Calculates the insurance policy cost and includes additional charges if applicable.
     * @return Total insurance cost
     */
    public double calculateInsuranceCost() {
        double baseFee = 600.0;
        double additionalFees = 0.0;

        if (policyHolder.getAge() > 50) {
            additionalFees += 75.0;
        }
        
        if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker")) {
            additionalFees += 100.0;
        }
        
        if (policyHolder.calculateBMI() > 35.0) {
            additionalFees += (policyHolder.calculateBMI() - 35.0) * 20.0;
        }

        return baseFee + additionalFees;
     }
     
     @Override
     public String toString() {
       return String.format("Policy Number: %s%n" +
                            "Provider Name: %s%n%n" +
                            "%s" + // Calls PolicyHolder's toString() method
                            "Policy Price: $%.2f%n",
                            policyNumber, providerName, policyHolder.toString(),
                            calculateInsuranceCost());
     }     
}
