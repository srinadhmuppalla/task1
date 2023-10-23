import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Expense {
    private String description;
    private double amount;

    public Expense(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }
}

public class ExpenseTracker {
    private List<Expense> expenses;

    public ExpenseTracker() {
        expenses = new ArrayList<>();
    }

    public void addExpense(String description, double amount) {
        Expense expense = new Expense(description, amount);
        expenses.add(expense);
    }

    public double calculateTotalExpenses() {
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        return total;
    }

    public void displayExpenses() {
        System.out.println("Expense List:");
        for (Expense expense : expenses) {
            System.out.println("Description: " + expense.getDescription() + ", Amount: $" + expense.getAmount());
        }
    }

    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nExpense Tracker Menu:");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Calculate Total Expenses");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter expense description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter expense amount: $");
                    double amount = scanner.nextDouble();
                    tracker.addExpense(description, amount);
                    break;
                case 2:
                    tracker.displayExpenses();
                    break;
                case 3:
                    double total = tracker.calculateTotalExpenses();
                    System.out.println("Total Expenses: $" + total);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
