package com.example.okejon.platform11media;

public class VideoLucu {
    private String nama;
    private String durasi;
    private String videoRawId;

    //Array
    public static final VideoLucu[] lucu={
            new VideoLucu("Nyanyi nangis","4:20","sample1"),
            new VideoLucu("Seberapa pantas","4:20","sample2")
    };
    //setiap data punya nama,deskrisi,dan gambar
    public VideoLucu(String nama, String durasi, String videoRawId) {
        this.nama=nama;
        this.durasi=durasi;
        this.videoRawId=videoRawId;
    }
    public String getNama(){
        return nama;
    }
    public String getDurasi(){
        return durasi;
    }
    public String getVideoRawId(){
        return videoRawId;
    }

    public String toString(){
        return this.nama;
    }

}
