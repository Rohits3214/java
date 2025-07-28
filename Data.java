
public class Data {
    public int add(int a, int b) {
        return a + b;
    }

    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Data obj = new Data();
        System.out.println("Sum of 2 and 3: " + obj.add(2, 3));
        System.out.println("Sum of 2, 3 and 4: " + obj.add(2, 3, 4));
        System.out.println("Sum of 2.5 and 3.5: " + obj.add(2.5, 3.5));
    }
}

