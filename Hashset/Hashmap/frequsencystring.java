import java.util.*;
public class frequsencystring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       TreeMap <Character ,Integer> map=new TreeMap<>();
       String n=sc.next();
       System.out.println("Enter elements:");
        for (int i = 0; i < n.length(); i++) {
            char ch=n.charAt(i);
   if(map.containsKey(ch)){
    map.put(ch,map.get(ch)+1);
   }else{
    map.put(ch,1);
   }

        }
        System.out.println(map);
    }
}
