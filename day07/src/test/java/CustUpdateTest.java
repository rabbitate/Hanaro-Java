import com.hana.data.CustDto;
import com.hana.service.CustService;

public class CustUpdateTest {
    public static void main(String[] args) {
        CustService custService = new CustService();
        try {
            CustDto updatedDto = CustDto.builder().id("id01").pwd("newPwd").name("newName").build();
            custService.modify(updatedDto);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
