package money;

abstract class Money {
    protected int amount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount;
    }

    abstract Money times(int amount);

    static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    static Franc franc(int amount) {
        return new Franc(amount);
    }
}
