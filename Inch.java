public class Inch {
    private Double inches;

    public Inch()
    {
        this.inches = 1.0;
    }

    public Inch(Double inches)
    {
        this.inches = inches;
    }

    public Double getInches()
    {
        return this.inches;
    }

    public void setInches(Double inches)
    {
        this.inches = inches;
    }

    public Double getMeters()
    {
        Double meters = this.inches * 0.0254;
        return meters;
    }
}
