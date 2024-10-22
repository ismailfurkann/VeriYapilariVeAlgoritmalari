class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {22, 27, 16, 2, 18, 6};

        // Diziyi sıralamadan önce yazdır
        System.out.println("Başlangıç dizisi:");
        printArray(arr);

        insertionSort(arr);

        // Sıralandıktan sonra diziyi yazdır
        System.out.println("Sıralanmış dizi:");
        printArray(arr);
    }

    // Insertion Sort fonksiyonu
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Key değerinden büyük elemanları sağa kaydır
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

            // Her adımda diziyi yazdır
            System.out.println("Adım " + i + ":");
            printArray(arr);
        }
    }

    // Diziyi yazdırmak için yardımcı fonksiyon
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}