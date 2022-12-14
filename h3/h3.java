package h3;

import java.io.FileWriter;
import java.util.Scanner;

public class h3 {

    String firstName;
    String lastName;
    String middleName;
    String birthDate;
    String gender;
    int phoneNumber;

    public h3(String firstName, String lastName, String middleName, String birthDate, String gender, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter: \n1. your first name\n2. your last name\n"
            +"3. your middle name\n4. your birth date\n"
            + "5. your gender\n6. your phone number");
        try (FileWriter writer = new FileWriter("Data.txt")) {
            h3 user = new h3(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
                    sc.nextLine(), sc.nextInt());
            writer.write(user.toString());
        } catch (Exception e) {
            System.out.println("Incorrect input, please, try again!");
        }
    }

    @Override
    public String toString() {
        return "<" + lastName + "><" + firstName + "><" + middleName + "><"
                + birthDate + "><" + gender + "><" + phoneNumber + '>';
    }
}
