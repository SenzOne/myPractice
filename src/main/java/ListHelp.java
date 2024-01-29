import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class ListHelp {
    public static void main(String[] args) throws IOException {
        ArrayList<String> noSearchList = new ArrayList<>();
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/resources/from.csv"), StandardCharsets.UTF_8));
                BufferedReader br2 = new BufferedReader(new FileReader("src/main/resources/DataDtd4.csv", StandardCharsets.UTF_8));
                FileWriter writer = new FileWriter("src/main/resources/result.csv", StandardCharsets.UTF_8)
        ) {
            String line;
            String line2;

            while ((line = br.readLine()) != null) {
                while ((line2 = br2.readLine()) != null) {
                    String[] line2list = line2.split(";");
                    if (line2list.length > 8 && line.trim().replace("\uFEFF", "").equalsIgnoreCase(line2.split(";")[5].trim())) {
                        String group = line2.split(";")[4].trim();
                        String date = line2.split(";")[7].trim();
                        String adres = line2.split(";")[9].trim();
                        String res = String.format("%s;%s;%s;%s;\n", line, group, date, adres);
                        writer.write(res);
                        break;
                    } else {
                        if (line2list.length > 8) {
                            noSearchList.add(line2.split(";")[5].trim());
                        }

                    }
                }
            }
            System.out.println(noSearchList);
        }
    }
}
