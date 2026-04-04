package com.java.fundamens;

public class Primitives {
    static void main() {
        //primitives
        //byte
        //stores 1 byte of memory
        //range : -128 to +127
        byte age;
        byte subject1Marks, subject2Marks, subject3Marks, subject4Marks, subject5Marks;
        age = 120;
        System.out.println("age" + age);
        subject1Marks = 12;
        subject2Marks = 23;
        subject3Marks = 45;
        subject4Marks = 80;
        subject5Marks = 90;
        System.out.println("subject1Marks" + subject1Marks);
        System.out.println("subject1Marks" + subject1Marks + ", subject2Marks" + subject2Marks + ", subject3Marks" + subject3Marks + ", subject4Marks" + subject4Marks + "subject5Marks" + subject5Marks);

        //short
        //-32,768 to = 32,767
        short totalMarks = 234;
        short manufacturingYear = 2002;
        short daysInExpiry = 340;
        System.out.println("totalMarks =" + totalMarks + ", manufacturing year," + manufacturingYear + ", days in expiry" + daysInExpiry);

        //int
        // -2,147,483,648 to 2,147,483,647
        int salary = 50000;
        int bankBalance = 769347;
        System.out.println("salary" + salary);
        System.out.println("bankBalance = " + bankBalance);
        System.out.println(" salary = " + salary + ", bankBalance =," + bankBalance);


        //long
        //8 bytes
        //-9223372036854775808 to  9223372036854775807
        long population = 6387283;
        long mobileNumber = 7993840092L;
        System.out.println("population =," + population);
        System.out.println("mobileNumber =" + mobileNumber);
        System.out.println("population =," + population + ", mobileNumber" + mobileNumber);

        // float (single precision)
        float price = 99.99f;   // 'f' is required for float
        System.out.println("Float value (price): " + price);

        // double (double precision)
        double height = 3.14159265359;
        System.out.println("Double value (pi): " + height);

        // char (single character)
        char grade = 'A';
        System.out.println("Char value (grade): " + grade);

        // combining all
        System.out.println("\nCombined Output:");
        System.out.println("Price: " + price + ", Pi: " + height + ", Grade: " + grade);
    }
}

