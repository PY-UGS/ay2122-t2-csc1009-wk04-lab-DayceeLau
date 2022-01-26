public class Pound {
    private Double pounds;

    public Pound()
    {
        this.pounds = 1.0;
    }

    public Pound(Double pounds)
    {
        this.pounds = pounds;
    }

    public Double getPounds()
    {
        return this.pounds;
    }

    public void setPounds(Double pounds)
    {
        this.pounds = pounds;
    }

    public Double getKilometers()
    {
        Double kilometers = this.pounds * 0.45359237;
        return kilometers;
    }
}
