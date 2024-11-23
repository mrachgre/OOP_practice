package com.aims;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo giỏ hàng
        Cart cart = new Cart();

        // Tạo một vài DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Matrix", "Action", "Unknown", 10, 14.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Inception", "Sci-Fi", "Unknown", 10, 19.99f);

        // Thêm DVD vào giỏ hàng
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);

        // Tính tổng chi phí
        System.out.println("Total cost: " + cart.totalCost());

        // Xóa một DVD
        cart.removeDigitalVideoDisc(dvd1);
        System.out.println("Total cost after removal: " + cart.totalCost());
    }
}
