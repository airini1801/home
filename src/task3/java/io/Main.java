package task3.java.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) throws IOException {
        //  task2();
        //task1();
        task3();
    }

    public static void task3() throws IOException {
        System.out.println("Введите  номер страницы");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberPage = Integer.parseInt(reader.readLine());
        RandomAccessFile raf = new RandomAccessFile("C:/WORK/project/sqlliteproject/123/11.txt", "r");
        int pageStart = numberPage == 1 ? 0 : numberPage * 1800;
        raf.seek(pageStart);
        byte[] page = new byte[1800];
        int read = raf.read(page);
        for (int i = 0; i < read; i++) {
            System.out.print((char) page[i]);
            if (i % 73 == 0 && i != 0) {
                System.out.println();
            }
        }
        raf.close();

    }


    public static void task2() {
        ArrayList<InputStream> al = new ArrayList<>();
        try {
            al.add(new FileInputStream("C:/WORK/project/sqlliteproject/123/1.txt"));
            al.add(new FileInputStream("C:/WORK/project/sqlliteproject/123/2.txt"));
            al.add(new FileInputStream("C:/WORK/project/sqlliteproject/123/3.txt"));
            SequenceInputStream in = new SequenceInputStream(Collections.enumeration(al));
            int x;
            while ((x = in.read()) != -1) {
                System.out.print((char) x);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void task1() {
        try (FileInputStream in = new FileInputStream("C:/WORK/project/sqlliteproject/123/11.txt")) {
            byte[] arr = new byte[50];
            int x;
            while ((x = in.read(arr)) > 0) {
                for (int i = 0; i < x; i++) {
                    System.out.print((char) arr[i]);
                    if (i % 30 == 0 && i != 0) {
                        System.out.println();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}