import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Path;

public class AsciiArt {
    String art = "./art.txt";
    String[] facts = {
            "Tides are caused by the rotation of the Earth and the gravitational effects of the Moon and Sun.",
            "The human body can handle increased g-forces as seen in activities such as dragster races, airplane acrobatics and space training. The highest known acceleration voluntarily experienced by a human is 46.2 g by g-force pioneer John Stapp.",
            "The higher something is, the greater its gravitational potential energy. Back in the Middle Ages, weapons called trebuchets were used to take advantage of this principle, using mechanical advantage and the gravitational potential energy of a counterweight to hurl rocks and other projectiles at or over walls." };

    public AsciiArt(String fileName) {
        art = fileName;
    }

    public String funfact() {
        return "0";
    }

    public void makeart() throws IOException {
        // String art = args[0]; // Read filepath from cmd args
        // Path fileName = Path.of("./art.txt");
        Path fileName = Path.of(art);

        // Scanner object to read file
        Scanner sc = new Scanner(fileName);

        // Read file till the end
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
        sc.close(); // Close the file

    }
}
