package br.com.gerenciamentopessoasspringbootdio.dto.request;

import br.com.gerenciamentopessoasspringbootdio.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotEmpty;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Size;

/**
 * @author RubioAlves
 * Created 18/08/2021 at 15:51
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {

    private Long id;
    @Enumerated(EnumType.STRING)
    private PhoneType type;
    @NotEmpty
    @Size(min = 13, max = 14)

    private String number;
}
