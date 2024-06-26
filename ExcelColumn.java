import java.util.*;
import java.lang.Math;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        int j=0;
        for(int i=ch.length-1;i>=0;i--){
            sum+=(ch[i]-64)*Math.pow(26,j);
            j++;
        }
        System.out.println(sum);
    }
}
