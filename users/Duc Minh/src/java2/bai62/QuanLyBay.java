/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2.bai62;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Minh
 */
public class QuanLyBay {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choose;
        List<VeMayBay> list = new ArrayList<>();

        do {
            showMenu();
            System.out.println("Choose: ");
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    input(list);
                    break;
                case 2:
                    save(list, "DuLieuBay.txt");
                    break;
                case 3:
                    list = show("DuLieuBay.txt");
                    break;
                case 4:
                    sort(list);
                    break;
                case 5:
                    saveByBrand(list);
                    break;
                case 6:
                    System.out.println("Thoat!");
                    break;
                default:
                    System.err.println("Nhap sai!");
                    break;
            }
        } while (choose != 6);
    }

    static void input(List<VeMayBay> list) {
        System.out.println("Nhap so ve may bay: ");
        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {
            VeMayBay veMayBay = new VeMayBay();
            veMayBay.input();

            list.add(veMayBay);
        }
    }

    static void save(List<VeMayBay> list, String fileName) {
        FileOutputStream out = null;
        ObjectOutputStream oos = null;

        try {
            out = new FileOutputStream(fileName);
            oos = new ObjectOutputStream(out);

            oos.writeObject(list);
        } catch (Exception e) {
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException ex) {
                    Logger.getLogger(QuanLyBay.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException ex) {
                    Logger.getLogger(QuanLyBay.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    static List<VeMayBay> show(String fileName) {
        List<VeMayBay> list = new ArrayList<>();

        FileInputStream in = null;
        ObjectInputStream ois = null;

        try {
            in = new FileInputStream(fileName);
            ois = new ObjectInputStream(in);

            list = (List<VeMayBay>) ois.readObject();
        } catch (Exception e) {
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    Logger.getLogger(QuanLyBay.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException ex) {
                    Logger.getLogger(QuanLyBay.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return list;
    }

    static void sort(List<VeMayBay> list) {
        Collections.sort(list, new Comparator<VeMayBay>() {
            @Override
            public int compare(VeMayBay o1, VeMayBay o2) {
                if (o1.getGiaVe() < o2.getGiaVe()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        for (int i = 0; i < list.size(); i++) {
            list.get(i).dishplay();
        }
    }

    static void saveByBrand(List<VeMayBay> list) {
        List<VeMayBay> vnAirLine = getHangBay(list, "VN");
        save(vnAirLine, "VietNamAirLine.txt");

        List<VeMayBay> vietJetAir = getHangBay(list, "VJ");
        save(vietJetAir, "VietJetAir.txt");

        List<VeMayBay> jetStarAir = getHangBay(list, "JET");
        save(jetStarAir, "JetStarAir.txt");
    }

    static List<VeMayBay> getHangBay(List<VeMayBay> list, String prex) {
        List<VeMayBay> mayBayList = new ArrayList<>();

        for (VeMayBay veMayBay : mayBayList) {
            if (veMayBay.getMaChuyenBay().startsWith(prex)) {
                mayBayList.add(veMayBay);
            }
        }

        return mayBayList;
    }

    static void showMenu() {
        System.out.println("1. Nhap thong tin N chuyen bay.");
        System.out.println("2. Luu thong tin vao file.");
        System.out.println("3. Doc va hien thi thong tin tu file.");
        System.out.println("4. Sap xep giam dan theo gia ve.");
        System.out.println("5. In thong tin moi hang ra file rieng.");
        System.out.println("6. Thoat.");
    }
}
