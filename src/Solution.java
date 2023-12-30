public class Solution {
    public static void main(String[] args) {
        int [] myarray={5,8,7,3,4};
        int sum=0;
        for(int x=0;x<myarray.length;x++){
            sum=sum+myarray[x];
        }
        System.out.println("Sum of all elements :" + sum);
    }

}
