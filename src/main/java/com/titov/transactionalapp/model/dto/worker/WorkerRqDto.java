package com.titov.transactionalapp.model.dto.worker;

import com.titov.transactionalapp.enums.Gender;
import com.titov.transactionalapp.validation.PersonAge;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Size;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 04.07.2023, 0:46
 **/
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Validated
public class WorkerRqDto {

    @PersonAge
    private Integer age;
    private Gender gender;

    @NonNull
    @Size(min = 1)
    private String name;
}
