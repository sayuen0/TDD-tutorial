package money;

class Money implements Expression {
    protected int amount;
    protected String currency;


    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Money money = (Money) o;
        return amount == money.amount && money.currency().equals(this.currency);
    }

    public Expression times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    String currency() {
        return this.currency;
    }

    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(this.currency, to);
        return new Money(this.amount / rate, to);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
