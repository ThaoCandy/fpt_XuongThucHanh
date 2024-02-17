/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.model;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class NhanVienService {

    public ArrayList<NhanVien> list = new ArrayList<>();

    public NhanVienService() {
    }

    public void fakeData() {
        list.add(new NhanVien("NV01", "Nguyễn Thu Thảo", 24, "thao@gmail.com", 1000));
        list.add(new NhanVien("NV02", "Nguyễn Thu Trang", 21, "trang@gmail.com", 1200));
        list.add(new NhanVien("NV03", "Nguyễn Thị Lan", 23, "lan@gmail.com", 2000));
        list.add(new NhanVien("NV04", "Phạm Minh Đức", 26, "duc@gmail.com", 1700));
        list.add(new NhanVien("NV05", "Chu Văn Đồng", 29, "dong@gmail.com", 2100));

    }

    public boolean UpdateNV(int id, NhanVien nv) {
        try {
            list.set(id, nv);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean AddNV(NhanVien nv) {
        try {
            list.add(nv);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean delete(int id) {
        try {
            list.remove(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public int findMaNV(String ma, ArrayList<NhanVien> A) {
        for (NhanVien nv : A) {
            if (nv.getMaNV().equals(ma)) {
                return A.indexOf(nv);
            }
        }
        return -1;
    }

    public int findNV(NhanVien nv) {
        if (list.contains(nv)) {
            return list.indexOf(nv);
        }
        return -1;
    }

    public boolean SaveFile(String path) throws IOException {
        FileOutputStream fis = null;
        ObjectOutputStream oos = null;
        try {
            fis = new FileOutputStream(path);
            oos = new ObjectOutputStream(fis);
            oos.writeObject(list);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            if (fis != null) {
                fis.close();
            }
            if (oos != null) {
                oos.close();
            }
        }
    }

    public boolean OpenFile(String path) throws IOException {
        if (!(new File(path)).isFile()) {
            return false;
        }
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(path);

            ois = new ObjectInputStream(fis);
            list.clear(); // hoặc list.removeAll(list); 
            list = (ArrayList<NhanVien>) ois.readObject();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            if (fis != null) {
                fis.close();
            }
            if (ois != null) {
                ois.close();
            }
        }
    }
}
