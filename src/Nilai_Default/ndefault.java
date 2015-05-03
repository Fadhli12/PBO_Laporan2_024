package Nilai_Default;

public class ndefault {
	static boolean bool;
	static int i;
	static long l;
	static short sh;
	static String \u0073\u0074\u0072 = "Laporan 2 PBO, Muhammad fadhli 60200112024";
	
	public static void main(String[] args){
		if (str == null) 
		{		
			System.out.println("nilai default boolean " + bool);	
			System.out.println("nilai default int " + i);
			System.out.println("nilai default long " + l);
			System.out.println("nilai default short " + sh);
			System.out.println(str);
			
		}
		else {
			Boolean refBool = new Boolean(true); 
			boolean bool = refBool.booleanValue();		
			System.out.println("bool " + bool);
			
			Integer refInt = new Integer(24000);
			int i = refInt.intValue();		
			System.out.println("int " + i);
			
			Long refL = new Long(602001120);
			long l = refL.longValue();		
			System.out.println("long " + l);
			
			Short refSh = new Short((short) 'Z');
			short s = refSh.shortValue();	/*diterjemahkan menajdi kode ASCII*/
			System.out.println("short " + s);
			
			System.out.println(str);
			
		}		
	}
}

