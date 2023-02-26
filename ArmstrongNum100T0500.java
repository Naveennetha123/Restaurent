class  ArmstrongNum100T0500
{
	public static void main(String[] args) 
	{
		
		System.out.println("Display the Armstrong Numbers from 100 to 500");
       
		
		
		for(int num=100;num<=500;num++)
		{
			int powerCount=0;
		 int backUpOfNum=num;
		 while(num!=0)
		{
		   int rem=num%10;
		   powerCount++;
		   num=num/10;
		}
		num=backUpOfNum;
		int sum=0;
		while(num!=0)
		{
			int rem1=num%10;
			int product=1;
			
			for(int i=1; i<=powerCount; i++)
			{
				product=product*rem1;
			}
			sum=sum+product;
			num=num/10;
			
		 }

			num=backUpOfNum;
		   if(num==sum)
			{
				System.out.println("Armstrong numbers are : "+sum);
		   }
           
		}
		
    }
}