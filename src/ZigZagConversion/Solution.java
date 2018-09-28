package ZigZagConversion;

public class Solution
{
    public String convert(String s, int numRows)
    {
        int strLen = s.length();
        int col = (strLen > numRows) ?
                ((int) Math.ceil((double) (strLen - numRows) / 2.0 + 2.0)) : 1;
        char[][] m = new char[numRows][col];
        matrixInit(m, numRows, col);
        matrixFill(s, m, numRows, col);
        String res = matrixPrint(m, numRows, col);
        return res;
    }

    public void matrixFill(String s, char[][] mChar, int row, int col)
    {
        boolean goingDown = true;
        int i = 0;
        int j = 0;
        for (int strIter = 0; strIter < s.length(); strIter++)
        {
            System.out.println("matrix pos: " + i +"    "+j);
            System.out.println("String now: " + s.charAt(strIter));

            mChar[i][j] = s.charAt(strIter);
            if (goingDown)
            {
                if (i < row - 1)
                {
                    i++;
                } else
                {
                    goingDown = false;
                    i--;
                    j++;
                }
            } else
            {
                if (i > 0)
                {
                    i--;
                    j++;
                } else
                {
                    goingDown = true;
                    i++;
                }
            }
        }
    }

    public void matrixInit(char[][] mChar, int row, int col)
    {
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                mChar[i][j] = ' ';
            }
        }
    }

    public String matrixPrint(char[][] mChar, int row, int col)
    {
        String strRes = new String();
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                //System.out.print(mChar[i][j]);
                if (mChar[i][j] != ' ')
                {
                    strRes.concat(mChar.toString());
                }
            }
            //System.out.println();
        }
        return strRes;
    }
}
