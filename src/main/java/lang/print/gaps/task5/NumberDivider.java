package lang.print.gaps.task5;

public class NumberDivider {
    void divide(int toBeDivided) {
//        double x;
//        ()x = toBeDivided / 5;
        System.out.println((double) toBeDivided / 5);
    }

    public static void main(String[] args) {
        NumberDivider divider = new NumberDivider();
        divider.divide(11);
    }
}
