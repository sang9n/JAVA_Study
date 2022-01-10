import java.util.*;

public class Week1{
    public static void main(String[] args){
        // printf 를 사용
        // char ch = 'a';
        // System.out.printf("%c\n",ch);

        // Scanner scan = new Scanner(System.in);
        // char scan_ch = scan.next().charAt(0);
        // System.out.print(scan_ch);

        // int a =99;
        // System.out.printf(" And 연산 : %s \n",(a>100) &&(a==99));

        String str = "JAVA is sexy";
        int len = str.length();
        String strAry[];
        strAry = str.split(" ");
        for(int i=0; i<strAry.length;i++)  // strAry는 문자열이 아니라 배열이기 때문에 .length 이다.
            System.out.printf("%s\n",strAry[i]);
    }
}
