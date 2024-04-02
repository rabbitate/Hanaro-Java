package second;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Second {
    public static void input(ArrayList<Book> bookArray, Scanner scanner) {
        System.out.print("책이름 입력: ");
        String bookName = scanner.nextLine();
        System.out.print("출판사 입력: ");
        String publisher = scanner.nextLine();
        System.out.print("출판일 입력: ");
        String pubDate = scanner.nextLine();
        System.out.print("가격 입력: ");
        int price = scanner.nextInt();
        Book newBook = new Book(bookName, publisher, price, LocalDate.parse(pubDate));
        bookArray.add(newBook);
        System.out.println("도서가 입고되었습니다.");
        System.out.printf("총 도서의 수는 %d권입니다.\n", bookArray.size());
    }

    public static void printBook(ArrayList<Book> bookArray) {
        for (Book book: bookArray) {
            System.out.printf("%s/%s/%s/%s\n", book.getName(), book.getPublisher(), book.getPubDate(), book.getPrice());
        }
    }

    public static void sortBook(ArrayList<Book> bookArray, Scanner scanner) {
        int n;
        System.out.println("책이름 가나다순(1) 출판일 최근순(2");
        System.out.print("정렬 기준: ");
    }

    public static void editBook(ArrayList<Book> bookArray, Scanner scanner) {
        System.out.print("수정할 책이름 입력: ");
        String bookName = scanner.nextLine();
        System.out.print("출판사 입력: ");
        String publisher = scanner.nextLine();
        System.out.print("출판일 입력: ");
        String pubDate = scanner.nextLine();
        System.out.print("가격 입력: ");
        int price = scanner.nextInt();
        Book newBook = new Book(bookName, publisher, price, LocalDate.parse(pubDate));
        int i;
        for (i = 0; i < bookArray.size(); i++) {
            if (bookArray.get(i).getName().equals(bookName)) {
                break;
            }
        }
        if (i == bookArray.size()) return;
        bookArray.set(i, newBook);
        System.out.println("도서정보가 수정되었습니다.");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookArray = new ArrayList<>();

        int input = -1;
        while (input != 6) {
            System.out.println("------ 도서 재고 관리 프로그램 ------");
            System.out.print("1.입력 2.전체출력 3.검색 4.수정 5.삭제 6.종료: ");
            input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1:
                    input(bookArray, scanner);
                    break;
                case 2:
                    printBook(bookArray);
                    break;
                case 3:
                    sortBook(bookArray, scanner);
                    break;
                case 4:
                    editBook(bookArray,scanner);
                    break;
            }
        }
    }
}
