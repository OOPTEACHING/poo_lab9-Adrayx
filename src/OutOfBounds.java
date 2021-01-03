public class OutOfBounds {
    public static void main(String[] args)
    {
        try {
            int[] arr = new int[3];
            for (int i = 0; i < 5; i++) {
                arr[i] = i + 1;
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
