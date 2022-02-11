public class Humain {

    public void fire(robot rob) {
        rob.getState();
        if(this.getState()=="alive") {
            if (rob.getState() == "alive") {
                rob.setHp(rob.getHp() - 2);
                System.out.println("le robot " + this.getName() + " a tiré sur  " + rob.getName() + " , 2 degats infligés");
            } else {
                System.out.println("le robot " + rob.getName() + " est deja mort , le tir n'est pas effectué");
            }
        }
        else {
            System.out.println("l'humain"+ this.getName() + " n'est même plus capable de se battre ");
        }
    }
    private  String name;
    private  int hp;
    private  String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public  String isDead() {
        if (hp <= 0)
        {
            setState("dead");
        }
        else {
            setState("alive");
        }
        return getState();
    }
    public Humain (String name, int hp) {
        this.setName(name);
        this.setHp(hp);

        System.out.println(" l'humain " + this.getName() + " entre dans l'arene avec " + this.getHp() + " points de vie !  state : "+this.isDead());
    }
}
