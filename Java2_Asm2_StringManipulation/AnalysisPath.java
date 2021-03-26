package StringManipulation;

import java.util.Arrays;
import java.util.Scanner;

public class AnalysisPath extends Path {
    public static void main(String[] args) {
        Path pathMethod = new Path();
        Scanner input = new Scanner(System.in);
        System.out.println("===== Analysis Path Program =====");
        while (true) {
            System.out.println("Please input path: ");
            String path = input.next();
            // Check if user enter name in right format
            var splitPathArr = path.split("\\\\");
            int countDot = 0, countInvalidChar = 0;
            for (int i = 0; i < splitPathArr.length; i++) {
                for (int j = 0; j < splitPathArr[i].length(); j++) {
                    if (splitPathArr[i].charAt(j) == '.') {
                        countDot++;
                    } else if (!('a' <= splitPathArr[i].charAt(j) && splitPathArr[i].charAt(j) <= 'z'
                            || 'A' <= splitPathArr[i].charAt(j) && splitPathArr[i].charAt(j) <= 'Z')) {
                        if (splitPathArr[i].charAt(j) == ':'
                                || Character.isDigit(splitPathArr[i].charAt(j))) {
                            countInvalidChar--;
                        }
                        countInvalidChar++;
                    }
                }
            }
            //Check if user enter a null fileName
            var fileName = splitPathArr[splitPathArr.length - 1];
            boolean notEmpty = (fileName.indexOf('.') - 1) != -1;

            if ((splitPathArr[0].length() == 2 && (splitPathArr[0].charAt(0) >= 'A'
                    && splitPathArr[0].charAt(0) <= 'Z') && splitPathArr[0].contains(":"))
                    && (countDot == 1 && countInvalidChar == 0) && fileName.contains(".")
                    && notEmpty) {
                pathMethod.setDisk(splitPathArr[0]);
                pathMethod.setFileName(splitPathArr[splitPathArr.length - 1]);
                pathMethod.setFolders(splitPathArr);
                pathMethod.setPath(path);
                break;

            } else {
                System.out.println("Path Input Error! Please enter right path (check name format of disk, folders and file).");
            }
        }
        System.out.printf("Disk : %s%n", pathMethod.getDisk());
        System.out.printf("Extension: %s%n", pathMethod.getExtension());
        System.out.printf("File Name: %s%n", pathMethod.getFileName());
        System.out.printf("Path: %s%n", pathMethod.getPath());
        System.out.printf("Folders: %s%n", pathMethod.getFolders());
    }
}
