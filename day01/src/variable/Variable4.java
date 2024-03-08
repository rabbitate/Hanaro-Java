package variable;

public class Variable4 {
    public static void main(String[] args) {
        String str = "boykhk98@naver.com";

        // id와 domain 출력
        String id = str.substring(0, str.indexOf('@')).toUpperCase();
        String domain = str.substring(str.indexOf('@')+1, str.indexOf('.')).toUpperCase();
        System.out.printf("%s, %s", id, domain);
    }
}

