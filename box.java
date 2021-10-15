interface AKTUniversity
{
         void btech();
}
interface LPU
{
        void mtech();
        void main();
}
class box implements AKTUniversity,LPU
{
        public void btech()
        {
                    System.out.println("btech....");
        }
        public void mtech()       {
                    System.out.println("mtech....");
        }    

        public void mba()
        {
                    System.out.println("mba....");
        }
        public  void main()
         {
                System.out.print(";");
         }
        public static void main(String[]ar)
        {
                box obj=new box();
                    obj.btech();
                    obj.mtech();
                    obj.mba();
        }
} 