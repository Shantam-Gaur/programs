class GLA
{
        GLA()
        {
                 System.out.println("Non parameter constructor");
        }
        GLA(int a)
        {
                 System.out.println("parameter constructor");
        }
        public static void main(String args[])
        {
                 GLA con1=new GLA(15);
                 GLA con2=new GLA();
        }
} 
         
                  