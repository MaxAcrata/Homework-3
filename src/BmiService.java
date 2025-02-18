public class BmiService {
    public int calculate(double height, double weight) {
        // Формула BMI
        double bmi = weight / (height * height);

        // Округляем BMI до целого числа
        return (int) Math.round(bmi);
    }
}

