package net.javaguides.corejava.arrays.programs;

public class PyramidsExamples {

    public static void main(final String[] args) {

        trianglePyramid(10);

        System.out.println();

        reverserTrianglePyramid(10);

        System.out.println();

        pyramid(9);

        System.out.println();

        reversePyramid(10);
    }

    public static void trianglePyramid(final int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void reverserTrianglePyramid(final int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    public static void pyramid(final int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    public static void reversePyramid(final int n) {
        for (int i = n; i >= 0; i--) {

            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
