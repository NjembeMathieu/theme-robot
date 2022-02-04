public class arena{

    private String winner;


    public String fight(robot robot1, robot robot2){
        do{
            robot1.fire(robot2);
            System.out.println(robot1.getName()+" passe à " +robot2.getHp()+" hp");
            if(robot2.getHp()==0){
                setWinner(robot1.getName());
                System.out.println("le vainqueur est "+getWinner());
                break;
            }
            robot2.fire(robot1);
            System.out.println(robot2.getName()+" passe à " +robot1.getHp()+" hp");
            if(robot1.getHp()==0){
                setWinner(robot2.getName());
                System.out.println("le vainqueyr est "+getWinner());
                break;
            }
        }
        while(robot1.getHp()!=0||robot2.getHp()!=0);
        return winner;

    }


    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
}
