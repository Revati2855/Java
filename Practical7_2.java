import java.io.*;
import java.util.Scanner;

public class Practical7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Step 1: Accept student details
            System.out.println("Enter Student Details:");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Weight: ");
            float weight = sc.nextFloat();

            System.out.print("Height: ");
            float height = sc.nextFloat();
            sc.nextLine(); // clear buffer

            System.out.print("City: ");
            String city = sc.nextLine();

            System.out.print("Phone Number: ");
            String phone = sc.nextLine();

            // Step 2: Write data to file
            FileOutputStream fos = new FileOutputStream("student.dat");
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeFloat(weight);
            dos.writeFloat(height);
            dos.writeUTF(city);
            dos.writeUTF(phone);

            dos.close();
            fos.close();

            System.out.println("\nData successfully written to file.");

            // Step 3: Read data from file
            FileInputStream fis = new FileInputStream("student.dat");
            DataInputStream dis = new DataInputStream(fis);

            String rName = dis.readUTF();
            int rAge = dis.readInt();
            float rWeight = dis.readFloat();
            float rHeight = dis.readFloat();
            String rCity = dis.readUTF();
            String rPhone = dis.readUTF();

            dis.close();
            fis.close();

            // Step 4: Display data
            System.out.println("\n--- Retrieved Student Data ---");
            System.out.println("Name: " + rName);
            System.out.println("Age: " + rAge);
            System.out.println("Weight: " + rWeight);
            System.out.println("Height: " + rHeight);
            System.out.println("City: " + rCity);
            System.out.println("Phone Number: " + rPhone);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
