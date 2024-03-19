public class Main {
    public static void main(String[] args) {
        int[] array = {5, 0, 1, 4, 1, 2, 6};

        int productOfPositives = getProductOfPositives(array);
        System.out.println("Добуток додатних елементів: " + productOfPositives);

        int sumBeforeMin = getSumBeforeMin(array);
        System.out.println("Сума елементів до мінімального: " + sumBeforeMin);

        sortEvenOdd(array);

        System.out.print("Відсортований масив: ");
        printArray(array);
    }

    public static int getProductOfPositives(int[] arr) {
        int product = 1;
        for (int num : arr) {
            if (num > 0) {
                product *= num;
            }
        }
        return product;
    }

    public static int getSumBeforeMin(int[] arr) {
        int min = arr[0];
        int sum = 0;
        for (int num : arr) {
            if (num < min) {
                break;
            }
            sum += num;
        }
        return sum;
    }

    public static void sortEvenOdd(int[] arr) {
        // Сортування парних елементів
        for (int i = 0; i < arr.length; i += 2) {
            for (int j = i + 2; j < arr.length; j += 2) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 1; i < arr.length; i += 2) {
            for (int j = i + 2; j < arr.length; j += 2) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}