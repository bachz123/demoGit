/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static util.MyToys.cF;

/**
 *
 * @author Admin
 */
public class MyToysTest {
    
    public MyToysTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test //Biến hàm bất kì đi kèm với junit thành pulic static void main
    public void testSuccessfulCases(){
        assertEquals(0, cF(0));
        assertEquals(2, cF(2));
        assertEquals(6, cF(3));
        assertEquals(24, cF(4));
        assertEquals(120, cF(5));        
        assertEquals(720, cF(6));
    }
    
//    nếu như có ngoại lệ thì sẽ như thế nào? 
//điều gì sẽ xảy ra nếu ta truyền vào bên trong nó 1 value để so sánh
//nó là cái gì đó bất thường xảy ra và mình sẽ không ước lượng được chính xác nó là cái gì hết
//khi đó ta không thể nào so sánh với cái khác được (không xài được assertEquals();
    @Test(expected = Exception.class)
    public void testExceptionCases(){
        cF(-5);
        cF(-6);
        
    }
//    ant chỉ quan tâm đến cú pháp, không thiếu thư viện là cứ chạy ra cái file đó
//    lỗi logic nó không check được
//    --> dạy cho ant biết cách code không sai cú pháp, không thiếu thư viện import và màu xanh của junit thì mới được phép build
//    ant không thông minh, chỉ biết làm theo những gì nó được chỉ để làm theo file build.xml
//    và file build_impl.xml 
//    giống như má mày. khi đi làm thì dặn mình 
//    là 4 giờ rửa nồi, vo gạo, nấu cơm canh nước cho thằng em ăn
//    và toàn bộ cái hành động này gọi là xml (kịch bản để compile and build
//    vậy bây giờ ta phải độ lại (@Override) cái xml để có thể dạy thằng ant
//    đối với netbeans 8 là dòng 1005
//    đối với netbeans 11 là dòng 1204   
}
