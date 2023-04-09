class Main
{
    // Алгоритм бинарного поиска для возврата позиции ключа `x` в
    // подмассив A[left…right]
    private static int binarySearch(int[] A, int left, int right, int x)
    {
        // базовое состояние (пространство поиска исчерпано)
        if (left > right) {
            return -1;
        }

        // находим среднее значение в пространстве поиска и
        // сравнивает его с ключом

        int mid = (left + right) / 2;

        // может произойти переполнение. Использовать
        // int mid = left + (right - left) / 2;

        // базовое условие (ключ найден)
        if (x == A[mid]) {
            return mid;
        }

        // отбросить все элементы в правильном пространстве поиска,
        // включая средний элемент
        else if (x < A[mid]) {
            return binarySearch(A, left, mid - 1, x);
        }

        // отбрасываем все элементы в левой области поиска,
        // включая средний элемент
        else {
            return binarySearch(A, mid + 1, right, x);
        }
    }

    // Возвращает позицию ключа `x` в заданном массиве `A` длины `n`
    public static int exponentialSearch(int[] A, int x)
    {
        // базовый вариант
        if (A == null || A.length == 0) {
            return -1;
        }

        int bound = 1;

        // найти диапазон, в котором будет находиться ключ `x`
        while (bound < A.length && A[bound] < x) {
            bound *= 2;        // вычисляем следующую степень числа 2
        }

        // вызов бинарного поиска на A[bound/2 … min(bound, n-1)]
        return binarySearch(A, bound/2, Integer.min(bound, A.length - 1), x);
    }

    // Алгоритм экспоненциального поиска
    public static void main(String[] args)
    {
        int[] A = {2, 5, 6, 8, 9, 10};
        int key = 9;

        int index = exponentialSearch(A, key);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        }
        else {
            System.out.println("Element not found in the array");
        }
    }
}


