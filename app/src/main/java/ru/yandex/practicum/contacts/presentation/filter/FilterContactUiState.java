package ru.yandex.practicum.contacts.presentation.filter;

import java.util.Collections;
import java.util.Set;

import ru.yandex.practicum.contacts.model.ContactType;

class FilterContactUiState {
    private boolean isApplyEnable = false;
    private Set<ContactType> newSelectedContactTypes = Collections.emptySet();

    public boolean getIsApplyEnable(){
        return isApplyEnable;
    }

    public void setIsApplyEnable(boolean flag){
        isApplyEnable = flag;
    }

    public Set<ContactType> getNewSelectedContactTypes(){
        return newSelectedContactTypes;
    }

    public void setNewSelectedContactTypes(Set<ContactType> value){
        newSelectedContactTypes = value;
    }
}
