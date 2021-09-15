package repository;

import moduls.ThanhPho;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;

public interface IThanhPhoRepo extends CrudRepository<ThanhPho, Integer> {
    @Query(value = "select c from ThanhPho c where c.name like concat('%',:name,'%')")
    ArrayList<ThanhPho> findAllByName(@Param("name") String name);
}
