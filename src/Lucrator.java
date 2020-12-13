public class Lucrator {
    private String nume;
    private CalendarLucru calendar;

    public Lucrator(String nume)
    {
        this.nume = nume;
        this.calendar = new CalendarLucru();
    }

    public void lucreaza(String zi) throws ExceptieZiNelucratoare
    {
        for(int i = 0; i < calendar.getZile().length; i++)
        {
            if(calendar.getZile()[i].getNume().equals(zi))
            {
                if(calendar.getZile()[i].isEsteLucratoare())
                    System.out.println("Lucratorul " + nume + " lucreaza " + zi);
                else
                    throw new ExceptieZiNelucratoare("Exceptie: lucru nu este zi lucratoare");
                return;
            }
        }
        System.out.println(zi + " nu  exista!");
    }
}
