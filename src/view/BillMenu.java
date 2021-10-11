package view;

//import controller.BillManage;
import controller.UserManager;
import model.ElectricBill;
import model.User;

import java.util.Scanner;

public class BillMenu {
    UserManager userManager = new UserManager();
//    BillManage billManage = new BillManage();
    public static Scanner scanner = new Scanner(System.in);

    public void run() {
        int choice;
        do {
            menu();
            System.out.println("Nhập lựa chọn của bạn");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: {
                    showAll();
                    break;
                }
                case 2: {
                    addNewUser();
                    break;
                }
                case 3: {
                    removeUser();
                    break;
                }
                case 4: {
                    showTotalPrice();


                }
                case 0: {
                    System.exit(0);
                }
            }


        } while (choice != 0);
    }


    private void showTotalPrice() {
        System.out.println("Nhập codeElectric muốn tính tiền");
        String codeElectric = scanner.nextLine();
        userManager.showTotalPrice(codeElectric);
    }

    private void removeUser() {
        System.out.println("Nhập codeElectric muốn xóa");
        String codeElectric = scanner.nextLine();
        userManager.removeByCodeElectric(codeElectric);

    }

    private void addNewUser() {
        User user = inputUser();
        userManager.addNew(user);


    }

    private User inputUser() {
        System.out.println("Nhập tên chủ hộ");
        String fullName = scanner.nextLine();
        System.out.println("Nhập địa chỉ nhà");
        String address = scanner.nextLine();
        System.out.println("Nhập mã số công tơ điện");
        String code = scanner.nextLine();
        System.out.println("nhập số điện cũ");
        int oldE = scanner.nextInt();
        System.out.println("nhập số điện mới");
        int newE = scanner.nextInt();
        User user = new User(fullName, address, code, new ElectricBill(oldE, newE));
        return user;
    }

    private void showAll() {
        userManager.showAll();
    }

    private void menu() {
        System.out.println("Menu");
        System.out.println("1. Hiển thị thông tin người dùng");
        System.out.println("2. Thêm người dùng mới");
        System.out.println("3. Xóa người dùng");
        System.out.println("4. Tính tiền");
        System.out.println("0. Thoát");
    }

}
