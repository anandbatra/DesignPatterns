package StrategyPattern;

public class Sorter {

    static GUI gui = new GUI();
    static SortingAlgorithm sortingAlgorithm;
    public static void main(String args[]) {
        sortingAlgorithm = gui.getSortingAlgorithm(gui.getUserInput());
        sortingAlgorithm.sort();
    }

}