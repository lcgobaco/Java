package reflection;

@Annotation1
public class Class1 extends SuperClass1{
    public int x;
    private int y;
    public static int z;
    private static int w;

    public Class1(int x) {
        this.x = x;
    }

    public int m1(int a) {
        String s;
        return 0;
    }

    @Deprecated
    @Annotation1
    private int m2(int b) {
        return 0;
    }

    @Annotation1
    public static int m3(int c) {
        return 0;
    }

    @Annotation1
    private static int m4(int d) {
        return 0;
    }
}
