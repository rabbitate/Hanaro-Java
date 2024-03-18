import com.hana.data.CustDto;
import com.hana.service.CustService;

import java.util.List;

public class CustSelectAllTest {
    public static void main(String[] args) {
        CustService custService = new CustService();
        List<CustDto> custDtoList = null;

        try {
            custDtoList = custService.get();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        for (CustDto custDto: custDtoList) {
            System.out.println(custDto);
        }
    }
}
