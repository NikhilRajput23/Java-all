import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class hashmap1 {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
    TreeMap<Integer,String>s=new TreeMap<>();
      int n=sc.nextInt();
      for(int i=0;i<n;i++){
        int id=sc.nextInt();
        String name=sc.next();
      if(s.containsKey(id)){
        System.out.println("Duplicate is "+ id);
      }else{
    s.put(id,name);
      }
      }
      System.out.println(s);
    }
}
