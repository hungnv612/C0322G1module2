package controller;

import service.CompanyManagerLinkedList;
import service.CompanyManagerMap;

public class CompanyManagerMapController {
    static CompanyManagerMap companyManagerMap = new CompanyManagerMap();
    public static void starMap() {
        companyManagerMap.displayCompanyMap();

    }
}
