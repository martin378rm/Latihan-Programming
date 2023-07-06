package data;

import java.lang.StringBuilder;
public class LatihanStringBuilder {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("hallo");
        System.out.println("data = " + builder);
        System.out.println("panjang = " + builder.length());
        System.out.println("kapasitas = "+ builder.capacity());

    }
}
