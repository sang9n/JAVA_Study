import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int as, bs ;
        Scanner s = new Scanner(System.in);
        System.out.print("첫번째 계산할 값을 입력하세요---->");
        as = s.nextInt();
        System.out.print("두번째 계산할 값을 입력하세요---->");
        bs = s.nextInt();
        // System.out.print("세번째 계산할 값을 입력하세요---->");
        // cs = s.nextInt();
        // a= 20;s
        // b= 100;
        // int result = a+b;
        int result;
        

    
        System.out.print("+ - * / %");
        char option = s.next().charAt(0);
        
            if(option == 1){

            
                result = as+ bs;
                System.out.println(as + "+" + bs  + "=" + result);
                
            }
            else if(option == 2){
                result = as- bs;
                System.out.println(as + "-" + bs  + "=" + result);
            }
            else if(option == 3){

                result = as* bs;
                System.out.println(as + "*" + bs  + "=" + result);
            }
            else if(option == 4){

                result = as/ bs;
                System.out.println(as + "/" + bs  + "=" + result);
            }
            else {
                System.out.println("1~4 숫자를 입력하세요");
            }
            // default :
            //     System.out.println("1~4 숫자를 입력하세요");
        
        
    }
}
