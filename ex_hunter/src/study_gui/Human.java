// Human.java
 
package study_gui;
 
class Human {
 
    String name;
    int hp = 100;
 
    public Human(String n) {
        name = n;
    }
 
    public void attack(Slime s) {
 
        //System.out.println("사냥꾼은 " + s.name + "를 공격했다!");
        //Study01.lbl.setText("사냥꾼은 " + s.name + "를 공격했다!");
        
        s.hp = s.hp - 30;
        
        if(s.hp<1) {
        	//System.out.println(s.name+"는 사망했다...\n");
        	Study01.lbl.setText(s.name+"는 사망했다...");
        	Study01.lbl2.setText("");
        
        
        } else {
        //System.out.println("현재 " + s.name + "의 체력은 " + s.hp + "이다.\n");
        Study01.lbl.setText(name+"의 공격! "+s.name+"의 체력은 " + s.hp + "이다.");
        }
    }
}