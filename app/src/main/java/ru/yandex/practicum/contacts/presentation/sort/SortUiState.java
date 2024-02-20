package ru.yandex.practicum.contacts.presentation.sort;

// класс UiState должен иметь package-private доступ
class SortUiState {

    // сделайте поля isApplyEnable и newSelectedSortType приватными
    private boolean isApplyEnable = false;
    private String newSelectedSortType = null;

    // реализуйте get и set методы для обоих полей

    public void setApplyEnable(boolean flag){
        isApplyEnable = flag;
    }

    public boolean getApplyEnable(){
        return isApplyEnable;
    }

    public void setNewSelectedSortType(String value){
        newSelectedSortType = value;
    }

    public String getNewSelectedSortType(){
        return newSelectedSortType;
    }
}
