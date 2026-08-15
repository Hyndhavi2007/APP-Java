package Tutorial_2;

public class Marks {

    float mark1, mark2, mark3;

    Marks(float mark1, float mark2, float mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    void totalmarks() {
        float total = mark1 + mark2 + mark3;
        System.out.println("The Total Marks of the Student: " + total);
    }

    void averagemark() {
        float average = (mark1 + mark2 + mark3) / 3;
        System.out.println("The Average Marks of the Student: " + average);
    }

    public static void main(String[] args) {

        Marks M1 = new Marks(80, 75, 90);

        M1.totalmarks();
        M1.averagemark();
    }
}