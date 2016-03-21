package idol;
import java.util.ArrayList;
import java.util.Scanner;
public class MainIdol {
     static ArrayList<Idol>listIdol = new ArrayList<>();
     public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       Idol wong1 = new Idol();
       Idol wong2 = new Idol();
       Idol wong3 = new Idol();
       
         System.out.print("Nama : ");
         wong1.setNama(in.next());
         System.out.print("Team : ");
         wong1.setTeam(in.next());
         System.out.print("Umur : ");
         wong1.setUmur(in.nextInt());
         System.out.print("Penampilan : ");
         wong1.setPenampilan(in.nextInt());
         System.out.print("Suara : ");
         wong1.setSuara(in.nextInt());
         System.out.print("Attitude : ");
         wong1.setAttitude(in.nextInt());
         
         
         
         System.out.print("Nama : ");
         wong2.setNama(in.next());
         System.out.print("Team : ");
         wong2.setTeam(in.next());
         System.out.print("Umur : ");
         wong2.setUmur(in.nextInt());
         System.out.print("Penampilan : ");
         wong2.setPenampilan(in.nextInt());
         System.out.print("Suara : ");
         wong2.setSuara(in.nextInt());
         System.out.print("Attitude : ");
         wong2.setAttitude(in.nextInt());
         
         
         
         System.out.print("Nama : ");
         wong3.setNama(in.next());
         System.out.print("Team : ");
         wong3.setTeam(in.next());
         System.out.print("Umur : ");
         wong3.setUmur(in.nextInt());
         System.out.print("Penampilan : ");
         wong3.setPenampilan(in.nextInt());
         System.out.print("Suara : ");
         wong3.setSuara(in.nextInt());
         System.out.print("Attitude : ");
         wong3.setAttitude(in.nextInt());
        
         listIdol.add(wong1);
         listIdol.add(wong2);
         listIdol.add(wong3);

         display();
     } 
        public static void display() {
        System.out.println("------------Daftar Member------------");
        for (int i = 0; i < listIdol.size(); i++) {
 
             System.out.println("Nama : " + listIdol.get(i).getNama());
             System.out.println("Team : " + listIdol.get(i).getTeam());
             System.out.println("Umur : " + listIdol.get(i).getUmur());
             System.out.println("Total Nilai : " + listIdol.get(i).nilai());
             System.out.println("-------------------------------------------");
         }
     }

}