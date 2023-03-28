package studikasuspakson;

public class Officeboy extends Employee {
    int nip = 343;
    String name="Miguel";
    String status="belum menikah";
    String jobdesk="Officeboy";
    int timehours=7;
    double bonus;
    double potongan;
    
    void cetak(){
        System.out.println("NIP= "+nip);
        System.out.println("Nama= "+name);
        System.out.println("Status= "+status);
        System.out.println("Jobdesk= "+jobdesk);
        System.out.println("Time Hours= "+timehours);
        System.out.println("Gaji Awal= "+salary);
        run();
        oke();
        System.out.println("Bonus= "+bonus);
        System.out.println("Potongan= "+potongan);
        System.out.println("Total Gaji= "+salary);
    }
    
     void run(){
        if (status.equalsIgnoreCase("belum menikah")){
            bonus+=1000000;
    } else {
            bonus+=0;
        }
    
        if (timehours<8) {
            int a = 8 - timehours;
            a *= 50000;
            potongan += a;
        } else {
            potongan += 0;
        }
    }
    
    void oke(){
        salary+=bonus;
        salary-=potongan;
    }
}
