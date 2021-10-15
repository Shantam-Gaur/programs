abstract class college
{
          void btech()
          { 
                   System.out.println("btech by aktu");
          }
          abstract void manager();//declaration
}
          
class  AKTUniversity extends college
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
         public static void main(String[] args)
         {
                   AKTUniversity obj=new AKTUniversity();
                   obj.btech();
                   obj.manager();
                  
         }
}                