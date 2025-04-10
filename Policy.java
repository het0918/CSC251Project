// Policy class representing an insurance policy
public class Policy {

    // Policy-specific attributes
    private String policyNumber;
    private String providerName;
    private PolicyHolder policyHolder; // PolicyHolder object

    /**
     * Constructor with parameters.
     * @param policyNumber Policy number
     * @param providerName Insurance provider name
     * @param policyHolder PolicyHolder object containing holder details
     */
    public Policy(String policyNumber, String providerName, PolicyHolder policyHolder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = policyHolder;
    }

    // Getter and setter methods

    public String getPolicyNumber() { return policyNumber; }
    public void setPolicyNumber(String policyNumber) { this.policyNumber = policyNumber; }

    public String getProviderName() { return providerName; }
    public void setProviderName(String providerName) { this.providerName = providerName; }

    public PolicyHolder getPolicyHolder() { return policyHolder; }
    public void setPolicyHolder(PolicyHolder policyHolder) { this.policyHolder = policyHolder; }

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
}
