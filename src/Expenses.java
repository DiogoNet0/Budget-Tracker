public class Expenses {

    //Expense name
    private String expense;

    // Expense amount
    private double amount;

    // Type of expense
    private String category;

    // Memo
    private String description;

    // When it is performed
    private String date;

    // Unique Expense ID
    private int expenseID;

    /**
     * Create an expense
     *
     * @param expense Name of the expense
     * @param amount  Cost of the expense
     */
    public Expenses(String expense, double amount) {
        this.expense = expense;
        this.amount = amount;
    }

    /**
     * Creates an empty expense
     */
    public Expenses() {
        expense = "";
        amount = 0;
    }

    public double getExpense(String expense) {
        return amount;
    }
}
