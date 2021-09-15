package service;

import moduls.QuocGia;

import java.util.ArrayList;

public interface IQuocGiaService {
    ArrayList<QuocGia> showAllQuocGia();
    QuocGia findById(int idQuocGia);
}
