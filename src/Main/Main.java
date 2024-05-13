/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import View.DangNhap;
public class Main {
     public static void main(String[] args) {
         DangNhap dialog =new DangNhap(null,true);
         dialog.setTitle("Đăng nhập hệ thống ");
         dialog.setResizable(false);
         dialog.setLocationRelativeTo(null);
         dialog.setVisible(true);
     }
}
