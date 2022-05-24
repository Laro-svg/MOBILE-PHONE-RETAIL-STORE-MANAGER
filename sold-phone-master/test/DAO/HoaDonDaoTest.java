/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Model.HoaDon;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LLOST
 */
public class HoaDonDaoTest {
    
    public HoaDonDaoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of readDB method, of class HoaDonDao.
     */
    @Test
    public void testReadDB() {
        System.out.println("readDB");
        HoaDonDao instance = new HoaDonDao();
        ArrayList<HoaDon> expResult = null;
        ArrayList<HoaDon> result = instance.readDB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class HoaDonDao.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        HoaDon hd = null;
        HoaDonDao instance = new HoaDonDao();
        Boolean expResult = null;
        Boolean result = instance.add(hd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class HoaDonDao.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String mahd = "";
        HoaDonDao instance = new HoaDonDao();
        Boolean expResult = null;
        Boolean result = instance.delete(mahd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class HoaDonDao.
     */
    @Test
    public void testUpdate_HoaDon() {
        System.out.println("update");
        HoaDon hd = null;
        HoaDonDao instance = new HoaDonDao();
        Boolean expResult = null;
        Boolean result = instance.update(hd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateTongTien method, of class HoaDonDao.
     */
    @Test
    public void testUpdateTongTien() {
        System.out.println("updateTongTien");
        String _mahd = "";
        float _tongTien = 0.0F;
        HoaDonDao instance = new HoaDonDao();
        Boolean expResult = null;
        Boolean result = instance.updateTongTien(_mahd, _tongTien);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class HoaDonDao.
     */
    @Test
    public void testUpdate_7args() {
        System.out.println("update");
        String maHoaDon = "";
        String maNhanVien = "";
        String maKhachHang = "";
        String maKhuyenMai = "";
        LocalDate ngayLap = null;
        LocalTime gioLap = null;
        float tongTien = 0.0F;
        HoaDonDao instance = new HoaDonDao();
        Boolean expResult = null;
        Boolean result = instance.update(maHoaDon, maNhanVien, maKhachHang, maKhuyenMai, ngayLap, gioLap, tongTien);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class HoaDonDao.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        HoaDonDao instance = new HoaDonDao();
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
