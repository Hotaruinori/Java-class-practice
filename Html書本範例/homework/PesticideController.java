// PesticideController.java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;

@SpringBootApplication
@RestController
public class PesticideController {
    @GetMapping("/")
    public String index() {
        ResultSet rs = MySQLConnector.executeQuery("SELECT * FROM pesticide_licenses");
        StringBuilder sb = new StringBuilder();
        try {
            while (rs.next()) {
                sb.append(rs.getString(1) + " " + rs.getString(2) + "<br>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(PesticideController.class, args);
    }
}