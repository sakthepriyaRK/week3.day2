package week3.day2;

public class Automation extends MultipleLanguage  {

	public void Java() {
		System.out.println("Language is Java");
		
	}

	public void Selenium() {
		System.out.println("TestTool is Selenium");
		
	}

	@Override
	public void ruby() {
		System.out.println("language is Ruby");
		
	}
public static void main(String[] args) {
	Automation auto=new Automation();
	auto.Java();
	auto.Selenium();
	auto.ruby();
	auto.python();
}
}
