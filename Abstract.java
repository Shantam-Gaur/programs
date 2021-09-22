abstract class AKTUniversity
{
          void btech()
          { 
                   System.out.println("btech by aktu");
          }
          abstract void manager();//declaration
}
          
class college extends AKTUniversity
{
	//Override
         void manager()//definition
         { 
                  System.out.println("AKTUniversity manager");
         }
         void diploma()
         {
                   System.out.println("self cource");
         }
         public static void main(String[]ar)
         {
                   college obj=new college();
                   obj.btech();
                   obj.manager();
                  
         }
}                