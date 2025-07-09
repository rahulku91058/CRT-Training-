import java.util.*;
public class StringQuestion2 {


    public static boolean checkAcc(List<Integer> arr){
        int a=arr.get(0);
        for(int i=1;i<arr.size();i++){
//            int ans=a-arr.get(i);
            if(arr.get(i)<a){
                return false;
            }
            a=arr.get(i);
        }
        return true;
    }  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        // String s="I have 4pen and 5pencil";
//        String num="";
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                arr.add(Integer.parseInt(String.valueOf(c)));
            }
        }

        System.out.println(checkAcc(arr));

    }
}