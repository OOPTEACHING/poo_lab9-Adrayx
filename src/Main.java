public class Main {
    public static void main(String[] args)
    {
        Lucrator lucrator1 = new Lucrator("Andrei");
        //Lucrator lucrator1 = null;
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
        catch (NullPointerException e)
        {
            System.out.println("Lucrator inexistent sau null!");
            //e.printStackTrace();
        }
        finally {
            System.out.println("Maine va fi o noua zi!");
        }
    }
}
