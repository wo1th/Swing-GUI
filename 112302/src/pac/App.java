package pac;

public class App {
	public static void main(String[] args) throws InterruptedException {
		int arr[][]={
				{23,100},
				{230,10},
				{555,333},
				{752,444}
		};
		while (true) {
			Thread.sleep(1000);
			System.out.println("时间已经过去1秒");
			int rdm=(int)(Math.random()*100%4);
			System.out.println(arr[rdm][0]+","+arr[rdm][1]);
		}
		
	}

}
