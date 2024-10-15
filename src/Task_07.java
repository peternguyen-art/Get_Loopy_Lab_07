public class Task_07{
    public static void main(String[] args) {
        for (int count = 0; count < 5; count++) { // Outer loop for rows
            for (int numb = 0; numb < 5; numb++) { // Inner loop for columns (asterisks)
                System.out.print("* "); // Print asterisks with space
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
