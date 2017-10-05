package org.modules.customer.domain;

import org.modules.base.domain.Auditable;

import java.time.LocalDate;

/**
 * Created by aleksandra on 05.10.17.
 */
public class Customer extends Auditable {

    private String name;

    private boolean isOver18;

    public boolean isOver18(){
        return isOver18;
    }

    public boolean validate(){
        if(name != null)
            return true;
        else
            return false;
    }

    public boolean validateIsAdult(Integer birthYear){
        Integer currentYear = LocalDate.now().getYear();
        if(currentYear - birthYear >= 0)
            return this.isOver18 = true;
        else
            return this.isOver18 = false;
    }
}
