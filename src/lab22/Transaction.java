package lab22;

public class Transaction {
    String category;
    Double value;

    public Transaction(String category, Double value) {
        this.category = category;
        this.value = value;
    }

    public String getCategory() {
        return category;
    }

    public Double getValue() {
        return value;
    }
}
