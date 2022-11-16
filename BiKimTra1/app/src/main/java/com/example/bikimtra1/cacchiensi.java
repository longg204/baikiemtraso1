package com.example.bikimtra1;

public class cacchiensi {
    private String ten, capbac, noicongtac, quocgia, sosao;
    private int img;


    public cacchiensi(String ten, String capbac, String noicongtac, String quocgia, String sosao, int img) {
        this.ten = ten;
        this.capbac = capbac;
        this.noicongtac = noicongtac;
        this.quocgia = quocgia;
        this.sosao = sosao;
        this.img = img;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCapbac() {
        return capbac;
    }

    public void setCapbac(String capbac) {
        this.capbac = capbac;
    }

    public String getNoicongtac() {
        return noicongtac;
    }

    public void setNoicongtac(String noicongtac) {
        this.noicongtac = noicongtac;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public String getSosao() {
        return sosao;
    }

    public void setSosao(String sosao) {
        this.sosao = sosao;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}

