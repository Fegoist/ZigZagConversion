package ZigZagConversion;

public class Test
{
    public static void main(String[] args)
    {
        Solution sol = new Solution();
        String strIn = "AB";
        int rowNum = 1;
        String strOut = sol.convert(strIn,rowNum);
        System.out.println(strOut);
    }

}
