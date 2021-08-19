package br.com.gerenciamentopessoasspringbootdio.dto.response;

import lombok.Builder;
import lombok.Data;

/**
 * @author RubioAlves
 * Created 18/08/2021 at 15:19
 */
@Data
@Builder
public class MessageResponseDTO {
    private String message;
}
