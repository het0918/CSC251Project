import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// Main class for processing insurance policy information
public class Project_het_shah {
   
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
            
            // Create PolicyHolder object
            PolicyHolder policyHolder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);

            // Create Policy object with PolicyHolder instance
            Policy policy = new Policy(policyNum, providerName, policyHolder);
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
          System.out.println(policy);
          System.out.println("------------------------------------------------------------------------------");
      }

      // Display statistics
      System.out.println("\nThere were " + Policy.getPolicyCount() + " Policy objects created.");
      System.out.println("The number of policies with a smoker is: " + smokerCount);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);

   }
}
