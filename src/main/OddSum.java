import java.util.ArrayList;

public class OddSum {

    public static void main(String[] args) {
        run(args, false);
    }

    public static int run(String[] args, boolean test) {

        ArrayList<Integer> listInt = new ArrayList<>();
        int res;
        try {
        if (!test) {
            System.out.println("Elements' list :");
            for (String v : args)
                System.out.print(" " + v);
            System.out.println();
        }
        } catch (Exception e){
        	System.err.println("ups");
        }
        try {
        for (int i = 0; i < args.length; i++) {
            listInt.add(Integer.parseInt(args[i]));
        }
        

        res = sum(listInt);
        if (test) {
            return res;
        }

        System.out.println("Sum of odd elements : " + res);
        System.out.println("END!");
        } catch (Exception e) {
        	System.err.println("upps");
        }
        return 0;
    }

    public static int sum(ArrayList<Integer> listInt) {

        int result = 0;
        try {
        for (int value : listInt) {
            if (value % 2 != 0) {
                result += value;
            }
        }
        } catch (Exception e) {
        	System.err.println("uppps");
        }
        return result;
    }
}
