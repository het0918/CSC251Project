import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// Project class creating instances of Policy Class.
public class Project_het_shah {
   
   // Main program
   public static void main(String[] args) {
      // List to store Policy objects
      ArrayList<Policy> policies = new ArrayList<>();
      int smokerCount = 0;
      int nonSmokerCount = 0;
      
      try {
         // Open the file
         File file = new File("PolicyInformation.txt");
         Scanner fileScanner = new Scanner(file);
         
         // Read data from the file, skipping empty lines
         while (fileScanner.hasNext()) {
            String policyNum = fileScanner.nextLine().trim();
            if (policyNum.isEmpty()) continue;
            
            String providerName = fileScanner.nextLine().trim();
            String firstName = fileScanner.nextLine().trim();
            String lastName = fileScanner.nextLine().trim();
            int age = Integer.parseInt(fileScanner.nextLine().trim());
            String smokingStatus = fileScanner.nextLine().trim();
            double height = Double.parseDouble(fileScanner.nextLine().trim());
            double weight = Double.parseDouble(fileScanner.nextLine().trim());
            
            // Create a new Policy object and add it to the list
            Policy policy = new Policy(policyNum, providerName, firstName, lastName, age, smokingStatus, height, weight);
            policies.add(policy);
            
            // Count smokers and non-smokers
            if (smokingStatus.equalsIgnoreCase("smoker")) {
               smokerCount++;
            } else {
               nonSmokerCount++;
            }
         }
         
         fileScanner.close();
      } catch (FileNotFoundException e) {
         System.out.println("Error: File not found.");
         return;
      }
      
      // Display all the information about each Policy
      System.out.println("\n------------------------------------------------------------------------------");
      for (Policy policy : policies) {
         System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
         System.out.println("\nProvider Name: " + policy.getProviderName());
         System.out.println("\nPolicyholder's First Name: " + policy.getPolicyHolderFirstName());
         System.out.println("\nPolicyholder's Last Name: " + policy.getPolicyHolderLastName());
         System.out.println("\nPolicyholder's Age: " + policy.getPolicyHolderAge());
         System.out.println("\nPolicyholder's Smoking Status: " + policy.getPolicyHolderSmokingStatus());
         System.out.println("\nPolicyholder's Height: " + policy.getPolicyHolderHeight() + " inches");
         System.out.println("\nPolicyholder's Weight: " + policy.getPolicyHolderWeight() + " pounds");
         System.out.printf("\nPolicyholder's BMI: %.2f%n", policy.calculateBMI());
         System.out.printf("\nPolicy Price: $%.2f%n", policy.calculateInsuranceCost());
         System.out.println("\n------------------------------------------------------------------------------");
      }
      
      // Display smoker/non-smoker counts
      System.out.println("\nNumber of Policyholders that are smokers: " + smokerCount);
      System.out.println("Number of Policyholders that are non-smokers: " + nonSmokerCount);
   }
}