import java.util.*;

public class p23_AverageGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            ArrayList<Double> grades = new ArrayList<>();
            for (int j = 1; j < input.length; j++) {
                grades.add(Double.parseDouble(input[j]));
            }
            students.add(new Student(name, grades));
        }

        students.stream()
                .filter(s -> s.getAverage() >= 5.00)
                .sorted((a, b) -> {
                    int result = a.getName().compareTo(b.getName());

                    if (result == 0) {
                        result = Double.compare(b.getAverage(), a.getAverage());
                    }

                    return result;
                })
                .forEach(s -> {
                    System.out.printf("%s -> %.2f%n", s.getName(), s.getAverage());
                });
    }
}

class Student {
    public Student(String name, ArrayList<Double> grades) {
        this.name = name;
        this.grades = grades;

        Double total = 0.0;
        for(Double grade : grades){
            total += grade;
        }
        this.average = total / grades.size();
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public Double getAverage() {
        return average;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }

    private String name;
    private ArrayList<Double> grades = new ArrayList<>();
    private Double average;
}