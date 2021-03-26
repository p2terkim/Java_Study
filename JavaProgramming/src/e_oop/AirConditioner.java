package e_oop;

public class AirConditioner {
	boolean power; //전원
	int temperature; //온도

	
	final int MIN_temperature = 16;
	final int MAX_temperature = 30;

	void changetemperature(int temperature){
		if(power){
			if(MIN_temperature <= temperature && temperature <= MAX_temperature){
				this.temperature = temperature;
			}
			System.out.println("온도 " + this.temperature);
		}
	}
	
	AirConditioner(){
		power = false;
		temperature = 20;
	}
	
	void power(){
		power = !power;
		System.out.println(power ? "켜짐" : "꺼짐");
	}
	
	void temperatureUp(){
		changetemperature(temperature + 1);
	}

	void temperatureDown(){
		changetemperature(temperature - 1);
	}
	
	
//	void showtemperature(){
//		System.out.print("온도. ");
//		for(int i =  + 1; i <= ; i++){
//			if(i <= ){
//				System.out.print("■");
//			}else{
//				System.out.print("□");
//			}
//		}
//		System.out.println();
//	}
	
	
	
	
	public static void main(String[] args) {
		AirConditioner airConditioner = new AirConditioner();
	
		while(true){
			System.out.println("-------------------------------");
			System.out.println("1.전원  2.온도업  3.온도다운  0.종료");
			System.out.println("-------------------------------");
			System.out.print("번호 입력>");
			int input = ScanUtil.nextInt();
			
			switch (input) {
			case 1: airConditioner.power(); break;
				
			case 2: airConditioner.temperatureUp(); break;
			case 3: airConditioner.temperatureDown(); break;
				
			default:
				System.out.println("종료되었습니다.");
				System.exit(0);
				break;
			}
		}
	}
	
}

