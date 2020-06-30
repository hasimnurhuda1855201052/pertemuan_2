package Pertemuan2;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author HASIM
 */
public class tugas{

    public static String[] makan = {"Tidak Memesan", "Soto Daging 10000", "Rawon       8000", "Mie Ayam    9000", "Bakso       5000"};
    public static int[] hargamakan = {0, 10000, 8000, 9000, 5000};
    public static String[] minum = {"Tidak Memesan", "Es Teh       2000", "Es Jeruk     3000", "Teh Hangat   2000", "Jeruk Hangat 3000"};
    public static int[] hargaminum = {0, 2000, 3000, 2000, 3000};
    public static int jumlah = 0;
    public static LinkedList<String> datamakan = new LinkedList<String>();
    public static LinkedList<Integer> hargadatamakan = new LinkedList<Integer>();
    public static LinkedList<String> dataminum = new LinkedList<String>();
    public static LinkedList<Integer> hargadataminum = new LinkedList<Integer>();

    public static void main(String[] args) {
        pilih();
        hasil();
    }

    public static void pilih() {
        pilihmakan();
        pilihminum();
        ulang();
    }

    public static void pilihmakan() {
        String makanan = (String) JOptionPane.showInputDialog(null, "Silahkan Memilih Makanan!!!", "Daftar Menu Makanan", JOptionPane.QUESTION_MESSAGE, null, makan, makan[0]);
        switch (makanan) {
            case "Soto Daging 10000":
                prosesmakan(makanan);
                break;
            case "Rawon       8000":
                prosesmakan(makanan);
                break;
            case "Mie Ayam    9000":
                prosesmakan(makanan);
                break;
            case "Bakso       5000":
                prosesmakan(makanan);
                break;
            default:
                break;
        }
    }

    public static void pilihminum() {
        String minuman = (String) JOptionPane.showInputDialog(null, "Silahkan Memilih Minuman!!!", "Daftar Menu Minuman", JOptionPane.QUESTION_MESSAGE, null, minum, minum[0]);
        switch (minuman) {
            case "Es Teh       2000":
                prosesminum(minuman);
                break;
            case "Es Jeruk     3000":
                prosesminum(minuman);
                break;
            case "Teh Hangat   2000":
                prosesminum(minuman);
                break;
            case "Jeruk Hangat 3000":
                prosesminum(minuman);
                break;
            default:
                break;
        }
    }

    public static void prosesmakan(String makanan) {
        jumlah = Integer.parseInt(JOptionPane.showInputDialog(null, makanan, "Masukkan jumlah ", JOptionPane.WARNING_MESSAGE));
        for (int i = 0; i < makan.length; i++) {
            if (makanan.equalsIgnoreCase(makan[i])) {
                jumlah = jumlah * hargamakan[i];
                datamakan.add(makan[i]);
                hargadatamakan.add(jumlah);
            }
        }
        JOptionPane.showMessageDialog(null, "Anda memesan : " + makanan + "\nTotal Pesanan    : " + jumlah);
    }

    public static void prosesminum(String minuman) {
        jumlah = Integer.parseInt(JOptionPane.showInputDialog(null, minuman, "Masukkan jumlah ", JOptionPane.WARNING_MESSAGE));
        for (int i = 0; i < minum.length; i++) {
            if (minuman.equalsIgnoreCase(minum[i])) {
                jumlah = jumlah * hargaminum[i];
                dataminum.add(minum[i]);
                hargadataminum.add(jumlah);
            }
        }
        JOptionPane.showMessageDialog(null, "Anda memesan : " + minuman + "\nTotal Pesanan    : " + jumlah);
    }

    public static void ulang() {
        int ulang = JOptionPane.showOptionDialog(null, "Apakah Anda Ingin Menambah", "PILIHAN", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (ulang == JOptionPane.YES_OPTION) {
            pilih();
        }
    }

    public static void hasil() {
        
        System.out.println("Daftar Pesanan Anda");
        System.out.println("===== Makanan =====");
        for (int i = 0; i < datamakan.size(); i++) {
            System.out.println(datamakan.get(i) + "\t" + hargadatamakan.get(i));
        }
        System.out.println("===== Minuman =====");
        for (int i = 0; i < dataminum.size(); i++) {
            System.out.println(dataminum.get(i) + "\t" + hargadataminum.get(i));
        }
    }
}

