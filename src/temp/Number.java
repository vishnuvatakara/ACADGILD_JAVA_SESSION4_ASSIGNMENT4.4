package temp;

import java.util.Scanner;

public class Number {
	private int num,sum,temp; // variable declaration
public void perfect(int num)
{
	this.num=num;
	temp=num;
	for(int i=1;i<=num/2;i++)
	{
		if(num%i==0)
			sum=sum+i;//performing summation of number

	}
	System.out.printf("aliquot sum of number is: "+sum);
	
	if(sum==temp) //checking perfect number  or not
		System.out.println("\nthe number is a perfect number");
	else
		System.out.println("\nthe number is not a perfect number");
}
public void find() {
	int sum;
	for(int i=1;i<=100;++i) //finding perfect numbers between 1 and 100
	{	sum=0;
		for(int j=1;j<i;++j)
		{
			if(i%j==0)
				sum=sum+j;
			
		}
		// checking number is perfect or not
		if(i==sum)
			System.out.println(i);
	}
}
public static void main(String args[])
{
	int num;
	Number obj=new Number();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");// reading number
	num=sc.nextInt();
	obj.perfect(num);
	System.out.println("perfect numbers between 1 and 100");
	obj.find();
}
}
