import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {
    public static void main(String[] args) {
        // Get current date and time
        LocalDateTime current = LocalDateTime.now();
        
        // Print default format
        System.out.println("Current Date and Time: " + current);
        
        // Format the output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatted = current.format(formatter);
        System.out.println("Formatted Date and Time: " + formatted);
    }
}