public class Main {
    public static void main(String[] args) {
        int[] integersArray = new int[]{1, 2, 3};
        double[] doublesArray = new double[]{1.57, 7.654, 9.986};
        String[] arbitraryArray = new String[]{"Element1", "Element2", "Element3"};

        //2
        System.out.println(String.join(", ", printArray(integersArray)));
        System.out.println(String.join(", ", printArray(doublesArray)));
        System.out.println(String.join(", ", arbitraryArray));

        //3
        System.out.println(String.join(", ", printReversedArray(integersArray)));
        System.out.println(String.join(", ", printReversedArray(doublesArray)));
        System.out.println(String.join(", ", reverseArray(arbitraryArray)));

        //4
        makeOddEven(integersArray);
        System.out.println(String.join(", ", printArray(integersArray)));
    }

    public static String[] printArray(int[] array) {
        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = String.valueOf(array[i]);
        }
        return result;
    }

    public static String[] printArray(double[] array) {
        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = String.valueOf(array[i]);
        }
        return result;
    }

    public static String[] printReversedArray(int[] array) {
        String[] result = new String[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = String.valueOf(array[i]);
        }
        return result;
    }

    public static String[] printReversedArray(double[] array) {
        String[] result = new String[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = String.valueOf(array[i]);
        }
        return result;
    }

    public static String[] reverseArray(String[] array) {
        String[] result = new String[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    public static void makeOddEven(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i]++;
            }
        }
    }
}
