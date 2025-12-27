public class StudMarksSort {
    public static void main(String[] args) {
        int marks[] = {85, 42, 78, 90, 66}; // students' marks
        int n = marks.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (marks[j] < marks[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = marks[min_idx];
            marks[min_idx] = marks[i];
            marks[i] = temp;
        }
        System.out.println("Marks in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}
