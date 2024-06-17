package mypackage;

import java.time.Clock;
import java.time.LocalDate;

public class Baitap2bon {
    public static void main(String[] args) {

      LocalDate ngaySinh = LocalDate.of(1994,8,7);
      LocalDate homnay = LocalDate.now();

        System.out.println(ngaySinh);
        System.out.println(homnay);
        System.out.println(homnay.getYear() - ngaySinh.getYear());


    }
}
