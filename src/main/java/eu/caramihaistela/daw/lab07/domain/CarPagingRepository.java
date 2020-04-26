package eu.caramihaistela.daw.lab07.domain;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface CarPagingRepository extends PagingAndSortingRepository<Car, Long> {

}
