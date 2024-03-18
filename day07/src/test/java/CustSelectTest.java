import com.hana.data.CustDto;
import com.hana.service.CustService;

public class CustSelectTest {
    public static void main(String[] args) {
        CustService custService = new CustService();
        CustDto custDto = null;

        try {
            custDto = custService.get("id01");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(custDto);
    }
}
