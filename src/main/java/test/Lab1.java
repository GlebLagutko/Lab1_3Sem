package test;

public class Lab1 {

    private static long fact(int k) {
        long answer = 1;
        for (int i = 1; i < k; i++) {
            answer *= i;
        }
        return answer;
    }

    private static double progMember(int k, double memb) {
        double member = memb;

        return member * ((-1) * Math.pow(4, 4)) / ((2 * k + 1) * 2 * k * Math.pow(3, 4));
    }

    public static void main(String[] args) {
        checkArgs(args);
        String arg1 = args[0];
        String arg2 = args[1];

        double x = parseDouble(arg1, 0);
        double t = parseDouble(arg2, 0.00000000000001);

        rowSum(x, t);
    }

    static void rowSum(double x, double t) {
        double sum = 0;

        double member = (x * x * Math.pow(4, 6)) / (fact(3) * Math.pow(3, 6));

        for (int k = 2; ; k++) {
            sum += member;
            member = progMember(k, member);
            System.out.println("k = " + (k - 1) + ". Sum = " + sum);
            if (Math.abs(member) < t)
                break;
        }
    }

    static double parseDouble(String value, double default_value) {
        try {
            return Double.parseDouble(value);
        } catch (Exception e) {
            return default_value;
        }
    }

    private static void checkArgs(String[] args) {
        if (args.length != 2)
            throw new RuntimeException("Wrong argument count ");
    }
}