public class ThrowException {
    public static void main(String[] args)
    {
        Lucrator lucrator1 = null;
        try
        {
            lucrator1.lucreaza("Joi");
            lucrator1.lucreaza("Maine");
            lucrator1.lucreaza("Sambata");
        }
        catch (ExceptieZiNelucratoare exceptieZiNelucratoare)
        {
            System.out.println(exceptieZiNelucratoare.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("exceptie!");
            e.printStackTrace();
        }
    }
}
