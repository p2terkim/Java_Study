package g_oop2;

public class Time {
	
	//private을 사용하여 Time클래스 밖에서는 접근 금지
	private int hour;
	private int minute;
	private int second;
	
	//get : 변수의 값을 얻기위한(읽기위한)메서드
	public int getHour() {
		return hour;
	}
	//set : 변수의 값을 저장하기위한 메서드
	public void setHour(int hour) {
		if (0 > hour) {
			System.out.println("시간을 잘못입력하셨습니다");
			return;			
		} else if(hour > 23){
			this.hour = hour % 24;
			this.minute = 0;
			this.second = 0;
			return;
		}
			this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (0 > minute) {
			System.out.println("분을 잘못입력하셨습니다");
			return;			
		} else if(minute > 59){
			this.minute = minute % 60;
			setHour(this.hour + minute / 60);
			return;
		}
			this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0) {
			System.out.println("초를 잘못입력하셨습니다");
			return;			
		} else if(59 < second){
			this.second = second % 60;
			setMinute(this.minute + second / 60);
			return;
		}
			this.second = second;
	}
	
	//getTime메서드
	String getTime(){
		return hour + ":" + minute + ":" + second;
	}
	
	//clock메서드
	void clock(){
		while(true){
			System.out.println(getTime());
			stop(1000); //1초 동안 멈추는 메서드를 만들어준다
			setSecond(second + 1);
		}
	}
	
	//외부에 노출 시킬 필요가 없다.
	private void stop(int interval){
		try {
			Thread.sleep(interval);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//예외 처리 안해줘서 오류발생(*추후에 배운다)
	}
	

}

















