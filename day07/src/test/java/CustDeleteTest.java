import com.hana.service.CustService;

public class CustDeleteTest {
    public static void main(String[] args) {
        CustService custService = new CustService();
        try {
            custService.remove("id13");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
