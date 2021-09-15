package moduls;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class QuocGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idQuocGia;
    String nameQuocGia;

    public QuocGia() {
    }

    public QuocGia(int idQuocGia, String nameQuocGia) {
        this.idQuocGia = idQuocGia;
        this.nameQuocGia = nameQuocGia;
    }

    public int getIdQuocGia() {
        return idQuocGia;
    }

    public void setIdQuocGia(int idQuocGia) {
        this.idQuocGia = idQuocGia;
    }

    public String getNameQuocGia() {
        return nameQuocGia;
    }

    public void setNameQuocGia(String nameQuocGia) {
        this.nameQuocGia = nameQuocGia;
    }
}
