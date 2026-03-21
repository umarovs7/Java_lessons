package api.example;


import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        task 1


//        System.out.println("n son kiriting va n ta toq son chiqariladi:");
//        int n = scanner.nextInt();
//        int c = 0;
//        int i = 0;
//        int[] odd = new int[n];
//
//        while(c<n){
//            i++;
//            if(i%2==1){
//                odd[c]= i;
//                c++;
//            }
//        }
//
//        for(int num:odd){
//            System.out.println(num);
//        }


//        task 1.2

//        System.out.println("n son kirting va nta juft son chiqarib beraman:");
//        int n = scanner.nextInt();
//
//
//        int[] odd = new int[n];
//        for (int i = 1; i < n; i++) {
//            odd[i] = 2 * i ;
//            System.out.println(odd[i]);
//        }



//        task 2


//        System.out.println("n sonini kirting:");
//        int n = scanner.nextInt();
//        double[] pow_of_two = new double[n];
//
//        for(int i=0;i<=n;i++){
//            pow_of_two[i] = Math.pow(2,i);
//        }
//
//
//        for(double i:pow_of_two){
//            System.out.println(i);
//        }


//        task 3


//        System.out.println("Progresiyaning hadini kiriting");
//        int n = scanner.nextInt();
//        System.out.println("birinchi hadini va d ni kiriting:");
//        int a1 , d;
//        int[] arr = new int[n];
//        a1 = scanner.nextInt();
//        d = scanner.nextInt();
//
//        for(int i =1 ; i<=n ; i++){
//            arr[i-1] = a1+(i-1)*d;
//        }
//
//        for(int j: arr){
//            System.out.print(j+" ");
//        }



//        task 4


//        System.out.println("Progresiyaning hadini kiriting:");
//        int n = scanner.nextInt();
//        System.out.println("birinchi hadini va d ni kiriting:");
//        double b1 , q;
//        double[] arr = new double[n];
//        b1 = scanner.nextInt();
//        q = scanner.nextInt();
//
//        for(int i =1 ; i<=n ; i++){
//            arr[i-1] = b1*Math.pow(q,i-1);
//        }
//
//        for(double j: arr){
//            System.out.print(j+" ");
//        }



//        task 5


//        System.out.println("n hadini kirting:");
//        int n = scanner.nextInt();
//        int fibo1 = 0;
//        int fibo2 = 1;
//        int[] fibos = new int[n];
//        fibos[0] = fibo1;
//        fibos[1] = fibo2;
//
//        for (int i=2;i<n;i++){
//            fibos[i] = fibo1 + fibo2;
//            int newFibo = fibo1;
//            fibo1 = fibo2;
//            fibo2 = newFibo + fibo2;
//        }
//
//        for(int j:fibos){
//            System.out.print(j+" ");
//        }



//        task 6




//        System.out.println("n hadini kirting:");
//        int n = scanner.nextInt();
//        System.out.println("A va B ni kirting:");
//        int a,b;
//        a  = scanner.nextInt();
//        b = scanner.nextInt();
//        int fibo1 = a;
//        int fibo2 = b;
//        int[] fibos = new int[n];
//        fibos[0] = fibo1;
//        fibos[1] = fibo2;
//        fibos[2] = fibo2+fibo1;
//
//        for (int i=3;i<n;i++){
//            fibos[i] = 2*fibos[i-1];
//        }

//        for(int j:fibos){
//            System.out.print(j+" ");
//        }



//        task 7

//        int[] arr = new int[5];
//        for(int i=0;i<5;i++){
//            arr[i] = scanner.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//
//        int[] arr2 = new int[5];
//        for(int i=4;i>=0;i--){
//            arr2[i] = arr[arr.length-1-i];
//        }
//        System.out.println(Arrays.toString(arr2));



//        task 8


//        int[] arr = {4,5 ,7,8,6,9};
//        int count = 0;
//        int[] odd = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]%2==1){
//                odd[count] =  arr[i];
//                count++;
//            }
//        }
//        System.out.println(Arrays.toString(odd));
//        System.out.println(count);
//



//        task 9

//        int[] arr = {4,5 ,7,8,6,9};
//        int count = 0;
//        int[] even = new int[arr.length];
//        for (int i = arr.length-1; i >= 0 ; i--) {
//            if(arr[i]%2==0){
//                even[count] =  arr[i];
//                count++;
//            }
//        }
//        int[] temp = Arrays.copyOf(even,count);
//        System.out.println(Arrays.toString(temp));
//        System.out.println(count);



//        task 10


//        int[] arr = {4,5,7,8,6,9};
//        int[] temp = new int[arr.length];
//        int count = 0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]%2==0){
//                temp[count] =  arr[i];
//                count++;
//            }
//        }
//        for(int i=arr.length-1;i>=0;i--){
//            if(arr[i]%2==1){
//                temp[count] =  arr[i];
//                count++;
//            }
//        }
//
//        System.out.println(Arrays.toString(temp));



//        task 11


//        System.out.println("massivning nechtaligini kiriting:");
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        int[] temp = new int[n];
//        int count = 0;
//        System.out.println("k sonini kirting");
//        int k  = scanner.nextInt();
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        for(int i = k ; i < n; i+=k){
//            temp[count]=arr[i];
//            count++;
//        }
//        System.out.println(Arrays.toString(Arrays.copyOf(temp,count)));



//        task 12


//        System.out.println("massivning sonini kirting:");
//        int n = scanner.nextInt();
//        int[] temp = new int[n];
//        int count = 0;
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < n; i+=2) {
//            temp[count] = arr[i];
//            count++;
//        }
//
//        System.out.println(Arrays.toString(Arrays.copyOf(temp, count)));



//        task 13


//        System.out.println("n ni kirting:");
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        int[] temp = new int[n];
//
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//
//        for (int i = 1; i < n; i+=2) {
//            temp[count] = arr[n-i];
//            count++;
//        }
//
//        System.out.println(Arrays.toString(Arrays.copyOf(temp, count)));


//        task 14


//        System.out.println("n ni kirting:");
//        int n = scanner.nextInt();
//        int count =  0;
//        int[] temp = new int[n];
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < n; i+=2) {
//            temp[count] =  arr[i];
//            count++;
//        }
//
//
//        for (int i = 1; i < n; i+=2) {
//            temp[count] =  arr[i];
//            count++;
//        }
//
//        System.out.println(Arrays.toString(temp));


        //task 15



//        System.out.println("n ni kirting:");
//        int n = scanner.nextInt();
//        int count =  0;
//        int[] temp = new int[n];
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        for (int i = 1; i < n; i+=2) {
//            temp[count] =  arr[i];
//            count++;
//        }
//
//
//        for (int i = n-2; i >= 0; i-=2) {
//            temp[count] =  arr[i];
//            count++;
//        }
//
//        System.out.println(Arrays.toString(temp));
//
//
//
    }



}