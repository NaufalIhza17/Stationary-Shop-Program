/*
    Problems:
    Andi wants to create a system for his stationary shop. The shop sells various products, such as pens, pencils,
    rulers, paper, and notebooks. Each product has its price and shelf position. Help Tommy
*/

import java.util.ArrayList;
import java.util.Scanner;

public class StationaryShop {

    public static void main(String[] args) {

        ArrayList<Float> total = new ArrayList<>();
        ArrayList<String> all = new ArrayList<>();

        while (true) {
            intro();

            Scanner sc = new Scanner(System.in);
            //        try {
            int choose = sc.nextInt();
            //        }
            //        catch (Exception e) {
            //            System.out.println("ERROR: Must Input Type Integer");
            //        }

            int choosen;

            switch (choose) {
                case 1:
                    bookIntro();
                    int pick1 = sc.nextInt();

                    switch (pick1) {
                        case 1:
                            System.out.println("\n(1)");
                            book1.printProducts();

                            choosen = sc.nextInt();
                            if (choosen == 1) {
                                total.add(book1.getPrice());
                                all.add(book1.getProductName());
                            }

                            break;
                        case 2:
                            System.out.println("\n(1)");
                            book2.printProducts();

                            choosen = sc.nextInt();
                            if (choosen == 1) {
                                total.add(book2.getPrice());
                                all.add(book2.getProductName());
                            }

                            break;
                        case 3:
                            System.out.println("\n(1)");
                            book3.printProducts();

                            choosen = sc.nextInt();
                            if (choosen == 1) {
                                total.add(book3.getPrice());
                                all.add(book3.getProductName());
                            }

                            break;
                    }
                    break;
                case 2:
                    stationaryIntro();
                    int pick2 = sc.nextInt();

                    switch (pick2) {
                        case 1:
                            System.out.println("\n(1)");
                            pen1.printProducts();
                            System.out.println("\n(2)");
                            pen2.printProducts();

                            choosen = sc.nextInt();
                            if (choosen == 1) {
                                total.add(pen1.getPrice());
                                all.add(pen1.getProductName());
                            } else if (choosen == 2) {
                                total.add(pen2.getPrice());
                                all.add(pen2.getProductName());
                            }

                            break;
                        case 2:
                            System.out.println("\n(1)");
                            pencil1.printProducts();
                            System.out.println("\n(2)");
                            pencil2.printProducts();

                            choosen = sc.nextInt();
                            if (choosen == 1) {
                                total.add(pencil1.getPrice());
                                all.add(pencil1.getProductName());
                            } else if (choosen == 2) {
                                total.add(pencil2.getPrice());
                                all.add(pencil2.getProductName());
                            }

                            break;
                        case 3:
                            System.out.println("(1)");
                            ruler1.printProducts();
                            System.out.println("(2)");
                            ruler2.printProducts();

                            choosen = sc.nextInt();
                            if (choosen == 1) {
                                total.add(ruler1.getPrice());
                                all.add(ruler1.getProductName());
                            } else if (choosen == 2) {
                                total.add(ruler2.getPrice());
                                all.add(ruler2.getProductName());
                            }
                            break;
                    }
                    break;
            }

            System.out.print("\nStill buying? (Y/N)\n");
            char ans = sc.next().charAt(0);

            if (ans == 'N')
                break;
        }

        lastOutput(total, all);
    }

    public static void lastOutput(ArrayList<Float> total, ArrayList<String> all) {
        for (int i = 0 ; i < total.size() ; i++)
            System.out.println(all.get(i) + "\t$ " + total.get(i));


        float totalSpent = 0;

        for (int i = 0 ; i < total.size() ; i++)
            totalSpent += total.get(i);

        System.out.println("\nTOTAL :\t$ " + totalSpent);
    }

    public static void intro() {
        System.out.println("======== ANDI STATIONARY SHOP ========");
        System.out.println("============== welcome ===============\n");
        System.out.println("1. BOOK\n2. STATIONARY\n");
    }

    public static void bookIntro() {
        System.out.println("\n============= BOOK TYPE =============");
        System.out.println("1. Novel\n2. Academic\n3. Comic\n");
    }

    public static void stationaryIntro() {
        System.out.println("\n========== STATIONARY TYPE ==========");
        System.out.println("1. Pen\n2. Pencils\n3. Ruler\n");
    }

    static Products book1 = new Book((float)15.7, "Front", "Novel", "Maze Runner", "Second");
    static Products book2 = new Book((float)20.1, "Middle", "Academic", "Science");
    static Products book3 = new Book((float)7.7, "Front", "Comic", "Saitama", "Third");

    static Products pen1 = new Stationary((float)3.0, "Middle", "Pen", "Pilot");
    static Products pen2 = new Stationary((float)2.8, "Middle", "Pen", "New-Castle");

    static Products pencil1 = new Stationary((float)1.2, "Back", "Pencil", "Fabric");
    static Products pencil2 = new Stationary((float)2.0, "Back", "Pencil", "Mark");

    static Products ruler1 = new Stationary((float)1.5, "Back", "Ruler", "Butterfly");
    static Products ruler2 = new Stationary((float)3.3, "Back", "Ruler", "Bend");
}