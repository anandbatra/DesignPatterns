package StrategyPattern;

import java.util.Scanner;

public class GUI {
    
    public int getUserInput() {
        System.out.println("Enter sorting algorithm");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        return num;
    }

    public SortingAlgorithm getSortingAlgorithm(int sortAlgo) {
        if (sortAlgo == 1)
            return new BubbleSort();
        else if (sortAlgo == 2)
            return new SelectionSort();

        return new BubbleSort();
    }

}
