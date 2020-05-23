
public class nilai_terbesar {
public static void main(String[]args){
 int x = 7, y = 8, z = 91;
 int max;
 System.out.println("number 1 = "+x);
 System.out.println("number 2 = "+y);
 System.out.println("number 3 = "+z);
 
 //mencari nilai tertinggi dengan operator kondisi
 max=(y>=x)? y: x;
 max=(z>=max)? z: max;
 System.out.println("Nilai tertingginya adalah angka = "+max);
}
}