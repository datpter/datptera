package com.class1;

import com.class1.model.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManagement sm = new StudentManagement();
        System.out.println("1 .Them hoc sinh ");
        System.out.println("2 . Sua thong tin sinh vien");
        System.out.println("3. Tim sinh vien");
        System.out.println("4 .Xoa sinh vien");
        System.out.println("5 . Thoat");
        int luachon = 0;




        try {

            do {
                luachon=sc.nextInt();
                sc.nextLine();


                if(luachon==1){
                    Student sd = new Student();
                    sd.inputData();
                    sm.addNewStudent(sd);
                } else if (luachon==2) {
                    System.out.println("Nhap id sinh vien");
                    int id = sc.nextInt();

                    sm.updateStudent(id);

                } else if (luachon==3) {
                    System.out.println("Nhap id sinh vien");
                    int id = sc.nextInt();

                   Student st = sm.getStudentById(id);
                   if(st!=null){
                       System.out.println(st.toString());
                   }else {
                       System.out.println("Sinh vien ko ton tai");
                   }

                } else if (luachon==4) {
                    System.out.println("Nhap id sinh vien");
                    int id = sc.nextInt();
                    sm.detele(id);
                } else if (luachon==5) {
                    return;

                }


            }while (true);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

