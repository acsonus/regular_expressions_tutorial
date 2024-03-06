import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

import edu.acsonus.regexp.StringUtils;

public class MainTest {
    @Test
    public void testMain() {
        try {
            // Create a test file with some sample content
            File testFile = new File("testFile.txt");
            File testFile1 = new File("testFile1.txt");
            FileWriter writer = new FileWriter(testFile1);
            // Read the test file line by line

            BufferedReader reader = new BufferedReader(new FileReader(testFile));
            String line;
            while ((line = reader.readLine()) != null) {
                // Call StringUtils.rewriteInPhp for each line and print the result
                String rewrittenLine = StringUtils.rewriteInPhp(line);
                writer.write(rewrittenLine + "\n");
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    // read file testFile.txt line by line

    // for each line, call StringUtils.rewriteInPhp
    // and print the result

}
