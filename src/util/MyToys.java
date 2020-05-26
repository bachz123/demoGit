/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Admin
 */
public class MyToys {
    public static long cF(int number){
        if(number < 0 || number > 15){
            throw new IllegalArgumentException("n must be between 1 and 15");
        }
        int sum = 0;
        for(int i = 1; i <= number; i++){
            sum = sum*i;
        }
        return sum;
    }
}
//thế thì việc làm = tay Clean and Build kết hợp với Ant để chạy thành màu xanh
//--> ra file jar
//còn đỏ thì chửi và xóa cmnl
//có cách tự động vi diệu 
//ta đi thuê thằng lập trình viên về làm cho tao
//tao không cần nó compile gì hết
//m push lên nhánh đi
//có "ai đó" sẽ theo dõi git
//nếu có thay đổi do 1 người nào đó push lên thì
//"ai đó" sẽ kéo code về máy
//nó cũng sẽ gọi thằng ant lên và chạy thằng ant, nếu thấy màu đỏ thì chửi chết
//mẹ thằng chó này
//và nó copy nguyên cái message màu đỏ đó gửi cho thằng lùi kia
//thằng "ai đó" luôn liên tục lắng nghe, liên tục tích hợp và kiểm tra code
//Continuous Integration 
//"ai đó" chính là app jenkins, teamCity(CIAt, CIServer,...) 
//


//cấu hình cho jenkins chơi được với git để lấy code 
//và cấu hình thằng ant để biên dịch và đóng gói
//cấu hình jdk để nó chạy các lệnh (javac và.....)
//cấu hình email google để gửi mail chửi đồng nghiệp (tránh email bảo mật cao)
//tạo job, lịch trình build (đóng gói app) (create jenkins item)
//