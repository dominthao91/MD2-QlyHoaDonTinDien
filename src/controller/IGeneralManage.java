package controller;

public interface IGeneralManage <T>{
    void showAll();
    void  addNew(T t);
    void removeByCodeElectric(String codeElectric);
    int searchByCodeElectric(String codeElectric);

}
