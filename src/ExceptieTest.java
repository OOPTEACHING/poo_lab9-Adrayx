public class ExceptieTest extends Exception {
    private String mesaj;

    public ExceptieTest(){
        mesaj = "S-a intrat in ExceptieTest";
    }

    public ExceptieTest(String mesaj)
    {
        this.mesaj = mesaj;
    }

    @Override
    public String getMessage()
    {
        return this.mesaj;
    }
}
