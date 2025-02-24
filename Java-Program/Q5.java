//Question:
Fix the unreachable code issue.

public class UnreachableCode {
    public static void main(String[] args) {
        return;
        System.out.println("This will never execute.");
    }
}

//Expected Output:
    This will execute.
