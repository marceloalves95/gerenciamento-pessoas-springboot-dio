package br.com.gerenciamentopessoasspringbootdio.service;

import br.com.gerenciamentopessoasspringbootdio.dto.response.MessageResponseDTO;
import br.com.gerenciamentopessoasspringbootdio.dto.request.PersonDTO;
import br.com.gerenciamentopessoasspringbootdio.entity.Person;
import br.com.gerenciamentopessoasspringbootdio.exception.PersonNotFoundException;
import br.com.gerenciamentopessoasspringbootdio.mapper.PersonMapper;
import br.com.gerenciamentopessoasspringbootdio.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author RubioAlves
 * Created 18/08/2021 at 15:36
 */
@Service
public class PersonService {

    private final PersonRepository personRepository;
    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO){

        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }


    public List<PersonDTO> listAll() {
        List<Person> allPeople = personRepository.findAll();
        return allPeople.stream().map(personMapper::toDTO).collect(Collectors.toList());
    }

    public PersonDTO findById(Long id) throws PersonNotFoundException {
        Person person = verifyIfExists(id);
       return personMapper.toDTO(person);
    }

    private Person verifyIfExists(Long id) throws PersonNotFoundException {
        return personRepository.findById(id).orElseThrow(() -> new PersonNotFoundException(id));
    }

    public void delete(Long id) throws PersonNotFoundException{
        verifyIfExists(id);
        personRepository.deleteById(id);
    }
}
