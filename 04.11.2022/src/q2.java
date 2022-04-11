class CheckArgument extends Exception {
    int num;
    CheckArgument(int num) {
        this.num = num;
    }

    public String toString() {
        return ("No. of argument: " + num + "\nRequired: 4");
    }
}

public class q2 {
    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgument(args.length);
            } else {
                int sum = 0;
                for (int i = 0; i < args.length; i++) {
                    int val = Integer.parseInt(args[i]);

                    sum += (val * val);
                }

                System.out.println(sum);
            }
        } catch (CheckArgument e) {
            System.out.println(e);
        }
    }
}
