package br.com.gerenciamentopessoasspringbootdio.repository;

import br.com.gerenciamentopessoasspringbootdio.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author RubioAlves
 * Created 18/08/2021 at 15:04
 */
public interface PersonRepository extends JpaRepository<Person, Long> {


}
