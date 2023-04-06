public class Latihan1 {
    private static final int MAX_SIZE = 100;
    private String[] stack = new String[MAX_SIZE];
    private int top = -1;

    public void push(String value) {
        if (top == MAX_SIZE - 1) {
            throw new StackOverflowError();
        }
        stack[++top] = value;
    }

    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top--];
    }

    public String peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int search(String value) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].equals(value)) {
                return top - i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Latihan1 st = new Latihan1();

        st.push("Aku");
        st.push("Anak");
        st.push("Indonesia");

        System.out.println("Next : " + st.peek());
        st.push("Raya");
        System.out.println(st.pop());
        st.push(":");

        int count = st.search("Aku");
        while (count != -1 && count > 1) {
            st.pop();
            count--;
        }
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
    }
}
