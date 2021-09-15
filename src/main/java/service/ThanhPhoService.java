package service;

import moduls.ThanhPho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repository.IThanhPhoRepo;

import java.util.ArrayList;

public class ThanhPhoService implements IThanhPhoService {
    @Autowired
    IThanhPhoRepo iThanhPhoRepo;

    @Override
    public ThanhPho save(ThanhPho thanhPho) {
        return iThanhPhoRepo.save(thanhPho);
    }

    @Override
    public ThanhPho findById(int idThanhPho) {
        return iThanhPhoRepo.findById(idThanhPho).get();
    }

    @Override
    public ArrayList<ThanhPho> findAll() {
        return (ArrayList<ThanhPho>) iThanhPhoRepo.findAll();
    }

    @Override
    public ArrayList<ThanhPho> findAllByName(String name) {
        return iThanhPhoRepo.findAllByName(name);
    }


    @Override
    public void delete(ThanhPho thanhPho) {
        iThanhPhoRepo.delete(thanhPho);
    }

    @Override
    public void edit(ThanhPho thanhPho) {
        iThanhPhoRepo.save(thanhPho);
    }
}
