
public class main {
    public static void main(String[] args) {
        System.out.println("Creation des robots de base :");
        robot D2R2 = new robot("D2R2",10);//creation de deux robots
        robot Data = new robot("Data",10);
        arena arena = new arena();
        arena.fight(D2R2,Data);//on appelle le COMBAT , entre D2R2 et Data
    }

}
