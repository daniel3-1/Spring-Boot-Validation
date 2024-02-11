package com.app.advice.validation;

import com.app.advice.anotation.ValidName;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidNameValidator implements ConstraintValidator<ValidName, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        // Value cannot be null
        if(value == null){
            return false;
        }

        // Value cannot be empty
        if(value.isBlank()){
            return false;
        }

        // Value cannot be greater than 15
        if(value.length() > 15){
            return false;
        }

        // Value cannot be less than 3
        if(value.length() < 3){
            return false;
        }
        return true;
    }
}
