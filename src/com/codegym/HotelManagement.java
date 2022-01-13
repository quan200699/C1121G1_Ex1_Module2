package com.codegym;

public class HotelManagement {
    private Hotel[] hotels = new Hotel[0];

    public Hotel[] getHotels() {
        return hotels;
    }

    public void setHotels(Hotel[] hotels) {
        this.hotels = hotels;
    }

    public int size() {//Lấy ra độ dài mảng
        return this.hotels.length;
    }

    public void displayAllHotel() {
        for (int i = 0; i < this.hotels.length; i++) {
            System.out.println(hotels[i]);
        }
    }

    public void addNewHotel(int index, Hotel hotel) {
        Hotel[] newHotels = new Hotel[this.hotels.length + 1];
        for (int i = 0; i < newHotels.length; i++) {
            if (index < i) {
                newHotels[i] = this.hotels[i];
            } else if (index == i) {
                newHotels[i] = hotel;
            } else {
                newHotels[i] = this.hotels[i - 1];
            }
        }
        this.hotels = newHotels;
    }

    public void updateHotel(int index, Hotel hotel) {
        this.hotels[index] = hotel;
    }

    public void removeHotel(int index) {
        Hotel[] newHotels = new Hotel[this.hotels.length - 1];
        for (int i = 0; i < newHotels.length; i++) {
            if (i < index) {
                newHotels[i] = this.hotels[i];
            } else {
                newHotels[i] = this.hotels[i + 1];
            }
        }
        this.hotels = newHotels;
    }
}
