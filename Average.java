class Average{
public static void main(String args[ ]){
	int a[]={10,20,30,40,50};
	float sum=0,avg;
	for(int i=0;i<a.length;i++)
		sum+=a[i];
	avg =sum/a.length;
	System.out.println("Average of 10, 20, 30, 40, 50 : "+avg);
}
}