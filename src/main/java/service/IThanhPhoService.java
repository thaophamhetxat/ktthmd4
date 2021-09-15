package service;

import moduls.ThanhPho;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface IThanhPhoService {
    ThanhPho save(ThanhPho thanhPho);
    ThanhPho findById(int idThanhPho);
    ArrayList<ThanhPho> findAll();

    ArrayList<ThanhPho> findAllByName(String name);

    void delete(ThanhPho thanhPho);

    void edit(ThanhPho thanhPho);
}
