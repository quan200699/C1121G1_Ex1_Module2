package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class HotelManagement {
    private List<Hotel> hotels = new ArrayList<>();

    public int size() {
        return hotels.size();
    }

    public void displayAllHotel() {
        for (int i = 0; i < hotels.size(); i++) {
            System.out.println(hotels.get(i));
        }
    }

    public void addNewHotel(Hotel hotel) {
        this.hotels.add(hotel);
    }

    public void updateHotel(int index, Hotel hotel) {
        hotels.set(index, hotel);//set là để thay đổi giá trị tại vị trí mình muốn
    }

    public void removeHotel(int index) {
        hotels.remove(index);
    }

    public int findHotelByType(String type) {//Tìm kiếm khách sạn theo loại khách sạn
        int index = -1;
        for (int i = 0; i < hotels.size(); i++) {
            if (hotels.get(i).getType().equals(type)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
