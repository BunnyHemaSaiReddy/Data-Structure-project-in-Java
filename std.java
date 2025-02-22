import java.util.Scanner;
class read
{
    public int roll;
    public String name;
    public String place;
    read(int roll,String name,String place)
    {
          this.roll=roll;
          this.name=name;
          this.place=place;
    }
}
class std
{
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        int c=0,ch,searchroll,i=0,j,k,h=0,flag=0,t,roll_;
        String search,name_,place_,temp;
        int size=10000;
        read[] a= new read[size];
        while (c!=7)
        {
            System.out.println("\n\n\n**************\n1-insert \n2-search\n3-sort\n4-display\n5-delete\n6-edit(you cant replace rollno it is fixed)\n7-exit\n*************\nEnter your choice:");
            c=scan.nextInt();
            System.out.println("\n\n");
            if(c==1)
            {   while (true){
                System.out.print("enter roll no:");
                roll_=scan.nextInt();
                for(k=0;k<i;k++){
                    if(a[k].roll==roll_){
                        h=1;
                        System.out.println("This roll no is already exists");
                        break;
                    }
                }
                if(h==0){
                    break;
                }
                h=0;
            }
                System.out.print("enter name:");
                name_=scan.next();
                scan.nextLine();
                System.out.print("enter place:");
                place_=scan.next();
                scan.nextLine();
                a[i]=new read(roll_,name_,place_);
                i++;
            }
           else if(c==2)
           {
              System.out.println("########search#######\n1-name \n2-place\n3-rollno\n\nEnter your choice");
              ch=scan.nextInt();
              if(ch==1)
              {
                   System.out.println("enter the search name");
                   search=scan.next();
                   System.out.println("\n\nfinding  :  "+search);
                   for(j=0;j<i;j++)
                   {
                    if(search.equals(a[j].name))
                    {
                        System.out.println("\nDetails:\n name: "+a[j].name+"      place:"+a[j].place+"          roll: "+a[j].roll);
                        flag=1;
                    }
                   }
                   if(flag==0)
                   {
                    System.out.println("name not found");
                   }
                   flag=0;
              }
              else if(ch==2)
              {
                   System.out.println("enter the search place");
                   search=scan.next();
                   scan.nextLine();
                   System.out.println("finding  :  "+search);
                   for(j=0;j<i;j++){
                    if(search.equals(a[j].place))
                    {
                        System.out.println("Details:\n name:"+a[j].name+"      place"+a[j].place+"          roll"+a[j].roll);
                        flag=1;
                    }
                   }
                   if(flag==0)
                   {
                    System.out.println("place not found");
                   }
                   flag=0;
              }
              else if(ch==3)
              {
                   System.out.println("enter the search rollno");
                   searchroll=scan.nextInt();
                   scan.nextLine();
                   System.out.println("finding: "+searchroll);
                   for(j=0;j<i;j++)
                   {
                    if(a[j].roll==searchroll)
                    {
                        System.out.println("Details:\n Name"+a[j].name+"      place:"+a[j].place+"          rollno:"+a[j].roll);
                        flag=1;
                        break;
                    }
                   }
                   if(flag==0)
                   {
                    System.out.println("roll no not found");
                   }
                   flag=0;
              }
              else
              {
                System.out.println("invalid entry");
              }
            }
        else if(c==3)
        {
              System.out.println("######sort#########\n\n\n1-rollno \n2-name\n3-place\n###############\nEnter your choice");
              ch=scan.nextInt();
              if(ch==1)
              {
                   for(j=0;j<i;j++)
                   {
                    for(k=j+1;k<i;k++)
                    {
                        if(a[j].roll>a[k].roll)
                        {
                          t=a[j].roll;
                          a[j].roll=a[k].roll;
                          a[k].roll=t;
                          temp=a[j].name;
                          a[j].name=a[k].name;
                          a[k].name=temp;
                          temp=a[j].place;
                          a[j].place=a[k].place;
                          a[k].place=temp;
                        }
                    }
                   }
                }
                if (ch==2)
                {
                    for(j=0;j<i;j++)
                    {
                    for(k=j+1;k<i;k++)
                    {
                        if(a[k].name.compareTo(a[j].name)<0)
                        {
                          t=a[j].roll;
                          a[j].roll=a[k].roll;
                          a[k].roll=t;
                          temp=a[j].name;
                          a[j].name=a[k].name;
                          a[k].name=temp;
                          temp=a[j].place;
                          a[j].place=a[k].place;
                          a[k].place=temp;
                        }
                    }
                   }
                }
                  if (ch==3)
                  {
                    for(j=0;j<i;j++)
                    {
                    for(k=j+1;k<i;k++)
                    {
                        if(a[k].place.compareTo(a[j].place)<0)
                        {
                          t=a[j].roll;
                          a[j].roll=a[k].roll;
                          a[k].roll=t;
                          temp=a[j].name;
                          a[j].name=a[k].name;
                          a[k].name=temp;
                          temp=a[j].place;
                          a[j].place=a[k].place;
                          a[k].place=temp;
                        }
                    }
                   }
                }
        }
        else if(c==5)
        {
              System.out.println("########delete #######\n1-name \n2-place\n3-rollno\n\nEnter your choice");
              ch=scan.nextInt();
              if(ch==1)
              {
                   System.out.println("enter the delete name");
                   search=scan.next();
                   scan.nextLine();
                   System.out.println("\n\ndeleting :  "+search);
                   for(j=0;j<i;j++)
                   {
                    if(search.equals(a[j].name) && flag==0)
                    {
                        System.out.println("\nDetails:"+a[j].name+"      "+a[j].place+"          "+a[j].roll);
                        flag=1;
                    }
                    if(flag==1 && (j+1)<(i))
                    {
                          t=a[j].roll;
                          a[j].roll=a[j+1].roll;
                          a[j+1].roll=t;
                          temp=a[j+1].name;
                          a[j+1].name=a[j].name;
                          a[j].name=temp;
                          temp=a[j+1].place;
                          a[j+1].place=a[j].place;
                          a[j].place=temp;
                    }
                   }
                   if(flag==0)
                   {
                    System.out.println("name not found");
                   }
                   else
                   {
                    i--;
                   }
                   flag=0;
              }
              else if(ch==2)
              {
                   System.out.println("enter the delete place");
                   search=scan.next();
                   scan.nextLine();
                   System.out.println("finding  :  "+search);
                   for(j=0;j<i;j++)
                   {
                    if(search.equals(a[j].place) && flag==0)
                    {
                        System.out.println("Details:"+a[j].name+"      "+a[j].place+"          "+a[j].roll);
                        flag=1;
                    }
                   if(flag==1 && (j+1)<(i))
                   {
                          t=a[j].roll;
                          a[j].roll=a[j+1].roll;
                          a[j+1].roll=t;
                          temp=a[j+1].name;
                          a[j+1].name=a[j].name;
                          a[j].name=temp;
                          temp=a[j+1].place;
                          a[j+1].place=a[j].place;
                          a[j].place=temp;
                    }
                   }
                   if(flag==0)
                   {
                    System.out.println("place not found");
                   }
                   else
                   {
                    i--;
                   }
                   flag=0;
              }
              else if(ch==3)
              {
                   System.out.println("enter the delete rollno");
                   searchroll=scan.nextInt();
                   System.out.println("finding: "+searchroll);
                   for(j=0;j<i;j++)
                   {
                    if(a[j].roll==searchroll && flag==0)
                    {
                        System.out.println("Details:\n Name"+a[j].name+"      place:"+a[j].place+"          rollno:"+a[j].roll);
                        flag=1;
                    }
                          if(flag==1 && (j+1)<i )
                          {
                          t=a[j].roll;
                          a[j].roll=a[j+1].roll;
                          a[j+1].roll=t;
                          temp=a[j+1].name;
                          a[j+1].name=a[j].name;
                          a[j].name=temp;
                          temp=a[j+1].place;
                          a[j+1].place=a[j].place;
                          a[j].place=temp;
                    }
                   }
                   if(flag==0)
                   {
                    System.out.println("rollno not found");
                   }
                   else
                   {
                    i--;
                   }
                   flag=0;

              }
              else{
                System.out.println("invalid entry");
              }           
        }
        else if(c==4)
        {
            System.out.println("SNO\tROllno\tName\tplace\n_______________________________________");
            for(j=0;j<i;j++)
            {
            System.out.println((j+1)+"  \t"+a[j].roll+"   \t"+a[j].name+"\t"+a[j].place);
            }
        }
        else if(c==7)
        {
           System.out.println("exiting.....");
        }
        else if(c==6)
        {
             System.out.println("enter the  rollno to edit:");
                   searchroll=scan.nextInt();
                   System.out.println("finding: "+searchroll);
                   for(j=0;j<i;j++)
                   {
                    if(a[j].roll==searchroll && flag==0)
                    {
                        System.out.println("Details:\n Old Name"+a[j].name+"      Old place:"+a[j].place);
                        flag=1;
                    }
                    if(flag==1)
                    {
                       System.out.println("enter the new name:");
                        a[j].name=scan.next();
                        scan.nextLine();
                        System.out.println("enter the new place:");
                        a[j].place=scan.next();
                        scan.nextLine();
                        break;
                    }
                   }
                   if(flag==0)
                   {
                    System.out.println("roll no not found");
                   }
                   flag=0; 
        }
        else
        {
            System.out.println("invalid entry");
        }
        }
    }
}

           