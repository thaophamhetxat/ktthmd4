package service;

import moduls.QuocGia;
import org.springframework.beans.factory.annotation.Autowired;
import repository.IQuocGiaRepo;

import java.util.ArrayList;

public class QuocGiaService implements IQuocGiaService{
    @Autowired
    IQuocGiaRepo iQuocGiaRepo;


    @Override
    public ArrayList<QuocGia> showAllQuocGia() {
        return (ArrayList<QuocGia>) iQuocGiaRepo.findAll();
    }

    @Override
    public QuocGia findById(int idQuocGia) {
        return iQuocGiaRepo.findById(idQuocGia).get();
    }
}
