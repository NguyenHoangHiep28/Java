package guessluckynumgame;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Integer> eachGameGuessTimes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String confirmContinue;
        int totalGuesses = 0;
        int totalGames = 0;
        int bestGame;
        GameManagement gm = new GameManagement();
        System.out.println("*-------------------Chào mừng bạn đến với trò chơi---------------------*");
        System.out.println("*-----------------------đi tìm con số may mắn--------------------------*");
        System.out.println("                                  *");
        System.out.println("                                 * *");
        do {
            eachGameGuessTimes.add(gm.guessAndGetTimes(sc));
            totalGames++;
            System.out.print("Bạn có muốn tiếp tục trò chơi hay không? Nhập Y để tiếp tục hoặc N để ngừng trò chơi ");
            confirmContinue = sc.next();
        } while (confirmContinue.equalsIgnoreCase("y"));
        //get best game
        eachGameGuessTimes.sort((o1, o2) -> o1 - o2);
        bestGame = eachGameGuessTimes.get(0);
        // get total guesses
        for (Integer g : eachGameGuessTimes) {
            totalGuesses += g;
        }
        int number = 1;
        while (number <= 21) {
            System.out.print(" -");
            number++;
        }
        System.out.println();

        System.out.println("| *** Tổng số lần chơi :" + " " + totalGames);
        System.out.println("| *** Tổng số lần dự đoán :" + " " + totalGuesses);
        System.out.printf("| *** Số lần dự đoán trung bình : %.1f%n", (double) (totalGuesses / totalGames));
        System.out.println("| *** Số lần dự đoán thấp nhất : " + bestGame);
        int number1 = 1;
        while (number1 <= 21) {
            System.out.print(" -");
            number1++;
        }
        System.out.println();
        System.out.println("Xin cảm ơn. Chúc bạn gặp nhiều may mắn!");

    }
}
