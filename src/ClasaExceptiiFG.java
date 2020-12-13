public class ClasaExceptiiFG extends Exception{
    public ClasaExceptiiFG(){}

    private void g() throws ExceptieG
    {
        throw new ExceptieG();
    }

    public void f() throws ExceptieF
    {
        try {
            this.g();
        }
        catch(ExceptieG e)
        {
            System.out.println(e.msg);
            throw new ExceptieF();
        }
    }
}
