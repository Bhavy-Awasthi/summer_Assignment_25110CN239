import java.util.*;
class P108_marksheet_generation_system
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        //taking input
        System.out.println("Enter the name of student");
        String name=sc.next();
        System.out.println("Enter the roll no of student");
        int roll=sc.nextInt();
        System.out.println("Enter the marks of physics");
        int phy=sc.nextInt();
        System.out.println("Enter the marks of chemistry");
        int chem=sc.nextInt();
        System.out.println("Enter the marks of biology");
        int bio=sc.nextInt();
        System.out.println("Enter the marks of maths");
        int maths=sc.nextInt();
        System.out.println("Enter the marks of computer");
        int comp=sc.nextInt();
        int total=phy+chem+bio+maths+comp;
        float per=(float)total/5; //percentage
    // System.out.println("Total marks is "+total+" and percentage is "+per+"%");
        System.out.println("Name of student is "+name);
        System.out.println("Roll no of student is "+roll);
        System.out.println("Marks of physics is "+phy);
        System.out.println("Marks of chemistry is "+chem);
        System.out.println("Marks of biology is "+bio);
        System.out.println("Marks of maths is "+maths);
        System.out.println("Marks of computer is "+comp);

        System.out.println("Total marks is "+total+" and percentage is "+per+"%");
        sc.close();
}
}
