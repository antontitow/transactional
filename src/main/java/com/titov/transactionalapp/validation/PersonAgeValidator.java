package com.titov.transactionalapp.validation;

import com.titov.transactionalapp.exception.PersonAgeException;
import lombok.SneakyThrows;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 04.07.2023, 1:06
 **/
public class PersonAgeValidator implements ConstraintValidator<PersonAge, Integer> {
    @SneakyThrows
    @Override
    public boolean isValid(Integer age, ConstraintValidatorContext constraintValidatorContext) {
        if (age == null || age > 0){
            return true;
        }else {
            throw new PersonAgeException();
        }
    }
}
