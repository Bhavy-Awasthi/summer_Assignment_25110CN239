import java.util.*;
class menu_driven_array_operation_system
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int choice;
        do
        {
        System.out.println("Enter 1 for sum\nEnter 2 for average\nEnter 3 for maximum\nEnter 4 for minimum\nEnter 5 for sorting in ascending order\nEnter 6 for sorting in descending order\nEnter 7 for exit");
        System.out.println("Enter the choice");
     choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            
                System.out.println("The sum of the array is");
                int sum=0;
                for(int i=0;i<size;i++)
                {
                    sum=sum+arr[i];
                }
                System.out.println(sum);
                break;
            
            case 2:
            
                System.out.println("The average of the array is");
                 sum=0;
                for(int i=0;i<size;i++)
                {
                    sum=sum+arr[i];
                    }
                 System.out.println((float) sum/size);
                 break;
                
                 
             case 3:
             
                 System.out.println("The maximum element of the array is");
                 int max=arr[0];
                 for(int i=0;i<size;i++)
                 {
                     if(arr[i]>max)
                     {
                         max=arr[i];
                     }
                 }
                 System.out.println(max);
                 break;
             
             case 4:
             
                 System.out.println("The minimum element of the array is");
                 int min=arr[0];
                 for(int i=0;i<size;i++)
                  {
                      if(arr[i]<min)
                      {
                          min=arr[i];
                      }
                  }
                  System.out.println(min);
                  break;
             
                  
                  //sorting the array ascending order
                  case 5:
                      System.out.println("The sorted array is");
                      for(int i=0;i<size-1;i++)
                      {
                          for(int j=0;j<size-i-1;j++)
                          {
                              if(arr[j]>arr[j+1])
                              {
                                  int temp=arr[j];
                                  arr[j]=arr[j+1];
                                  arr[j+1]=temp;
                              }
                          }
                      }
                      for(int i=0;i<size;i++)
                      {
                         System.out.print(arr[i]+" ");
                      }
                      System.out.println();
                      break;
                      //sorting the array descending order
                      case 6:
                          System.out.println("The sorted array is");
                          for(int i=0;i<size-1;i++)
                          {
                              for(int j=0;j<size-i-1;j++)
                              {
                                  if(arr[j]<arr[j+1])
                                  {
                                      int temp=arr[j];
                                      arr[j]=arr[j+1];
                                      arr[j+1]=temp;
                                  }
                              }
                          }
                          for(int i=0;i<size;i++)
                          {
                              System.out.print(arr[i]+" ");
                          }
                          System.out.println();
                          break;
                          case 7:
                          System.out.println("Exit");
                          break;
                          default:
                          System.out.println("Invalid choice");
                          break;
        }
    }while(choice!=7);
    sc.close();
    }
                  
}