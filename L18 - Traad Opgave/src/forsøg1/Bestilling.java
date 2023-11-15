package forsøg1;
public class Bestilling implements Comparable {
    public Integer nr;

    public Bestilling(Integer nr) {
        this.nr = nr;
    }

    @Override
    public String toString() {
        return nr+"";
    }

    @Override
    public int compareTo(Object o) {
        Bestilling bestilling = (Bestilling) o;
        return this.nr.compareTo(bestilling.nr);
    }
}
