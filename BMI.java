public class BMI {

    private Pound pounds;
    private Inch inches;

    public BMI(Pound pounds, Inch inches)
    {
        this.pounds = pounds;
        this.inches = inches;
    }

    public double getBMI()
    {
        double weight = this.pounds.getKilometers();
        double height = this.inches.getMeters();

        double bmi = weight/(height*height);

        return bmi;
    }

    public String bmiInterpretation()
    {
        double bmi = this.getBMI();
        if(bmi < 18.5)
        {
          return "Underweight";
        }

        else if(bmi < 25.0 || bmi >= 18.5)
        {
          return "Normal";
        }

        else if(bmi < 30.0 || bmi >=25.0)
        {
          return "Overweight";
        }

        else
        {
          return "Obese";
        }
    }
}
