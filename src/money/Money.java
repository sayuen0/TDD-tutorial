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

    Money times(int multiplier){
        return new Money(amount * multiplier , currency);
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

    Expression plus(Money addend){
        return new Money(this.amount + addend.amount, currency);
    }
}
