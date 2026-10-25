package pkgclass.ranking.system;

/*@author aranc */

import java.util.Arrays;
import java.util.Scanner;

class Student {
    String le;
    int[] an;
    double fe;

    Student(String r, int[] q) {
        le = r;
        an = q;
        fe = na();
    }

    double na() {
        int t = 0;

        for (int s : an) {
            t += s;
        }

        return (double) t / an.length;
    }
}

public class ClassRankingSystem {

    public static int ls(Student[] st, String r) {
        for (int i = 0; i < st.length; i++) {
            if (st[i].le.equalsIgnoreCase(r)) {
                return i;
            }
        }

        return -1;
    }

    public static void ss(Student[] st) {
        for (int i = 0; i < st.length - 1; i++) {
            for (int j = 0; j < st.length - 1 - i; j++) {
                if (st[j].fe < st[j + 1].fe) {
                    Student x = st[j];
                    st[j] = st[j + 1];
                    st[j + 1] = x;
                }
            }
        }
    }

    public static void pl(Student[] st) {
        System.out.println("\nCLASS LEADERBOARD");
        System.out.printf("%-6s %-12s %-10s%n",
                "Rank", "Name", "Average");

        for (int i = 0; i < st.length; i++) {
            int r = i + 1;

            if (i > 0 &&
                Double.compare(st[i].fe, st[i - 1].fe) == 0) {
                r = i;
            }

            System.out.printf("%-6d %-12s %.2f%n",
                    r, st[i].le, st[i].fe);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] ns = {"Dustin", "Arances", "Tin", "meow"};

        int[][] qd = {
            {98, 97, 96, 99},
            {75, 78, 72, 76},
            {97, 98, 96, 95},
            {68, 72, 70, 75},
            {94, 96, 95, 97}
        };

        Student[] st = new Student[ns.length];

        for (int i = 0; i < st.length; i++) {
            st[i] = new Student(ns[i], qd[i]);
        }

        System.out.print("Enter student name: ");
        String n = in.nextLine();

        int p = ls(st, n);

        if (p != -1) {
            System.out.println("\nStudent found!");
            System.out.println("Name: " + st[p].le);
            System.out.println("Scores: "
                    + Arrays.toString(st[p].an));
            System.out.printf("Average: %.2f%n", st[p].fe);
        } else {
            System.out.println("Student not found.");
        }

        ss(st);
        pl(st);

        in.close();
    }
    
}
