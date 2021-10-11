//package controller;
//
//import model.ElectricBill;
//import model.User;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class BillManage implements IGeneralManage<User> {
//    private List<User> users = new ArrayList<>();
//
//    public void getTotalPrice(User user) {
//        int index = searchByCodeElectric(user.getCodeElectric());
//        if (index != -1) {
//            users.get(index).getElectricBill().getPrice();
//        }
//
//    }
//
//    public BillManage() {
//    }
//
//    public BillManage(List<User> userElectricBillList) {
//        this.users = userElectricBillList;
//    }
//
//    @Override
//    public void showAll() {
//        for (User els : users) {
//            System.out.println(els.toString());
//        }
//    }
//
//
//    @Override
//    public void addNew(User userElectricBill) {
//        users.add(userElectricBill);
//
//    }
//
//    @Override
//    public void removeByCodeElectric(String codeElectric) {
//
//
//    }
//
//    @Override
//    public int searchByCodeElectric(String codeElectric) {
//        int index = -1;
//        for (int i = 0; i < users.size(); i++) {
//            if (users.get(i).getElectricBill().equals(codeElectric)) {
//                return index = i;
//            }
//        }
//        return index;
//    }
//
//}
