// Slime.java
 
package study_gui;
 
import javax.swing.JOptionPane;
 
class Slime {
 
    String name;
    int hp = 80;
 
    // 생성자
    public Slime(String n) {
 
        name = n;
 
    }
 
    // 공격
    public void attack(Human h) {
    	if (hp>0) {
        System.out.println(name + "는 " + h.name + "를 공격했다!");
        h.hp = h.hp - 10;
 
        if (h.hp < 1) {
            JOptionPane.showMessageDialog(null, "당신은 어둠에 삼켜졌다.");
            System.exit(0);
        }
 
        System.out.println("현재 " + h.name + "의 체력은 " + h.hp + "이다.\n");
    	}
    }
 
}