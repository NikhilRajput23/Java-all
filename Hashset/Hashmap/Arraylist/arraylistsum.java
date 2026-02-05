import java.util.*;
public class arraylistsum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     ArrayList<Integer>lt=new ArrayList<>();
     int n=sc.nextInt();
     for(int i=0;i<n;i++){
        lt.add(sc.nextInt());
     }
        int sum=0;
      for(int x:lt){
        sum+=x;

      }
           System.out.println(sum);


     }
    }
