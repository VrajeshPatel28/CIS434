// Add a file to the repo called group.java
// this file should contain one method for each group member that returns their name 
// (each member should write the method that returns their name).

// Add a method called getGroupMembers that returns the names of all group members, 
// (each member should add their own names to the method).

public class group {

    public static String getNamePham() {
        return "Andrew Pham";
    }

    // fill in
    public static String getNameRana() {
        return "Keyur Rana";
    }

    // fill in
    public static String getNamePatelV() {
        return "Vrajesh Patel";
    }

    // fill in
    public static String getName() {
        return "";
    }

    //fill in
    public static String getName() {
        return "";
    }

    public static String getGroupMembers() {
        return getNamePham() + ", " + getNameRana() + ", " + getNamePatelV() + ", " + getName() + ", " + getName();
    }


//(1st method to create) int divide(int num1, int num2) calculates integer division num1/num2, 
// should throw an Arithmetic exception if num2 is 0, or the result of num1/num2 is not a whole number.
public int divide(int num1, int num2){
        if (num == 0 || num1 % num2 != 0) {
            throw new ArithmeticExecption("Cannot divide by 0 or result is nit a whole number");
        }
        return num1/num2;
}


//(2nd method to create) int multiply(int num1, num2) calculates num1*num2
public int multiply(int num1, int nuum2) {
        int result = 0;
        for(int i = 0; i < num2; i++) {
            result += num1;
        }
        return result;
}
//(3rd method to create) int power(int num1, num2); calculates num1 to the power of num2

//You may not use the multiply or divide operators, or methods that calculate the results for you (use loops to do the calculation)


// Add unit tests to verify all methods work correctly

// Add a jenkins file to the project to allow the use of jenkins for the project.  
// You do not need to turn in any documentation showing jenkins working, 
// but I do suggest verifying that it works before turning the assignment in.

    public static void main(String[] args) {
        System.out.println("Group 8: " + getGroupMembers());
    }
}