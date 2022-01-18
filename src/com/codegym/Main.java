package com.codegym;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = -1;
        HotelManagement hotelManagement = new HotelManagement();
        do {
            menu();
            System.out.println("Nhập lựa chọn của bạn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("---Danh sách khách sạn---");
                    hotelManagement.displayAllHotel();
                    break;
                }
                case 2: {
                    System.out.println("---Thêm thông tin khách sạn");
                    scanner.nextLine();
                    Hotel hotel = getHotel();
                    hotelManagement.addNewHotel(hotel);
                    break;
                }
                case 3: {
                    System.out.println("---Chỉnh sửa thông tin khách sạn");
                    System.out.println("Nhập vị trí muốn sửa:");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    if (index < 0 || index >= hotelManagement.size()) {
                        System.out.println("Vị trí sửa vào không hợp lệ");
                    } else {
                        Hotel hotel = getHotel();
                        hotelManagement.updateHotel(index, hotel);
                    }
                    break;
                }
                case 4: {
                    System.out.println("---Xóa thông tin khách sạn");
                    System.out.println("Nhập vị trí muốn xóa:");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    if (index < 0 || index >= hotelManagement.size()) {
                        System.out.println("Vị trí xóa vào không hợp lệ");
                    } else {
                        hotelManagement.removeHotel(index);
                    }
                    break;
                }
            }
        } while (choice != 0);
    }

    private static Hotel getHotel() {
        Person person = getPerson();
        System.out.println("Nhập số ngày trọ");
        int dayRents = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập loại phòng");
        String type = scanner.nextLine();
        System.out.println("Nhập giá phòng");
        double price = scanner.nextDouble();
        return new Hotel(dayRents, type, price, person);
    }

    private static Person getPerson() {
        System.out.println("Nhập thông tin khách trọ");
        System.out.println("Nhập tên khách trọ:");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh:");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhập căn cước:");
        String identity = scanner.nextLine();
        return new Person(name, dateOfBirth, identity);
    }

    private static void menu() {
        System.out.println("---Menu quản lý khách sạn---");
        System.out.println("1. Hiển thị tất cả thông tin");
        System.out.println("2. Thêm thông tin khách sạn");
        System.out.println("3. Cập nhật thông tin khách sạn");
        System.out.println("4. Xóa thông tin khách sạn");
        System.out.println("0. Thoát chương trình");
    }
}
