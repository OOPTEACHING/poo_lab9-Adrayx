public class C extends B
{
    public C(){}

    @Override
    public void throwEx() throws ExceptieNivel3 {
        throw new ExceptieNivel3();
    }
}
