package NegativeTests;

import Pages.LoginPage;
import Tests.MethodLevelTest;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;

public class LoginNegativeTest extends MethodLevelTest {
    @DataProvider(name = "excel-data-provider")
    public Object[][] dataProviderMethod() throws Exception {
        FileInputStream file = new FileInputStream(new File("C:/Users/DELL/Documents/dataPro.xlsx"));
        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet = workbook.getSheetAt(0);
        Object[][] data = new Object[sheet.getLastRowNum()][2];
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i + 1);
            data[i][0] = row.getCell(0).getStringCellValue();
            data[i][1] = row.getCell(1).getStringCellValue();
        }
        return data;
    }

    @Test(dataProvider = "excel-data-provider")
    public void loginNegative(String username,String password){
        loginAs(username,password);
        new LoginPage(driver,wait).validateNegativeLogin();
    }
}
