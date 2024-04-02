/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspert7;

/**
 *
 * @author ACER
 */
public class main {
    
    public static void main(String[] args) {

        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100000);
        }

        StopWatch objk = new StopWatch();
        selectionSort(numbers);
        objk.stop();

        System.out.println("Waktu yang dibutuhkan untuk eksekusi pengurutan 100.000 angka " + 
                            objk.getElapsedTime() + " milidetik.");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
   
