package api.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        task1

//        System.out.println("Son kiriting:");
//        int a = input.nextInt();
//        if(a>0){
//            a+=1;
//            System.out.println(String.format("Son musbat: %d", a));
//        }



//        task 2


//        System.out.println("Son kiriting:");
//        int a = input.nextInt();
//
//        if(a>0){
//            a+=1;
//        }
//        else{
//            a-=2;
//        }
//
//        System.out.println(String.format("Son %d", a));


//        task 3

//        System.out.println("Son kiriting:");
//        int a = input.nextInt();
//
//        if(a>0){
//            a+=1;
//        } else if (a<0) {
//            a-=2;
//        }
//        else{
//            a = 10;
//        }
//        System.out.println("son"+ a);



//        task 4


//        System.out.println("Uchta soni kirting :");
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
//        int counter = 0;
//
//
//        if(a>0){
//            counter++;
//        }
//        if(b>0){
//            counter++;
//        }
//        if(c>0){
//            counter++;
//        }
//
//        System.out.println(String.format("%d ta musbat son bor", counter));



//        task 5


//        System.out.println("Uchta son kirting :");
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
//        int counter = 0;
//
//        if (a > 0) {
//            counter++;
//        }
//        if(b>0){
//            counter++;
//        }
//        if(c>0){
//            counter++;
//        }
//        System.out.println(String.format("%1$s ta musbat son va %2$s ta mafiy son bor", counter, 3-counter));



//        task 6


//        System.out.println("Ikkita son kiriting :");
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int max_num = a;
//        if(max_num<b){
//            max_num=b;
//        }
//        else{
//            max_num=a;
//        }
//
//        System.out.println(String.format("eng katta son %d", max_num));




//        task 7

//        System.out.println("Ikkita son kiriting:");
//        int a = input.nextInt();
//        int b = input.nextInt();
//
//        if(a>b){
//            System.out.println("1-son katta");
//        }
//        else{
//            System.out.println("2-son katta");
//        }




//        task 8


//        System.out.print("ikkita son kiriting:");
//        int a = input.nextInt();
//        int b = input.nextInt();
//        if(a>b){
//            System.out.println(a + " " + b);
//        }
//        else{
//            System.out.println(b + " " + a);
//        }



//        task 9


//        System.out.println("ikkita son kirting:");
//        int a = input.nextInt();
//        int b = input.nextInt();
//
//        if(a>b){
//            System.out.println(a+" "+b);
//        }
//        else{
//            int temp = a;
//            a = b;
//            b = temp;
//            System.out.println(a+" "+b);
//        }



//        task 10


//        System.out.println("ikkita son kiriting:");
//        int a = input.nextInt();
//        int b = input.nextInt();
//         if(a!=b){
//             System.out.println(String.format("a+b=%d" , a+b));
//         }
//         else{
//             System.out.println("0");
//         }


//        task 11


//        System.out.println("ikkita son kiriting:");
//        int a = input.nextInt();
//        int b = input.nextInt();
//         if (a!=b){
//             if (a > b) {
//                 System.out.println("a="+ a );
//             }
//             else {
//                 System.out.println("b="+ b );
//             }
//         }
//         else{
//             System.out.println("0");
//         }




//        task 12


//        System.out.println("Uchta son kiriting:");
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
//
//
//        if (a>b && b>c || b>a && a>c) {
//            System.out.println("c="+c);
//        }
//        else if(a>c && c>b || c >a && a > b){
//            System.out.println("b="+b);
//        }
//        else if(c>b && b>a || b>c && a<c){
//            System.out.println("a="+a);
//        }


//        task 13


//        System.out.println("uchta son kiriting:");
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c =  input.nextInt();
//
//        if((a>b && b > c ) || (c> b && b> a)){
//            System.out.println("b= " + b);
//        }
//        else if( (a > c && c > b) || (b>c && c>a) ){
//            System.out.println("c= " + c);
//        } else if ( (c > a && a > b) || (b>a && a>c)) {
//            System.out.println("a= " + a);
//        }


//        task 14


//                System.out.println("uchta son kiriting:");
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c =  input.nextInt();
//
//        if((a>b && b > c ) || (c> b && b> a)){
//            if(a>c){
//                System.out.println(a + " " + c);
//            }
//            else {
//                System.out.println(c + " " + a);
//            }
//        }
//        else if( (a > c && c > b) || (b>c && c>a) ){
//            if(a>b){
//                System.out.println(a + " " + b);
//            }
//            else {
//                System.out.println(b + " " + a);
//            }
//        } else if ( (c > a && a > b) || (b>a && a>c)) {
//            if(c<b){
//                System.out.println(b + " " + c);
//            }
//            else {
//                System.out.println(c + " " + b);
//            }
//        }



//        task 15



//        System.out.println("Uchta son kiriting:");
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
//
//
//        if (a>b && b>c || b>a && a>c) {
//            System.out.println(a+b);
//        }
//        else if(a>c && c>b || c >a && a > b){
//            System.out.println(a+c);
//        }
//        else if(c>b && b>a || b>c && a<c){
//            System.out.println(c+b);
//        }




    }
}