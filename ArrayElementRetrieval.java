package week4;

import java.util.Scanner;

public class ArrayElementRetrieval {
    public static void main(String[] args) {
        // 10 elemanlı array oluşturuldu.
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // kullanıcıdan index numarası almai
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir index numarası giriniz : ");
        int index = sc.nextInt();

        try {
            int element = retrieveElement(array, index);
            System.out.println("Belirtilen indeksteki eleman: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Belirtilen indeks dizi boyutunun dışındadır.");
        }
    }

     //  alınan indeksteki elemanı döndüren  metot
    public static int retrieveElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }
}
