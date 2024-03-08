package variable;

public class Variable3 {
    public static void main(String[] args) {
        int a = 10; // 이진수로 변환되어 Stack 영역에 저장된다
        String str1 = "abc"; // Reference type 변수 -> Heap 영역에 저장된 메모리의 첫 번째 주소를 저장한다(참조), "abc"는 Heap 영역의 String pool에 저장된다
        String str2 = new String("abc");
        String str3 = "abc"; // String pool에 "abc"가 있으므로 str1과 같은 주소를 참조한다
        String str4 = new String("abc");

        // 주소 비교
        if(str1 == str2) {
            System.out.println("같은 주소를 가지고 있다."); // 같은 주소를 가지지 않는다
        }

        // 주소 비교
        if(str1 == str3) {
            System.out.println("같은 주소를 가지고 있다."); // 같은 주소를 가진다
        }

        if(str1.equals(str2)) {
            System.out.println("같은 문자열이다.");
        }

        str3 = "ab"; // String pool에 "ab"가 저장되고 그 주소를 참조한다 -> 문자열의 수정은 불가능하고 대체된다

        String result = str3 + 1;
        System.out.println(result);

        String str5 = "10";
        int result2 = Integer.parseInt(str5) * 1;
        System.out.println(result2);

        int num = 100;
        String result3 = num + ""; // 기본자료형이 문자열로 변환되어 문자열 연결된다
    }
}