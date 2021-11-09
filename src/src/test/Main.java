package test;

public class Main {
    public static void main(String[] args) {
        try {


            License num = new License("АА123А77");
            System.out.println(num);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
