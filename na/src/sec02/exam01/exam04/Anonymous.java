package sec02.exam01.exam04;

public class Anonymous {
    private int field;

    public void method(final int arg1, int arg2) {
        final int var1 = 0;
        int var2 = 0;

        field = 10;

//        arg2 = 10;
//        var1 = 10;
//        var2 = 10;

        Calculaterble calc = new Calculaterble() {
            @Override
            public int sum() {
                int result = field + arg1 + arg2 + var1 + var2;
                return result;
            }
        };
        System.out.println(calc.sum());
    }
    public void method() {
    }
}
