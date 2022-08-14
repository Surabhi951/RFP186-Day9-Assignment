package com.bridgelabz.addressBook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address-book");
        AddressBook addressBook=new AddressBook();
        Scanner sc = new Scanner(System.in);

        boolean doExit=false;
        while (!doExit) {
            System.out.println("******************\nSelect Option :");
            System.out.println("1.Add Contact\n2.Edit Contact\n3.Delete Contact\n4.Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    addressBook.deleteContact();
                    break;
                case 4:
                    doExit = true;
                    break;
                default:
                    System.out.println("Select valid option");
            }
        }
    }
}
