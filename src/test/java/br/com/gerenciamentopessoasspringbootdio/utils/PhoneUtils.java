package br.com.gerenciamentopessoasspringbootdio.utils;


import br.com.gerenciamentopessoasspringbootdio.dto.request.PhoneDTO;
import br.com.gerenciamentopessoasspringbootdio.entity.Phone;
import br.com.gerenciamentopessoasspringbootdio.enums.PhoneType;

/**
 * @author RubioAlves
 * Created 19/08/2021 at 09:05
 */
public class PhoneUtils {

    private static final String PHONE_NUMBER = "1199999-9999";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

}
