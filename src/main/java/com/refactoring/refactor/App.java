package com.refactoring.refactor;

/**
 * Hello world!
 *
 */
public class App 
{
    String name;
    
    public static void main( String[] args )
    {
        App app = new App();
        app.name= "john";
        app.T01_extractMethod_dirty();
    }
    
    public void T01_extractMethod_dirty() {
        printBanner();

        // Print details.
        System.out.println("name: " + name);
        System.out.println("amount: " + getOutstanding());
    }
    
    public void T01_extractMethod_solution() {
        printBanner();
        // Print details.
        printDetails();
    }

    public void printDetails() {
        System.out.println("name: " + name);
        System.out.println("amount: " + getOutstanding());
    }
    
    public void printBanner() {
        System.out.println("printBanner() run..");
    }
    
    public double getOutstanding() {
        return 100.01;
    }
    
    
}
