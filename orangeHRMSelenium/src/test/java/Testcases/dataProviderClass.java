package Testcases;

import TestData.excelReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

@Test
public class dataProviderClass {

    @DataProvider(name = "LoginData")
    public static Object [][] readLoginData() throws IOException
    {
        excelReader er = new excelReader();
        return er.getExcelData("loginData.xlsx",0);
    }
}
