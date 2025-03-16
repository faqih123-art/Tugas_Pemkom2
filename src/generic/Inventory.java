/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

/**
 *
 * @author acer
 */
public class Inventory<T> {
    private T item; // Gunakan Generic T
    private String nama;
    private String kategori;

    public Inventory(T item, String nama, String kategori) {
        this.item = item;
        this.nama = nama;
        this.kategori = kategori;
    }

    public T getItem() {
        return item;
    }

    public String getNama() {
        return nama;
    }

    public String getKategori() {
        return kategori;
    }

    @Override
    public String toString() {
        return nama + " - " + kategori + " (" + item.toString() + ")";
    }
    
}
