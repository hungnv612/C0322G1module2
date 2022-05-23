package controller;

import service.CompanyManagerLinkedList;

public class CompanyLinkedListController {
    static CompanyManagerLinkedList companyManagerLinkedList = new CompanyManagerLinkedList();

    public static void starLinkedList() {
        companyManagerLinkedList.displayArrayLinkedList();

    }
}
