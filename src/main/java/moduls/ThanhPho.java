package moduls;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class ThanhPho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idThanhPho;

    @NotEmpty(message = "not null")
    String name;
    int dienTich;
    int danSo;
    int gdp;
    String gioiThieu;

    @ManyToOne
    private QuocGia quocGia;

    public ThanhPho() {
    }

    public ThanhPho(int idThanhPho, String name, int dienTich, int danSo, int gdp, String gioiThieu, QuocGia quocGia) {
        this.idThanhPho = idThanhPho;
        this.name = name;
        this.dienTich = dienTich;
        this.danSo = danSo;
        this.gdp = gdp;
        this.gioiThieu = gioiThieu;
        this.quocGia = quocGia;
    }

    public int getIdThanhPho() {
        return idThanhPho;
    }

    public void setIdThanhPho(int idThanhPho) {
        this.idThanhPho = idThanhPho;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public int getDanSo() {
        return danSo;
    }

    public void setDanSo(int danSo) {
        this.danSo = danSo;
    }

    public int getGdp() {
        return gdp;
    }

    public void setGdp(int gdp) {
        this.gdp = gdp;
    }

    public String getGioiThieu() {
        return gioiThieu;
    }

    public void setGioiThieu(String gioiThieu) {
        this.gioiThieu = gioiThieu;
    }

    public QuocGia getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(QuocGia quocGia) {
        this.quocGia = quocGia;
    }
}
