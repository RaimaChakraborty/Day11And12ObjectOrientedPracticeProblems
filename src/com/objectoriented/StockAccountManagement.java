package com.objectoriented;
import java.util.ArrayList;
import java.util.Scanner;
public class StockAccountManagement {
    public static void main(String[] args) {
            int flag = 0;
            Scanner scanner = new Scanner(System.in);
            StockAccount p = new StockAccount();
            while (flag == 0) {
                System.out.println("Enter the details of Stock ");
                StockAccount s = new StockAccount();
                System.out.println("Enter Company Name:");
                s.company = scanner.nextLine();
                System.out.println("Enter number of share:");
                s.NoOfShare = scanner.nextInt();
                System.out.println("Enter Price of share:");
                s.price = scanner.nextDouble();

                p.stockList.add(s);
                System.out.println("Do you want to add more Stocks? enter 0 for YES or 1 for NO!");
                flag = scanner.nextInt();
            }
            for (int i = 0; i < p.stockList.size(); i++) {
                System.out.println(p.totalValue());

            }
        }
    }

    class StockAccount {
        ArrayList<Object> stockList = new ArrayList<>();
        double totalValue = 0;
        int NoOfShare;
            String company;
            double price;


        public double totalValue() {
            for (Object stock : stockList) {
                totalValue += stock.price * stock.NoOfShare;
            }
            return totalValue;
        }
    }


