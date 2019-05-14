

class Account
{
     public abstract withdraw(double amount);
     public abstract deposit(double amount);
     
     void Save()
     {
          // Dependency Inversion is broken
          // Cannot apply overloading here as overloading don't go well with inheritnce
          // cyclomatic complexity
          // type check is there
          if(this instanceof SA)
             //save logic for SA
        
          if(this instanceof CA)
             //save logic for CA
             
     }
}

class SA extends Account
{
     public withdraw(double amount)
     {
        //logic
     }
     public deposit(double amount)
     {
        //logic
     }
}

class CA extends Account
{
     public withdraw(double amount)
     {
        //logic
     }
     public deposit(double amount)
     {
        //logic
     }
}
