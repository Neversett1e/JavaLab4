public class Main {

    /**
     * Алгоритм бинарного поиска для возврата позиции ключа `x` в подмассив A[left…right]
     *
     * @param A     массив, в котором происходит поиск
     * @param left  левая граница пространства поиска
     * @param right правая граница пространства поиска
     * @param x     искомый ключ
     * @return позицию ключа `x` в массиве `A` или `-1`, если элемент не найден
     */
    private static int binarySearch(int[] A, int left, int right, int x) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (x == A[mid]) {
            return mid;
        } else if (x < A[mid]) {
            return binarySearch(A, left, mid - 1, x);
        } else {
            return binarySearch(A, mid + 1, right, x);
        }
    }

    /**
     * Алгоритм экспоненциального поиска
     *
     * @param A массив, в котором происходит поиск
     * @param x искомый ключ
     * @return позицию ключа `x` в массиве `A` или `-1`, если элемент не найден
     */
    public static int exponentialSearch(int[] A, int x) {
        if (A == null || A.length == 0) {
            return -1;
        }

        int bound = 1;

        // найти диапазон, в котором будет находиться ключ `x`
        while (bound < A.length && A[bound] < x) {
            bound *= 2;
        }

        // вызов бинарного поиска на A[bound/2 … min(bound, n-1)]
        return binarySearch(A, bound / 2, Math.min(bound, A.length - 1), x);
    }

    /**
     * Точка входа в программу
     */
    public static void main(String[] args) {
        int[] A = {2, 5, 6, 8, 9, 10};
        int key = 9;

        int index = exponentialSearch(A, key);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}


