package example;

public class Jiequ {
	private String s;
	private int[] z=new int[12];

	public Jiequ() { }
	
	public int[] conversionToInt(String a){ 
		for(int i=0;i<12;i++)
			z[i]=Integer.parseInt(a.substring(i*3, (i+1)*3));
		return z;
	}
	
	public void printfStr(String str) {
		z=conversionToInt(str);
		for(int i=0;i<12;i++)
			System.out.println("\t"+i*2+":00的温度为"+z[i]+"℃");
	}

}
