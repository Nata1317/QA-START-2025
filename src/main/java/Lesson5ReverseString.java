public class Lesson5ReverseString {
    public static void main ( String[] args){
        String word = "this string will be reversed";
        String result = "";
        for (int i = word.length() -1; i >=0; i--) {
            result = result + word.charAt(i);
        }
        System.out.println(result);
    }


}
