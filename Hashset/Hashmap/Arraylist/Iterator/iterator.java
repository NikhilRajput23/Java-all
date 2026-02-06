import java.util.*;
public class iterator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>lt=new ArrayList<>();
        int n=sc.nextInt();
          for(int i=0;i<n;i++){
            lt.add(sc.nextInt());
          }
          Iterator<Integer>it=lt.iterator();
          while(it.hasNext()){
             int x=it.next();
             System.out.println(x); 
          
          if(x%2==0){
            it.remove();
          }
    }
System.out.println(lt);}
}
