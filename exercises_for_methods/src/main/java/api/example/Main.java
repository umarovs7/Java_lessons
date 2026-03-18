package api.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


//        task1

//        System.out.println("Son kiriting va uning 3-darajasini chiqarib beraman:");
//
//        int a = scanner.nextInt();
//
//        int result = powerA3(a);
//
//        System.out.println("Sonning 3-darajasi = " + result);
//
//        scanner.close();


//        task 2

//        System.out.println("son kiriting va uning 2,3,4 darajalarini chiqarib beraman:");
//        double a = scanner.nextInt();
//
//        System.out.println(powerA234(a));


//        task 3


//        System.out.println("4ta son kirting:");
//        double a=scanner.nextInt(),b = scanner.nextInt(),c = scanner.nextInt(),d = scanner.nextInt();
//
//        Mean(a,b,c,d);


//        task 4


//        System.out.println("teng tomonli uchburchakning tomonini kirting,uchta tomon kiritiladi :");
//        float a = scanner.nextInt();
//        float b = scanner.nextInt();
//        float c = scanner.nextInt();
//
//        Triangle(a,b,c);


//        task 5


//        System.out.println("Togri tortburchakning qarama-qarshi taraflarni kirting , x1 , y1, x2,y2 : ");
//        int x1 = scanner.nextInt();
//        int y1 = scanner.nextInt();
//        int x2 = scanner.nextInt();
//        int y2 = scanner.nextInt();
//
//        rectPs(x1,y1,x2,y2);


//        task 6

//        System.out.println("son kirting:");
//        String n = scanner.nextLine();
//
//        digitCountSum(n);

//        task 7

//        System.out.println("son kirting:");
//        String son = scanner.nextLine();
//
//        System.out.println(invertDigits(son));


//        task 8


//        System.out.println("Son va raqam kirting:");
//        int k = scanner.nextInt();
//        int n =  scanner.nextInt();
//        System.out.println(addLeftDigit(k,n));


//        task 9

//        System.out.println("son va raqam kirting:");
//        int son = scanner.nextInt();
//        int raqam = scanner.nextInt();
//        addLeftDigit(son,raqam);



//        task 10


//        System.out.println("A son va B son kirting:");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        Swap(a,b);

    }


//    for_task1

//    public static int powerA3(int a){
//        return a * a * a;
//    }


//    for_task2


//    public static String powerA234(double a){
//        String answer = String.format("%1$s ning 2darajasi = %2$s ,%1$s ning 3darajasi = %3$s ,%1$s ning 4darajasi = %4$s , ", a , a*a,a*a*a,a*a*a*a);
//        return answer;
//    }
//

//    for_task3


//    public static void Mean(double a, double b , double c , double d){
//        double avg_sum_ab = (a+b)/2;
//        double avg_sum_ac = (c+a)/2;
//        double avg_sum_ad = (d+a)/2;
//
//        double avg_ab = Math.sqrt(a*b);
//        double avg_ac = Math.sqrt(a*c);
//        double avg_ad = Math.sqrt(a*d);
//
//        String answer = String.format("a va b ning orta arifmetigi = %1$s , a va c ning orta arifmetigi = %2$s , a va d ning orta arifmetigi = %3$s , a va b ning orta geometrigi = %4$s , a va c ning orta geometrigi = %5$s ,  a va d ning orta geometrigi = %6$s ", avg_sum_ab , avg_sum_ac , avg_sum_ad , avg_ab , avg_ac , avg_ac);
//
//        System.out.println(answer);
//
//
//    }


//    for_task4


//    public static void Triangle(float a,float b ,float c){
//        float first_tri = 3*a;
//        float second_tri = 3*b;
//        float third_tri = 3*c;
//
//        double first= (Math.pow(a,2) * Math.sqrt(3))/4;
//        double second= (Math.pow(b,2) * Math.sqrt(3))/4;
//        double third = (Math.pow(c,2) * Math.sqrt(3))/4;
//
//
//        System.out.println(String.format("Birinchi uchburchakning yuzi %1$s , perimetri %2$s , ikkinchi uchburchak yuzi %3$s , perimetri %4$s , uchunchi uchburchak yuzi %5$s , perimetri %6$s ",first_tri ,first,second_tri,second,third_tri,third));
//
//    }


//    for_task5


//    public static void rectPs(int x1 , int y1 ,int x2 , int y2 ){
//        int a = Math.abs(x1 - x2);
//        int b = Math.abs(y1 - y2);
//
//        int p = 2*(a+b);
//        int s = a*b;
//        System.out.println("Togri burchakning perimetri = " + p);
//        System.out.println("Togri burchakning yuzi = " + s);
//    }


//    for_task 6


//    public static void digitCountSum(String n ){
//        int sum = 0 ;
//
//        for (String s : n.split("")) {
//            sum += Integer.parseInt(s);
//        }
//        System.out.println(String.format("sonning yigindisi %1$s va raqamlar soni %2$s" , sum , n.length()));

//    }


//    for_task7

//    public static int invertDigits(String number) {
//        String reversed = new StringBuilder(number).reverse().toString();
//        return Integer.parseInt(reversed);
//    }


//    for_task8


//    public static int addLeftDigit(int son , int raqam){
//        String n = Integer.toString(son);
//        String raq = Integer.toString(raqam);
//
//        return  Integer.parseInt(n+raq);
//
//    }


//    for_task 9

//    public static void addLeftDigit(int son , int raqam){
//        String n =  String.valueOf(son);
//        String r = String.valueOf(raqam);
//
//        System.out.println(Integer.parseInt(r+n));
//
//    }


//    for_task10


    public static void Swap(int a , int b){
        int temp = a;
        a = b ;
        b = temp;

        System.out.println(String.format("Swap %d to %d",a,b));

    }



}

