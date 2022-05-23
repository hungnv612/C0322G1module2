package controller;

import service.CompanyManagerArray;

public class CompanyController {
    static CompanyManagerArray companyManagerArray = new CompanyManagerArray();

    public static void star() {
        companyManagerArray.display();
        companyManagerArray.displayQuanLy();

    }
}
