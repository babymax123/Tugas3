public class Latihan2 {
    private static final int MAX_SIZE = 100;
    private String[] queue = new String[MAX_SIZE];
    private int head = 0;
    private int tail = 0;

    public void add(String value) {
        if (tail == MAX_SIZE) {
            throw new IllegalStateException("Queue is full");
        }
        queue[tail++] = value;
    }

    public String remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        String value = queue[head];
        queue[head++] = null;
        return value;
    }

    public String element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[head];
    }

    public String poll() {
        if (isEmpty()) {
            return null;
        }
        String value = queue[head];
        queue[head++] = null;
        return value;
    }

    public String peek() {
        if (isEmpty()) {
            return null;
        }
        return queue[head];
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public static void main(String[] args) {
        Latihan2 q = new Latihan2();

        q.add("Java");
        q.add("DotNet");
        q.add("PHP");
        q.add("HTML");

        System.out.println("remove : " + q.remove());
        System.out.println("element : " + q.element());
        System.out.println("poll : " + q.poll());
        System.out.println("peek : " + q.peek());
    }
}
