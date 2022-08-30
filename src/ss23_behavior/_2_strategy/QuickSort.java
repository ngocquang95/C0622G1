package ss23_behavior._2_strategy;

import java.util.List;

public class QuickSort implements SortStrategy {
    @Override
    public void sort(List<String> items) {
        System.out.println("QuickSort");
    }
}
