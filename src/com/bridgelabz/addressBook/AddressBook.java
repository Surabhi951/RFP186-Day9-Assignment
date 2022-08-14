package com.bridgelabz.addressBook;

import java.util.Scanner;

public class AddressBook {
    Scanner sc=new Scanner(System.in);

    ContactPerson createContact(){
        ContactPerson contact=new ContactPerson();
        System.out.print("Enter First Name :");
        contact.setFirstName(sc.next());
        System.out.print("Enter Last Name :");
        contact.setLastName(sc.next());
        System.out.print("Enter Address :");
        contact.setAddress(sc.next());
        System.out.print("Enter City :");
        contact.setCity(sc.next());
        System.out.print("Enter State :");
        contact.setState(sc.next());
        System.out.print("Enter ZipCode :");
        contact.setZipCode(sc.nextInt());
        System.out.print("Enter Phone Number :");
        contact.setPhoneNumber(sc.nextLong());
        System.out.print("Enter email :");
        contact.setEmail(sc.next());
        return contact;
    }
}
