import java.util.Scanner;

// Project class creating instance of Policy Class.
public class Project_het_shah{
   
   // Main program
   public static void main(String[] args){
      
      // Declaring the Policy class.
      Policy policy1;
      
      // Intialing a input scanner.
      Scanner keyboard = new Scanner(System.in);
      
      // Prompt the user to enter all the information required to determine policy price.
      System.out.print("\nPlease enter the Policy number: ");
      String policyNum = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Provider Name: ");
      String providerName = keyboard.nextLine();

      System.out.print("\nPlease enter the Policyholder's First Name: ");
      String firstName = keyboard.next();      
      
      System.out.print("\nPlease enter the Policyholder's Last Name: ");
      String lastName = keyboard.next();     
      
      System.out.print("\nPlease enter the Policyholder's Age: ");
      int age = keyboard.nextInt();
      
      System.out.print("\nPlease enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      String smokingStatus = keyboard.next();
      
      System.out.print("\nPlease enter the Policyholder's Height (in inches): ");
      double height = keyboard.nextDouble();
      
      System.out.print("\nPlease enter the Policyholder's Weight (in pounds): ");
      double weight = keyboard.nextDouble();
      
      // Intialize the Instance policy1 with arguments.
      policy1 = new Policy(policyNum, providerName, firstName, lastName, age, smokingStatus, height, weight);
      
      // Display all the infomation about the Policy.
      System.out.println("\n------------------------------------------------------------------------------");
      System.out.println("\nPolicy Number: " + policy1.getPolicyNumber());
      System.out.println("\nProvider Name: " + policy1.getProviderName());
      System.out.println("\nPolicyholder's First Name: " + policy1.getPolicyHolderFirstName());
      System.out.println("\nPolicyholder's Last Name: " + policy1.getPolicyHolderLastName());
      System.out.println("\nPolicyholder's Age: " + policy1.getPolicyHolderAge());
      System.out.println("\nPolicyholder's Smoking Status: " + policy1.getPolicyHolderSmokingStatus());
      System.out.println("\nPolicyholder's Height: " + policy1.getPolicyHolderHeight() + " inches");
      System.out.println("\nPolicyholder's Weight: " + policy1.getPolicyHolderWeight() + " pounds");
      System.out.printf("\nPolicyholder's BMI: %.2f%n", policy1.calculateBMI());
      System.out.printf("\nPolicy Price: $%.2f%n", policy1.calculateInsuranceCost());
   }
}