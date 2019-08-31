class Date
{
	int d;
	int m;
	int y;
	public void getData(int dt,int mo,int yr)
	{
		if(dt<=31 && mo<=12 && yr<=2012)
		d=dt;
		m=mo;
		y=yr;
		
	}
	public void add(int dt1,int mo1,int yr1,int dt2,int mo2,int yr2)
	{
		d=dt1+dt2;
		m=mo1+mo1;
		if (m>12) 
		{
			m=(mo1+mo2)%12;
			y++;
		}
		m=m+mo1+mo1;
		
		y=y+yr1+yr2;

		if(d>31)
			{ 
				if(m==4||m==6||m==9||m==11)
				{
					d=d%30;
					m++;
				}
				elseif(m==2)
				{
					d=d%28;
					m++;
				}
				else
				{
					d=d%30;
					m++;
				}	

				
			}
		if (m>12) 
		{
			m=(mo1+mo2)%12;
			y++;
		}
		m=m+mo1+mo1;
		
		
		


		
	}
	public void show()
	{
		System.out.println("date is  "+d+"/"+m+"/"+y);
	}

	public static void main(String []args)
	{

		Date d=new Date();
		d.add(16,01,10,17,03,12);
		d.show();

		
	}


}