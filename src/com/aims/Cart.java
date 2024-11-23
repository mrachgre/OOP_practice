package com.aims;

//Lớp Cart
public class Cart {
	public DigitalVideoDisc[] itemsOrdered; // Mảng để lưu trữ danh sách DigitalVideoDisc
	public int qtyOrdered; // Biến để theo dõi số lượng DVD trong giỏ hàng
	public final int MAX_ITEMS = 20; // Giới hạn số lượng DVD trong giỏ hàng

 // Phương thức khởi tạo
 public Cart() {
     this.itemsOrdered = new DigitalVideoDisc[MAX_ITEMS]; // Khởi tạo mảng
     this.qtyOrdered = 0; // Khởi tạo số lượng DVD
 }

 // Phương thức thêm DVD vào giỏ hàng
 public void addDigitalVideoDisc(DigitalVideoDisc disc) {
     if (qtyOrdered < MAX_ITEMS) {
         itemsOrdered[qtyOrdered] = disc; // Thêm DVD vào giỏ hàng
         qtyOrdered++; // Tăng số lượng DVD
         System.out.println("The disc " + disc.title +  " has been added");
     } else {
         System.out.println("The cart is almost full.");
     }
 }

 // Phương thức xóa DVD khỏi giỏ hàng
 public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
     for (int i = 0; i < qtyOrdered; i++) {
         if (itemsOrdered[i].title.equals(disc.title)) { // Kiểm tra DVD có trong giỏ hàng không
             for (int j = i; j < qtyOrdered - 1; j++) {
                 itemsOrdered[j] = itemsOrdered[j + 1]; // Di chuyển các DVD phía sau lên
             }
             itemsOrdered[qtyOrdered - 1] = null; // Đặt vị trí cuối cùng thành null
             qtyOrdered--; // Giảm số lượng DVD
             System.out.println("The disc has been removed.");
             return; // Kết thúc phương thức
         }
     }
     System.out.println("The disc is not found in the cart.");
 }

 // Phương thức tính tổng chi phí
 public float totalCost() {
     float total = 0; // Khởi tạo biến tổng
     for (int i = 0; i < qtyOrdered; i++) {
         total += itemsOrdered[i].cost; // Cộng dồn chi phí của từng DVD
     }
     return total; // Trả về tổng chi phí
 }
}
