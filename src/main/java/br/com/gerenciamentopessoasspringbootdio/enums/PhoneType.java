package br.com.gerenciamentopessoasspringbootdio.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author RubioAlves
 * Created 18/08/2021 at 14:29
 */
@Getter
@AllArgsConstructor
public enum PhoneType {

    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");

    private final String description;

}
