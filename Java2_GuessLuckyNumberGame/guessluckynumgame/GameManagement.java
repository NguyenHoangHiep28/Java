package guessluckynumgame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameManagement {
    private int luckyNum;
    private final int minValue = 1;
    private final int maxValue = 100;

    public GameManagement() {

    }

    public GameManagement(int luckyNum) {
        this.luckyNum = luckyNum;
    }

    public int guessAndGetTimes(Scanner sc){
        this.luckyNum = (int) (Math.random() * 100);
        int guessTimes = 1;
        int luckyNumEntered;
        System.out.println("* Xin mời nhập vào con số may mắn mà bạn dự đoán dao động từ 0 đến 100 *");
        do {
            try {
                luckyNumEntered = Integer.parseInt(sc.nextLine());
                if (luckyNumEntered < 0 || luckyNumEntered > 100){
                    System.out.println("Con số bạn nhập nằm ngoài khoảng dự đoán. Hãy nhập lại nào.");
                    continue;
                }
                System.out.println("* Con số mà bạn dự đoán là: Số " + luckyNumEntered);
                if (luckyNumEntered > this.luckyNum) {
                    System.out.println("(*_*) Tiếc thật! Con số may mắn NHỎ HƠN con số mà bạn đã nhập đó. Cùng nhập lại nào.");
                } else if (luckyNumEntered < this.luckyNum) {
                    System.out.println("(*_*) Tiếc thật! Con số may mắn LƠN HƠN con số mà bạn đã nhập đó. Cùng nhập lại nào.");
                } else {
                    System.out.println("Xin Chúc Mừng bạn đã đoán đúng con số may mắn sau" + " " + guessTimes + " " + "lần đoán. Thật tuyệt vời! (+.+)");
                    break;
                }
                guessTimes++;
            } catch (NumberFormatException e) {
                System.out.println("Bạn vừa nhập 1 ký tự không phải số rồi. Nhập lại nào.");
            }
        } while (true);
        return guessTimes;
    }

}
