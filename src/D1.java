public class D1 {
    public static void main(String[] args){
        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1);

        char ch2 = 66;
        System.out.println(ch2);

        // 조건 연산자
        int myAge = 27;
        int Z_Age = 26;
        boolean value = (myAge > 25);
        System.out.println(value);
        value = (Z_Age > 25) || (myAge > 25);
        System.out.println(value);
        
        //비트 이동 연산자
        int num =10;
        num = num << 2;
        System.out.println(num);
        
        //조건문
        int age = 10;
        if(age > 5){
            System.out.println("유치원 가자");
        }
        else{
            System.out.println("더 자자");
        }
        // switch - case
        int rank = 1;
        char medal_color;
        switch(rank){
            case 1 : medal_color = 'G';
                break;
            case 2 : medal_color = 'S';
                break;
            default:
                medal_color = 'A';
        }
        System.out.println(rank +"등의 메달 색깔은 " + medal_color + " 입니다.");
        
        //while문
        int num1=1;
        int sum1=0;
        while(num1 <= 10){
            sum1 += num1;
            num1+=1;
        }
        System.out.println("1부터 10까지의 합은 " + sum1 + " 이다.");
    }
}
