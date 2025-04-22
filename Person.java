public class Person
{
private int id;
private String name;
public Person()
 {
 }

public Person(int i,String n)
 {
 id=i;
 name=n;
 }
public void displayInfo()
 {
System.out.println("Name is :"+name);
System.out.println("Id is :"+id);
 }
public static void main(String args[])
{
Person p1=new Person(101,"Md.Al-Imran Sayem");
p1.displayInfo();
}
}