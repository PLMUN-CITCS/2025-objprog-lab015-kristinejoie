public class VariableScope {

    // Declare the global variable
    static int globalCount = 100;

    public static void main(String[] args) {
        // Print the global count from the main method
        System.out.println("Global Count (from main): " + globalCount);
        
        // Call showScope method
        showScope();
    }

    // Define the showScope method
    public static void showScope() {
        // Declare the local variable
        int localCount = 50;

        // Print the global count from showScope
        System.out.println("Global Count (from showScope): " + globalCount);
        
        // Print the local count from showScope
        System.out.println("Local Count (from showScope): " + localCount);
    }
}