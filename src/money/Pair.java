package money;

import java.util.Objects;

class Pair {
    private String to;
    private String from;

    Pair(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return to.equals(pair.to) && from.equals(pair.from);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
