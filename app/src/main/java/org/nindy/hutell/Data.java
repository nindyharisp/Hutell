package org.nindy.hutell;

import java.io.Serializable;

public class Data implements Serializable {

    private String namaHotel;
    private String lokasiHotel;
    private String labelHotel;
    private String hargaHotel;
    private String alamatHotel;
    private int imageId;

    public Data(String namaHotel, String lokasiHotel
                , String alamatHotel ,String labelHotel, String  hargaHotel, int imageId) {
        this.namaHotel = namaHotel;
        this.lokasiHotel = lokasiHotel;
        this.alamatHotel = alamatHotel;
        this.labelHotel = labelHotel;
        this.hargaHotel = hargaHotel;
        this.imageId = imageId;
    }

    public String getNamaHotel() {
        return namaHotel;
    }

    public String getLokasiHotel() {
        return lokasiHotel;
    }

    public String getAlamatHotel() {
        return alamatHotel;
    }

    public String getLabelHotel() {
        return labelHotel;
    }

    public String getHargaHotel() {
        return hargaHotel;
    }


    public int getImageId() {
        return imageId;
    }
}
