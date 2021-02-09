import java.util.Scanner;

class Date{
    private int day,month,year;
    public Date(int dd,int mm,int yy)
    {
        year=yy;
        month=mm;
        day=dd;
    }
    public int getYear()
    {
        return year;
    }
    public int getMonth()
    {
        return month;
    }
    public int getDay()
    {
        return day;
    }
    public void setYear(int yy)
    {
        year=yy;
    }
    public void setMonth(int mm)
    {
        month=mm;
    }
    public void setDay(int dd)
    {
        day=dd;
    }
    @Override
    public String toString()
    {
        return String.format("%02d/%02d/%04d", day,month,year);
    }
    public void setDate(int dd,int mm,int yy)
    {
        year=yy;
        month=mm;
        day=dd;
    }
    public boolean equalto(Date p)
    {
        return year==p.year && month==p.month && day==p.day;        
    }
    public boolean lessthan(Date p)
    {
        if(year<p.year)
            return true;
        else if(year>p.year)
            return false;
        else
        {
            if(month<p.month)
                return true;
            else if(month>p.month)
                return false;
            else
            {
                return day<=p.day;
            }
        }
    }
    public boolean greaterthan(Date p)
    {
        if(year>p.year)
            return true;
        else if(year<p.year)
            return false;
        else
        {
            if(month>p.month)
                return true;
            else if(month<p.month)
                return false;
            else
            {
                return day>=p.day;
            }
        }
    }
}



public class Testdate {
    public static int BinarySearch(Date d[],Date search,int beg,int end)
    {
        int mid=(beg+end)/2;
        if(d[mid].equalto(search))
            return mid;
        else if(search.lessthan(d[mid]))
            return BinarySearch(d,search,beg,mid-1);
        else if(search.greaterthan(d[mid]))
            return BinarySearch(d,search,mid+1,end);
        
            return -1;
    }
    public static Date[]sort(Date d[])
    {
        for(int i=0;i<d.length;i++)
        {
            for(int j=0;j<d.length;j++)
            {
                boolean a=d[j].greaterthan(d[i]);
                if(a==true)
                {
                    Date e;
                    e=d[i];
                    d[i]=d[j];
                    d[j]=e;
                }
            }
        }
        return d;
    }
    
    public static void main(String args[])
    {
        Date d1=new Date(13,04,2019);
        System.out.println(d1.toString());
        d1.setYear(1999);
        d1.setMonth(11);
        d1.setDay(29);
        System.out.println(d1.toString());
        System.out.println("Day is :"+d1.getDay());
        System.out.println("Day is :"+d1.getMonth());
        System.out.println("Day is :"+d1.getYear());        
        d1.setDate(31,01,2019);
        System.out.println(d1.toString());
        System.out.println("\n\n_________________________\n\n");
        Date[] c;
        c=new Date[5];
        
        System.out.println("enter 5 dates");
        Scanner input= new Scanner(System.in);
        for(int i=0;i<c.length;i++)
        {
            System.out.println("enter the days in dd/mm/yy format");
            int day=input.nextInt();
            int month=input.nextInt();
            int year=input.nextInt();
            c[i]=new Date(day,month,year);
        }
        c=sort(c);
        for (Date c1 : c) 
        {
            System.out.println(c1.toString());
        }
        Date z;
        System.out.println("enter the date to be searched");
        int day=input.nextInt();
        int month=input.nextInt();
        int year=input.nextInt();
        z= new Date(day,month,year);
        int p= BinarySearch(c,z,0,c.length);
        
        if(p==-1)
        {
            System.out.println("date not found");
        }
        else 
        {
            System.out.println("date found at index : "+p);
        }
    }
}
