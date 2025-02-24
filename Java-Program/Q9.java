//Question:
Fix the infinite loop.

public class InfiniteLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
        }
    }
}

//Expected Output:
    0
    1
    2
    3
    4
