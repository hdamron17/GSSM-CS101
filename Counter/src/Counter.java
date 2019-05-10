/**
   This class models a tally counter.
*/
public class Counter
{
   private int value;
   
   public Counter()
   {
	   value = 0;
   }

   /**
      Gets the current value of this counter.
      @return the current value
   */
   public int getValue()
   {
      return value;
   }

   /**
      Advances the value of this counter by 1.
   */
   public void click() 
   {
      value = value + 1;
   }

   /**
      Resets the value of this counter to 0.
   */
   public void reset()
   {
      value = 0;
   }
   
   /**
   	  Undoes last click.
    */
   public void undo()
   {
//	   if(value > 0) 
//	   {
		   value--;
		   value = Math.max(value, 0);
//	   }
   }
}