public class Homework7 {
	public static void main(String[] args) {
		InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T720DW", 7500);
		LaserPrinter laser = new LaserPrinter("Cannon MFC643Cdw", 1500);
		while(inkjet.print());
		while(laser.print());
	}
}

class Printer {
	String model;
	int printedCount=0;
	int availableCount;
	Printer(String model, int availableCount){
		this.model = model;
		this.availableCount = availableCount;
	}
	public boolean print() {
		if(availableCount == 0) {
			System.out.println(this.model+": "+(this.printedCount+1)+"매째 인쇄 실패 - 잉크부족");
			return false;
		}
		else {
			this.availableCount--;
			this.printedCount++;
			return true;
		}
	}
}

class InkjetPrinter extends Printer {
	InkjetPrinter(String model, int availableCount){
		super(model, availableCount);
	}
	public boolean print() {
		if(super.availableCount == 0) {
			System.out.println(super.model+": "+(super.printedCount+1)+"매째 인쇄 실패 - 잉크부족.");
			return false;
		}
		else {
			super.availableCount--;
			super.printedCount++;
			return true;
		}
	}
}

class LaserPrinter extends Printer {
	LaserPrinter(String model, int availableCount){
		super(model, availableCount);
	}
	public boolean print() {
		if(super.availableCount == 0) {
			System.out.println(super.model+": "+(super.printedCount+1)+"매째 인쇄 실패 - 토너 부족.");
			return false;
		}
		else {
			super.availableCount--;
			super.printedCount++;
			return true;
		}
	}
}