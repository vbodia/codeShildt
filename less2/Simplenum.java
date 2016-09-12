class Simplenum 
{   
    public static void main(String args[]) 
    {

    int numb;
    boolean simpl = true;

           for(numb = 2; numb <= 100; numb++) 
        {

                       // <<<<<<<<<<<<<<

          for(int j = 2; j < numb; j++) 
            {
                                                   //если деление по модулю — не ноль, то возможно, это простое число
                if(numb%j != 0) simpl = true;      //продолжить вложенный цикл     
            else 
                { 
                simpl = false; break; 
                }                                  //иначе это составное число
                                                   //выйти из вложенного цикла            
            }        
           if(simpl) 
            System.out.println(numb + " is prime number.");
        }
    }
}