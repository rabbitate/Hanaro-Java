package scoreProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreProgram {
    public static Object[] inputScore() {
        Scanner scanner = new Scanner(System.in);

        Object[] newArray = new Object[6];
        System.out.print("이름 입력: ");
        newArray[0] = scanner.nextLine();
        System.out.println("");

        System.out.print("국어 점수 입력: ");
        newArray[1] = scanner.nextInt();
        System.out.println("");

        System.out.print("영어 점수 입력: ");
        newArray[2] = scanner.nextInt();
        System.out.println("");

        System.out.print("수학 점수 입력: ");
        newArray[3] = scanner.nextInt();

        newArray[4] = (int)(newArray[1]) + (int)(newArray[2]) + (int)(newArray[3]);
        newArray[5] = Double.valueOf((int)newArray[4]) / 3.0;

        return newArray;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object[]> scoreArray = new ArrayList<>();

        while (true) {
            System.out.println("-----------성적 관리 프로그램-------------");
            System.out.print("1.입력 2.전체출력 3.검색 4.수정 5.삭제 6.종료 : ");
            int input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1:
                    scoreArray.add(inputScore());
                    break;
                case 2:
                    for (Object[] student: scoreArray) {
                        System.out.printf("이름: %s 국어: %d 영어: %d 수학: %d 총점: %d 평균: %f\n", student[0], student[1], student[2], student[3], student[4], student[5]);
                    }
                    break;
                case 3:
                    System.out.print("검색할 사람의 이름 : ");
                    String searchName = scanner.nextLine();
                    for (Object[] student: scoreArray) {
                        if (searchName.equals(student[0])) {
                            System.out.printf("이름: %s 국어: %d 영어: %d 수학: %d 총점: %d 평균: %f\n", student[0], student[1], student[2], student[3], student[4], student[5]);
                        }
                    }
                    break;
                case 4:
                    System.out.print("수정할 사람의 이름 : ");
                    String editName = scanner.nextLine();
                    for (int i = 0; i < scoreArray.size(); i++) {
                        if (scoreArray.get(i)[0].equals(editName)) {
                            System.out.print("수정할 내용은? 1.국어 2.영어 3.수학 : ");
                            int select = scanner.nextInt();
                            switch (select) {
                                case 1:
                                    System.out.print("국어 점수 수정: ");
                                    break;
                                case 2:
                                    System.out.print("영어 점수 수정: ");
                                    break;
                                case 3:
                                    System.out.print("수학 점수 수정: ");
                                    break;
                            }
                            int editScore = scanner.nextInt();
                            scoreArray.get(i)[select] = editScore;
                            scoreArray.get(i)[4] = (int)(scoreArray.get(i)[1]) + (int)(scoreArray.get(i)[2]) + (int)(scoreArray.get(i)[3]);
                            scoreArray.get(i)[5] = Double.valueOf((int)scoreArray.get(i)[4]) / 3.0;
                        }
                    }
                    break;
                case 5:
                    System.out.print("삭제할 사람의 이름 : ");
                    String deleteName = scanner.nextLine();
                    for (Object[] student : scoreArray) {
                        if (student[0].equals(deleteName)) {
                            scoreArray.remove(student);
                            break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("종료!");
                    return;
            }
        }
    }
}
