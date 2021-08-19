package br.com.gerenciamentopessoasspringbootdio.mapper;

import br.com.gerenciamentopessoasspringbootdio.dto.request.PersonDTO;
import br.com.gerenciamentopessoasspringbootdio.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author RubioAlves
 * Created 18/08/2021 at 16:19
 */

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO personDTO);
    PersonDTO toDTO(Person person);
}
