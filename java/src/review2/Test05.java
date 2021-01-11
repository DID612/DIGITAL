package review2;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungTv t = new SamsungTv();
		t.turnOn();
		t.volDown();
		t.chDown();
		t.printInfo();
		t.chUp();
		t.volDown();
		t.printInfo();
	}

}

/* 인터페이스 
 * - 추상 메소드와 클래스 상수만 있는 것
 * - 추상 메소드 : 메소드가 선언만 되어 있는 메소드(구현 x)
 * - 클래스 상수 : static(클래스), final(상수)
 * 
 *  구현 클래스 : 인터페이스를 구현한 클래스
 *  - 인터페이스에 있는 추상 메소드를 반드시 오버라이딩 해야한다
 * */
interface RemoteController{
	void turnOn();
	void turnOff();
	void chUp();
	void chDown();
	void chChange(int ch);
	void volUp();
	void volDown();
}

class Samsung{
	private String logo = "Samsung";

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}		
}

class SamsungTv extends Samsung implements RemoteController{
	private boolean power=false;
	private int vol = 6;
	private int ch =1;
	private final int MAX_VOL = 10;
	private final int MAX_CH = 999;
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	@Override
	public void turnOn() {power = true;}
	@Override
	public void turnOff() {power = false;}
	@Override
	public void chUp() {
		if(power) {
			ch++;
		}
		if(ch > MAX_CH) {
			ch=1;
		}
	}
	@Override
	public void chDown() {
		if(power) {
			ch--;
		}
		if(ch < 1) {
			ch = MAX_CH;
		}	
	}
	@Override
	public void chChange(int ch) {
		if(power) {
			this.ch = ch;
		}
		if(ch>MAX_CH) {
			this.ch = MAX_CH;
		}
		if(ch < 1) {
			this.ch = 1;
		}
	}
	@Override
	public void volUp() {
		if(power) {
			vol++;
		}
		if(vol > MAX_VOL) {
			vol = MAX_VOL;
		}
	}
	@Override
	public void volDown() {
		if(power) {
			vol --;
		}
		if(vol < 0) {
			vol = 0;
		}
	}
	
	public void printInfo() {
		if(power) {
			System.out.println("------------------");
			System.out.println("채널 : " + ch);
			System.out.print("볼륨 :");
			for(int i=0;i<vol;i++) {
				System.out.print('■');
			}
			for(int i=0;i<MAX_VOL-vol;i++) {
				System.out.print('□');
			}
			System.out.println();
			System.out.println("------------------");
		}
	}
	//내부에서 사용하기 위해 만든 상수는 굳이 setter getter 하지말자
}