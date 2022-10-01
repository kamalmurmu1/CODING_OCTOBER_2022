import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args)
            throws IOException
    {
        if (System.getProperty("ONLINE_JUDGE") == null) {
            // Redirecting the I/O to external files

            // as ONLINE_JUDGE constant is not defined which
            // means

            // the code is not running on an online judge

            PrintStream ps
                    = new PrintStream(new File("output.txt"));
            InputStream is
                    = new FileInputStream("input.txt");

            System.setIn(is);
            System.setOut(ps);
        }
    }
}