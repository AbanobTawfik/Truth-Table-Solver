public class Proposition {
    private String predicate = "";
    private String symbol = "";
    private boolean assignment;

    public Proposition(String predicate, String symbol) {
        this.predicate = predicate;
        this.symbol = symbol;
    }

    public String get_proposition() {
        return this.predicate;
    }

    public String get_symbol() {
        return this.symbol;
    }

    public boolean get_assignment() {
        return this.assignment;
    }

    public void set_assignment(boolean assignment) {
        this.assignment = assignment;
    }
}
