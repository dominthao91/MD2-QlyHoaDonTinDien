package controller;

import model.ElectricBill;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager implements IGeneralManage<User>{

    private List<User>userList =new ArrayList<>();

    @Override
    public void showAll() {
        for (User user:userList) {
            System.out.println(user);
        }
    }

    @Override
    public void addNew(User user) {
        userList.add(user);

    }

    @Override
    public void removeByCodeElectric(String codeElectric) {
        int index = searchByCodeElectric(codeElectric);
        if (index!=-1){
            userList.remove(index);
        }else {
            System.out.println("Không tìm thấy mã code này >>>.");
        }

    }
    @Override
    public int searchByCodeElectric(String CodeElectric) {
        int index = -1;
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getCodeElectric().equals(CodeElectric)){
                return i;
            }
        }
        return index;
    }



    public UserManager() {
    }

    public UserManager(List<User> userList) {
        this.userList = userList;

    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public double getTotalPrice(String codeElectric) {
        int index =searchByCodeElectric(codeElectric);
        double totalPrice = 0;
        if(userList.get(index).getCodeElectric().equals(codeElectric)){
           totalPrice= userList.get(index).getElectricBill().getPrice();
        }
        return totalPrice;
    }

    public void showTotalPrice(String codeElectric){
        System.out.println("Số tiền hộ gia đình phải trả là : "+getTotalPrice(codeElectric));
    }


}
