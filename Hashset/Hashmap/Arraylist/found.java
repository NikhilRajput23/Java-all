import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class found {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>lt=new ArrayList<>();
        int n=sc.nextInt();
         for(int i=0;i<n;i++){
            lt.add(sc.nextInt());
         }
         Iterator<Integer> it=new Iterator<>();
        for(int x:lt){
         if(!it.contains(x)){
            it.add(x);
         }
        }
     System.out.println(lt);
    }
}
