import java.util.*;
public class frequsency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       HashMap <Integer ,Integer> map=new HashMap<>();
       int n=sc.nextInt();
       System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
   if(map.containsKey(x)){
    map.put(x,map.get(x)+1);
   }else{
    map.put(x,1);
   }

        }
        System.out.println(map);
    }
}
