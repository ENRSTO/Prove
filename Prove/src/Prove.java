import java.util.Scanner;

//commento STOCK
//commmento 
// commento del develop




// modifica 1
public class Prove {
	
	static int[] minMax(int[] elenco){       

	      int Max,min;
	      Max = elenco[0];
	      min = elenco[0];
	      
	      int [] minMaxV= new int[2];
	 	  for (int i=1; i< elenco.length; i++) {
	           if (Max <= elenco[i]) {
	               Max = elenco[i];    // 15 
	               //minMaxV[0] = min;		               
	           }
	           if (min > elenco[i]){
	              min = elenco[i];  //245
	              //minMaxV[1] = Max;
	           }

	 	  } 		     
	      minMaxV[0]=Max;
	      minMaxV[1]=min;
          return minMaxV;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {15,245,57,26,84,381,6,98} ;
		int[] b = new int[] {4567, 9123, 4552, 8776, 4231, 2345, 8411, 9412, 6541, 16171, 9412} ;
		int[] c = new int[] {538, 701, 625, 413, 887, 964, 172, 356, 249} ;
		//int [][] matrice = new int [][]; 

		int[] arrayP = new int[2];
		arrayP = minMax(c);
		
		
		
		
		System.out.print("il Max è :"+arrayP[0]+"\n");
		System.out.print("il min è:"+arrayP[1]);
		System.out.println("by ERNESTO");
		
		
		
	}

}
