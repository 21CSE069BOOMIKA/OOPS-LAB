
package Class;


public class Class {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Author obj= new Author("AAA","AAA@gmail.com",'f');
        Author obj1= new Author("BBB","BBB@gmail.com",'f'); 
        System.out.println(obj.getname());
        System.out.println(obj.getEmail());
        System.out.println(obj.getGender()); 
        System.out.println(obj1.toString());
       
        
    }
    
}
class Author
{
    String name;
    String email;
    char gender;
    
    Author(String s,String e,char g1)
    {
        name=s;
        email=e;
        gender=g1;
    }
   
   String getname()
    {
        return name;
    }
    String getEmail()
    {
       return email;
    }
    char getGender()
    {
        return gender;
    }
    @Override
    public String toString()
    {
 
        return "Name->"+name+" " +"Email->"+email+" "+"Gender->"+gender;
}
    }
