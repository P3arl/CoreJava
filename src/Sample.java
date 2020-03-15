public class Sample {
    public static void main(String[] args) {
        System.out.println("Hi This is from IntelliJ");
        new Sample().m(1,2);
    }

    int m(int... i) {
        System.out.println("int");
        return 0;
    }
    long m(long... i) {
        System.out.println("long");
        return 0;
    }
}
