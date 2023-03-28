package studikasuspakson;

public class Main {
    public static void main(String[] args) {
        Boss bos = new Boss();
        Manager mager = new Manager();
        Officeboy office = new Officeboy();
        OJT onJob = new OJT();
        
        System.out.println("-~~ ~~-");
        bos.cetak();
        System.out.println("\n\n -~~ ~~-");
        mager.cetak();
        System.out.println("\n\n -~~ ~~-");
        office.cetak();
        System.out.println("\n\n -~~ ~~-");
        onJob.cetak();
    }
}
