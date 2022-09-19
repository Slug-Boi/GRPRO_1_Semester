class BMI {
    static void bmi() {
        double weight = 84.5; // kg
        double height = 1.85; // meter
        double bmi = weight / (height * height) * 100;
        bmi = Math.round(bmi); // HINT#1: Du kan ændre i denne linje!
        bmi = bmi / 100;
        System.out.println("Med vægten " + weight +
                            "kg og højden " + height +
                            "m er din bmi: " + bmi);
}
}