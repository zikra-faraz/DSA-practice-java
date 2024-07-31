package javazikdsa;

public  class Linear {

    public static void main(String[] args) {
    String name = "hello world";
    char search = 'f';
        System.out.println(searchChar(name , search));
    }
//length is variable in array while lenght() is a function in string
   static  boolean searchChar(String str , char target){
if(str.length()==0){
    return  false;
}
       for (int i = 0; i < str.length() ; i++) {
           if(target == str.charAt(i)){
               return true ;
           }
       }
       return  false;
   }
   
   



}
//    public static void main(String[] args) {
//        int[] arr= {1,2, 6,44};
//        int target = 5;
//        int[] res = sumtwo(arr , target);
//        for (int i = 0; i < res.length; i++) {
//            System.out.println(res[i]);
//        }
//
//    }
//
//    static int[] sumtwo(int[] arr , int t){
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i]+ arr[j]==t){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[]{-1 };
//    }