public class Stack {
    /*
    Stack Opgave
Denne opgave går ud at poppe og pushe elementer af/på en stack.
Du skal tage udgangspunkt i implementation af en stack på næste side.
Udover Stack klassen skal du lave to tråde. Den ene tråd skal pushe på stacken og
den anden skal poppe fra stacken.
Begge tråde skal have en instans af Stacken.
Hvis der ikke er nogen elementer på stacken, skal pop tråden vente på, der kommer
et element på stacken. Så snart der kommer et element på stacken – altså push
tråden har fået lov at køre – skal den ventende pop tråde notificeres.
Du skal benytte metoderne:
• wait()
• notify()
Med sleep() kan du styre hastigheden og sammenfletningen af trådene.
Udover Stack klassen og de to tråd-klasser skal du lave en test-klasse, hvor du tester
trådene.

     */
    private class Element {
        int info;
        Element next;
        Element(int n, Element e) {
            info = n;
            next = e;
        }
    }
    private Element first;
    public Stack() {
        first = null;
    }
    public synchronized void push(int n) {
        boolean b = first==null;
        first = new Element(n, first);
        if (b) notify();
    }
    public synchronized int pop() {
        if (first == null) {
            System.out.println("Stacken er tom");
            try {
                wait();
                int n = first.info;
                first = first.next;
                return n;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int n = first.info;
        first = first.next;
        return n;
    }
    public boolean is_empty() {
        return first == null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Element currentelement = first;

        while (currentelement != null){
            result.append(currentelement.info);
            if (currentelement.next != null){
                result.append(", ");
                currentelement = currentelement.next;
            } else {
                return result.toString() + "]";
            }
        }
        return result.toString() + "]";
    }

}
