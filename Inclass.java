public class inclass {

	public static void main(String[] args) {
		int min = -100;
		int max = 100;
		int mincheck = -50;
		int maxcheck = 50;
		int total = 0;
		
		
		int[] temprange = new int[14];
		
		
		for (int i =0; i<temprange.length; i++ ) {
			temprange[i] = (int)(Math.random() * (max - min)+min);
		}
		for(int i=0; i<temprange.length; i++) {
			if(temprange[i]>=0 && temprange[i]<maxcheck) {
				total+=temprange[i];
				
			}
			else if(temprange[i]<0 && temprange[i]>mincheck){
				total-=temprange[i]*-1;
				
			}
			else {total+=0;}
			
				
			}
		double average = total/14;
		System.out.printf("The average temperature is %.2f degrees ",average);
		
		}
}

		
