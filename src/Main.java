import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        String string = new String(Files.readAllBytes(Paths.get("C:\\Users\\user\\Downloads\\натуральные числа.txt")));
        String[] array = string.split("\\s\\W");
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if (Integer.parseInt(array[i]) == 0) {
                System.out.println(count);
                break;
            } else if (Integer.parseInt(array[i]) % 2 == 0) {
                count++;
               /* count = count + 1;
                count += 1;*/
            }
        }
    }
}