import java.util.Scanner;
    public class toBinaryString {

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        String str ="";
        while(n>0)
        {
            str= Integer.toString(n%2)+str;
            n = n/2;
        }
        int leng = str.length();
                for(int i =1;i<=8-leng;i++)
                {
                    str="0"+str;
                }
    System.out.println(str);


    }
}
