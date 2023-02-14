import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int list[] = new int[10];

        System.out.print("Dizi kaç elemanlı olacak ? :");
        int n = input.nextInt();
        System.out.print("Lütfen dizinin elemanlarını giriniz :");
        for(int i = 0; i < n; i++){
            list[i] = input.nextInt();
        }

        for(int i = 0; i < n; i++){
            for(int j = 1 + i; j < n; j++){
                if (list[i] > list[j]){
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        System.out.println("Sıralamadan sonra dizi :");
        for (int i = 0; i < n; i++){
            System.out.print(" " + list[i]);
        }
    }
}