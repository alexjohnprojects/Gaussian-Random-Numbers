public class GaussianRandomNumbers {
    public static void main(String[] args) {
        double r = Math.pow(Math.sin(2.0 * Math.PI * Math.random()) * (-2.0 * Math.log(Math.random())), 1.0/2.0);
        System.out.println(r);
    }
}
