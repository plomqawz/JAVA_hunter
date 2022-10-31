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
        // System.out.println(name + "는 " + h.name + "를 공격했다!");
        h.hp = h.hp - 10;
 
        if (h.hp < 1) {
            JOptionPane.showMessageDialog(null, "당신은 어둠에 삼켜졌다.");
            System.exit(0);
        }
 
        // System.out.println("현재 " + h.name + "의 체력은 " + h.hp + "이다.\n");
        Study01.lbl2.setText(name+"의 공격! " + h.name + "의 체력은 " + h.hp + "이다.");
    	}
      }
    
    // 치료 void
    public void heal(Slime s) {
    	
    	}
	}

class Bum extends Slime { // 부모클래스(몬스터) 상속받은 자식클래스(범)
	
	// 생성자
	Bum(String n){
		super(n);
	}
	
	// 약한 공격
	@Override
	public void attack(Human h) {
		
		if (hp>0) {
			h.hp = h.hp - 8;
			
			if(h.hp<1) {
				JOptionPane.showMessageDialog(null, "당신은 어둠에 삼켜졌다...");
				System.exit(0);
			}
			
			Study01.lbl2.setText(name + "의 공격! " + h.name + "의 체력은" + h.hp + "이다.");
		}
		
	}
	
	// 치료
	@Override
	public void heal(Slime s) {
		
		if (hp>0 && s.hp>0) {
			
			s.hp += 10;
			
			if (s.hp>80) {
				s.hp = 80;
			}
			
			Study01.lbl2.setText(name + "는" + s.name + "를 치료! 그의 체력은" + s.hp + "이다.");
		}
	}
}