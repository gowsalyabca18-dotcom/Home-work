class Mobile
{
    Mobile()
    {
        System.out.println("Mobile activated.....");
    }
}

class Main
{
    public static void main(String [] args)
    {
      try{
        Class<?> cls=Class.forName("Mobile");
        Object obj=cls.getDeclaredConstructor().newInstance();
        System.out.println("Result:  "+obj);
      }  
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
}