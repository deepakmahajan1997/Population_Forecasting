import java.io.*;
class xyz
{
	public static void main(String[] args)throws IOException 
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the value of n"); 
		
		
		int n=Integer.parseInt(in.readLine());
		int a[]=new int[n];
		int b[]=new int[n];
		double c[]=new double[n];
		double d[]=new double[n];
		c[0]=0;
		d[0]=0;
		System.out.println("enter the years and its respective population in the array");
		int i;
		double n1,k,j=1,r,p;
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(in.readLine());
			b[i]=Integer.parseInt(in.readLine());
	}
	for(i=0;i<n-1;i++)
	{
	c[i+1]=b[i+1]-b[i];
	
	}
	for(i=0;i<n-1;i++)
	{
	d[i+1]=(c[i+1]*100)/b[i];
	}
	for(i=0;i<n;i++)
		{
		if (i==0)
		{
		System.out.print(a[i]+"-");
		System.out.println(b[i]+"-");
		}
		else
		{
		System.out.println(a[i]+"-"+b[i]+"-"+c[i]+"-"+d[i]);
	}
	}
	System.out.println("enter the value of year in which population is to be found");
		double y=Double.parseDouble(in.readLine());
	for(i=1;i<n;i++)
	{
	j=j*d[i];
	}
	n1=((double)1)/((double)(n-1));
	k=Math.pow(j,n1);
	System.out.println(k);
	r=(y-a[n-1])/10;
	p=(b[n-1]*(Math.pow((1+(k/100)),r)));
	System.out.println(p);
}}
