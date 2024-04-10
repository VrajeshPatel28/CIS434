// Add a file to the repo called group.java
// this file should contain one method for each group member that returns their name 
// (each member should write the method that returns their name).

// Add a method called getGroupMembers that returns the names of all group members, 
// (each member should add their own names to the method).
import org.junit.Test;
import static org.junit.Assert.*;

public class Group {
    

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
    public static String getNameOP() {
        return "Om Patel";
    }

    //fill in
    public static String getNameNP() {
        return "Nihar Patel";
    }

    public static String getGroupMembers() {
        return getNamePham() + ", " + getNameRana() + ", " + getNamePatelV() + ", " + getNameOP() + ", " + getNameNP();
    }

    private int num2;
    private int num;


//(1st method to create) int divide(int num1, int num2) calculates integer division num1/num2, 
// should throw an Arithmetic exception if num2 is 0, or the result of num1/num2 is not a whole number.
public int divide(int num1, int num2){
        if (num == 0 || num1 % num2 != 0) {
            throw new ArithmeticException("Cannot divide by 0 or result is nit a whole number");
        }
        int result =0;
        int sum = num1;
        while (sum>=num2){
            sum-=num2;
            result++;
        }
        return result;
}


//(2nd method to create) int multiply(int num1, num2) calculates num1*num2
public int multiply(int num1, int nuum2) {
        int result = 0;
        for(int i = 0; i < num2; i++) {
            result += num1;
        }
        return num2<0 ? -result : result;
}
//(3rd method to create) int power(int num1, num2); calculates num1 to the power of num2
public int power(int num1, int num2) {
    if (num2 == 0){
        return 1; //any num to power of 0 is 1
    }
    int powResult = 1;
    for (int i = 0; i < num2; i++){
        powResult = multiply(powResult, num1);
    }
    return powResult;
    }

//You may not use the multiply or divide operators, or methods that calculate the results for you (use loops to do the calculation)
// Add unit tests to verify all methods work correctly

    public class GroupTest {
        private Group group = new Group();

        @Test
        public void testMultiply() {
            assertEquals(20, group.multiply(4, 5));
            assertEquals(-20, group.multiply(4, -5));
            assertEquals(0, group.multiply(0, 5));
        }

        @Test
        public void testDivide() {
            assertEquals(4, group.divide(20, 5));
        }

        @Test(expected = ArithmeticException.class)
        public void testDivideByZero() {
            group.divide(20, 0);
        }

        @Test(expected = ArithmeticException.class)
        public void testDivideNonWholeNumber() {
            group.divide(20, 3);
        }

        @Test
        public void testPower() {
            assertEquals(32, group.power(2, 5));
            assertEquals(1, group.power(5, 0));
            assertEquals(1, group.power(-1, 0)); // Edge case for negative base with 0 exponent
            assertEquals(0, group.power(0, 3)); // Edge case for 0 base with positive exponent
        }
    }

// Add a jenkins file to the project to allow the use of jenkins for the project.
   //
// You do not need to turn in any documentation showing jenkins working, 
// but I do suggest verifying that it works before turning the assignment in.

    public static void main(String[] args) {
        System.out.println("Group 8: " + getGroupMembers());
    }
}