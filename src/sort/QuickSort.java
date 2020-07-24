package sort;

public class QuickSort {

    static String bigSorting(String[] unsorted) {
        quickSort(unsorted, 0, unsorted.length - 1);
        StringBuilder sb = new StringBuilder();
        for (String s : unsorted) {
            sb.append(s).append("\n");
        }
        return sb.toString();
    }

    private static void quickSort(String[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
    }

    private static int partition(String[] unsorted, int low, int high) {
        int smallestElementIndex = low - 1;
        String pivotAsString = unsorted[high];
        for (int i = low; i < high; i++) {

            if (isPivotBigger(unsorted[i], pivotAsString)) {
                smallestElementIndex++;
                swap(smallestElementIndex, i, unsorted);
            }
        }
        smallestElementIndex++;
        swap(smallestElementIndex, high, unsorted);
        return smallestElementIndex;


    }

    private static boolean isPivotBigger(String value, String pivotAsString) {
        if (value.length() > pivotAsString.length()) {
            return false;
        }
        if (value.length() < pivotAsString.length()) {
            return true;
        }
        for (int i = 0; i < value.length(); i++) {
            if ((int) value.charAt(i) > (int) pivotAsString.charAt(i)) {
                return false;
            }
            if ((int) value.charAt(i) < (int) pivotAsString.charAt(i)) {
                return true;
            }
        }
        return false;
    }


    private static void swap(int i, int j, String[] array) {
        String tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void main(String[] args) {
        String s = bigSorting(new String[]{"1", "10", "155", "2"});
        System.out.println(s);
    }
}




































