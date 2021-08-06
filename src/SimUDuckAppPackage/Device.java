package SimUDuckAppPackage;

public class Device  {
	//composition
	QuackBehavior quackBehavior = new duckCallSound() ;
	
	void setQuackBehavior (QuackBehavior cbb) {
		quackBehavior =cbb;
	}
	void performDeviceCalling () {
		quackBehavior.quack();
	}

}
