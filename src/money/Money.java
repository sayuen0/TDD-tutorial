package money;

class Money {
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

    static Dollar dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Franc franc(int amount) {
        return new Franc(amount, "CHF");
    }

    String currency() {
        return this.currency;
    }
}
