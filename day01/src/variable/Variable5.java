package variable;

public class Variable5 {
    public static void main(String[] args) {
        String str = "abcdefg";
        String revStr = "";

        // 역순으로 대문자 출력
        for(int i = str.length()-1; i >= 0; i--) {
            revStr += str.charAt(i);
        }
        String result = revStr.toUpperCase();
        System.out.println(result);

//        char [] result = str.toUpperCase().toCharArray();
//        for(int i = str.length()-1; i >= 0; i--) {
//            System.out.println(result[i]);
//        }
    }


}
