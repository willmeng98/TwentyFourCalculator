import java.util.*;
public class TwentyFour
{
  /******
  public  float add(float a,float b)
  {
    return a+b;
  }
  public  float subtract(float a, float b)
  {
    return a-b;
  }
  public  float multiply(float a,float b)
  {
    return a*b;
  }
  public  float divide(float a,float b)
  {
    return a/b;
  }
  public  float nobracket(int a,int b,int c, float[] in)
  {
    float resulta = 0;
    float resultb = 0;
    if(a == 1)
    {
      resulta = in[0] + in[1];
    }
    if(a == 2)
    {
      resulta = in[0] - in[1];
    }
    if(a == 3)
    {
      resulta = in[0] * in[1];
    }
    if(a == 4)
    {
      resulta = in[0] / in[1];
    }
    if(b == 1)
    {
      resultb = resulta + in[2];
    }
    if(b == 2)
    {
      resultb = resulta - in[2];
    }
    if(b == 3)
    {
      resultb = resulta * in[2];
    }
    if(b == 4)
    {
      resultb = resulta / in[2];
    }
    if(c == 1)
    {
      return resultb + in[3];
    }
    if(c == 2)
    {
      return resultb - in[3];
    }
    if(c == 3)
    {
      return resultb * in[3];
    }
    if(c == 4)
    {
      return resultb / in[3];
    }
    return 0;
  }
  public  float middlebracket(int a,int b,int c, float[] in)
  {
    float resulta = 0; 
    float resultb = 0; //result of middle two
    if(b == 1)
    {
      resultb = in[1] + in[2];
    }
    if(b == 2)
    {
      resultb = in[1] - in[2];
    }
    if(b == 3)
    {
      resultb = in[1] * in[2];
    }
    if(b == 4)
    {
      resultb = in[1] / in[2];
    }
    if(a == 1)
    {
      resulta = in[0] + resultb;
    }
    if(a == 2)
    {
      resulta = in[0] - resultb;
    }
    if(a == 3)
    {
      resulta = in[0] * resultb;
    }
    if(a == 4)
    {
      resulta = in[0] / resultb;
    }
    
    if(c == 1)
    {
      return resulta + in[3];
    }
    if(c == 2)
    {
      return resulta - in[3];
    }
    if(c == 3)
    {
      return resulta * in[3];
    }
    if(c == 4)
    {
      return resulta / in[3];
    }
    return 0;
  }
  public  float doublebracket(int a,int b,int c, float[] in)
  {
    float resulta = 0; //result of first two
    float resultb = 0; //result of second two
    if(a == 1)
    {
      resulta = in[0] + in[1];
    }
    if(a == 2)
    {
      resulta = in[0] - in[1];
    }
    if(a == 3)
    {
      resulta = in[0] * in[1];
    }
    if(a == 4)
    {
      resulta = in[0] / in[1];
    }
    if(c == 1)
    {
      resultb = in[2] + in[3];
    }
    if(c == 2)
    {
      resultb = in[2] - in[3];
    }
    if(c == 3)
    {
      resultb = in[2] * in[3];
    }
    if(c == 4)
    {
      resultb = in[2] / in[3];
    }
    if(b == 1)
    {
      return resulta + resultb;
    }
    if(b == 2)
    {
      return resulta - resultb;
    }
    if(b == 3)
    {
      return resulta * resultb;
    }
    if(b == 4)
    {
      return resulta / resultb;
    }
    
    return 0;
  }
  public  float onethreea(int a,int b,int c, float[] in) //_(_ _ _)
  {
    float resulta = 0; //result of first two in bracket
    float resultb = 0; //result of second two in bracket
    if(b == 1)
    {
      resulta = in[1] + in[2];
    }
    if(b == 2)
    {
      resulta = in[1] - in[2];
    }
    if(b == 3)
    {
      resulta = in[1] * in[2];
    }
    if(b == 4)
    {
      resulta = in[1] / in[2];
    }
    if(c == 1)
    {
      resultb = resulta + in[3];
    }
    if(c == 2)
    {
      resultb = resulta - in[3];
    }
    if(c == 3)
    {
      resultb = resulta * in[3];
    }
    if(c == 4)
    {
      resultb = resulta / in[3];
    }
    if(a == 1)
    {
      return in[0] + resultb;
    }
    if(a == 2)
    {
      return in[0] - resultb;
    }
    if(a == 3)
    {
      return in[0] * resultb;
    }
    if(a == 4)
    {
      return in[0] / resultb;
    }
    
    
    
    return 0;
  }
  public  float onethreeb(int a,int b,int c, float[] in) //_(_ (_ _))
  {
    float resulta = 0; //result of second two in big bracket
    float resultb = 0; //result of first and bracket in bracket
    if(c == 1)
    {
      resulta = in[2] + in[3];
    }
    if(c == 2)
    {
      resulta = in[2] - in[3];
    }
    if(c == 3)
    {
      resulta = in[2] * in[3];
    }
    if(c == 4)
    {
      resulta = in[2] / in[3];
    }
    if(b == 1)
    {
      resultb = in[1] + resulta;
    }
    if(b == 2)
    {
      resultb = in[1] - resulta;
    }
    if(b == 3)
    {
      resultb = in[1] * resulta;
    }
    if(b == 4)
    {
      resultb = in[1] / resulta;
    }
    if(a == 1)
    {
      return in[0] + resultb;
    }
    if(a == 2)
    {
      return in[0] - resultb;
    }
    if(a == 3)
    {
      return in[0] * resultb;
    }
    if(a == 4)
    {
      return in[0] / resultb;
    }
    
    
    
    return 0;
  }
  */
    private static int start = 1;
  public static void main(String[] args)
  {

    
    while(start == 1)
    {
    
    System.out.println("Please enter first number");
      Scanner userInput1 = new Scanner(System.in);
      int one = userInput1.nextInt();
      System.out.println("Please enter second number");
      Scanner userInput2 = new Scanner(System.in);
      int two = userInput2.nextInt();
      System.out.println("Please enter third number");
      Scanner userInput3 = new Scanner(System.in);
      int three = userInput3.nextInt();
      System.out.println("Please enter fourth number");
      Scanner userInput4 = new Scanner(System.in);
      int four = userInput4.nextInt();
      
      
      
      
      int first = one;
      int second = two;
      int third = three;
      int fourth = four;
      
      
      //float[] numbers = {first, second, third, fourth};
      
      float[][] numbers = 
      {{first, second, third, fourth},
        {first, second, fourth, third},
        {first, third, second, fourth},
        {first, third, fourth, second},
        {first, fourth, second, third},
        {first, fourth, third, second},
        {second, first, third, fourth},
        {second, first, fourth, third},
        {second, third, first, fourth},
        {second, third, fourth, first},
        {second, fourth, first, third},
        {second, fourth, third, first},
        {third, first, second, fourth},
        {third, first, fourth, second},
        {third, second, fourth, first},
        {third, second, first, fourth},
        {third, fourth, second, first},
        {third, fourth, first, second},
        {fourth, first, second, third},
        {fourth, first, third, second},
        {fourth, second, first, third},
        {fourth, second, third, first},
        {fourth, third, first, second},
        {fourth, third, second, first},
      };
      
      
      String astring = "blank";
      String bstring = "blank";
      String cstring = "blank";
      
      //no breackets
      
      float fin;
      for(int x = 0; x < 24; x++)
      {
      for(int a = 1; a <= 4; a++)
      {
        for(int b = 1; b <= 4; b++)
        {
          for(int c = 1; c <= 4; c++)
          {
            float resulta = 0;
    float resultb = 0;
                if(a == 1)
    {
      resulta = numbers[x][0] + numbers[x][1];
    }
    if(a == 2)
    {
      resulta = numbers[x][0] - numbers[x][1];
    }
    if(a == 3)
    {
      resulta = numbers[x][0] * numbers[x][1];
    }
    if(a == 4)
    {
      resulta = numbers[x][0] / numbers[x][1];
    }
    if(b == 1)
    {
      resultb = resulta + numbers[x][2];
    }
    if(b == 2)
    {
      resultb = resulta - numbers[x][2];
    }
    if(b == 3)
    {
      resultb = resulta * numbers[x][2];
    }
    if(b == 4)
    {
      resultb = resulta / numbers[x][2];
    }
    if(c == 1)
    {
      fin = resultb + numbers[x][3];
      if(fin == 24)
    {
        if(a == 1)
        {
          astring = "+";
        }
        
        if(a == 2)
        {
          astring = "-";
        }
        if(a == 3)
        {
          astring = "x";
        }
        if(a == 4)
        {
          astring = "/";
        }
        if(b == 1)
        {
          bstring = "+";
        }
        
        if(b == 2)
        {
          bstring = "-";
        }
        if(b == 3)
        {
          bstring = "x";
        }
        if(b == 4)
        {
          bstring = "/";
        }
        if(c == 1)
        {
          cstring = "+";
        }
        
        if(c == 2)
        {
          cstring = "-";
        }
        if(c == 3)
        {
          cstring = "x";
        }
        if(c == 4)
        {
          cstring = "/";
        }
        
      System.out.println (numbers[x][0] + " " +astring + " "+ numbers[x][1] + " " + bstring + " "+ numbers[x][2] +" " + cstring + " "+ numbers[x][3]);
    }
    }
    if(c == 2)
    {
      fin =  resultb - numbers[x][3];
      if(fin == 24)
    {
        if(a == 1)
        {
          astring = "+";
        }
        
        if(a == 2)
        {
          astring = "-";
        }
        if(a == 3)
        {
          astring = "x";
        }
        if(a == 4)
        {
          astring = "/";
        }
        if(b == 1)
        {
          bstring = "+";
        }
        
        if(b == 2)
        {
          bstring = "-";
        }
        if(b == 3)
        {
          bstring = "x";
        }
        if(b == 4)
        {
          bstring = "/";
        }
        if(c == 1)
        {
          cstring = "+";
        }
        
        if(c == 2)
        {
          cstring = "-";
        }
        if(c == 3)
        {
          cstring = "x";
        }
        if(c == 4)
        {
          cstring = "/";
        }
      System.out.println (numbers[x][0] + " " +astring + " " + numbers[x][1] + " " + bstring + " "+ numbers[x][2] +" " + cstring + " "+ numbers[x][3]);
    }
    }
    if(c == 3)
    {
      fin = resultb * numbers[x][3];
      if(fin == 24)
    {
        if(a == 1)
        {
          astring = "+";
        }
        
        if(a == 2)
        {
          astring = "-";
        }
        if(a == 3)
        {
          astring = "x";
        }
        if(a == 4)
        {
          astring = "/";
        }
        if(b == 1)
        {
          bstring = "+";
        }
        
        if(b == 2)
        {
          bstring = "-";
        }
        if(b == 3)
        {
          bstring = "x";
        }
        if(b == 4)
        {
          bstring = "/";
        }
        if(c == 1)
        {
          cstring = "+";
        }
        
        if(c == 2)
        {
          cstring = "-";
        }
        if(c == 3)
        {
          cstring = "x";
        }
        if(c == 4)
        {
          cstring = "/";
        }
      System.out.println (numbers[x][0] + " " + astring + " "+ numbers[x][1] + " " + bstring + " "+ numbers[x][2] +" " + cstring + " "+ numbers[x][3]);
    }
    }
    if(c == 4)
    {
      fin =  resultb / numbers[x][3];
      if(fin == 24)
    {
        if(a == 1)
        {
          astring = "+";
        }
        
        if(a == 2)
        {
          astring = "-";
        }
        if(a == 3)
        {
          astring = "x";
        }
        if(a == 4)
        {
          astring = "/";
        }
        if(b == 1)
        {
          bstring = "+";
        }
        
        if(b == 2)
        {
          bstring = "-";
        }
        if(b == 3)
        {
          bstring = "x";
        }
        if(b == 4)
        {
          bstring = "/";
        }
        if(c == 1)
        {
          cstring = "+";
        }
        
        if(c == 2)
        {
          cstring = "-";
        }
        if(c == 3)
        {
          cstring = "x";
        }
        if(c == 4)
        {
          cstring = "/";
        }
      System.out.println (numbers[x][0] + " " + astring + " "+ numbers[x][1] + " " + bstring + " "+ numbers[x][2] +" " + cstring + " "+ numbers[x][3]);
    }
    }
    
          
          }
          
        }
        
      }
      
      
      
      
      
      //====== middle _(_ _)_
      
      for(int a = 1; a <= 4; a++)
      {
        for(int b = 1; b <= 4; b++)
        {
          for(int c = 1; c <= 4; c++)
          {
            float resulta = 0;
            float resultb = 0;//result of middle
            if(b == 1)
    {
      resultb = numbers[x][1] + numbers[x][2];
    }
    if(b == 2)
    {
      resultb = numbers[x][1] - numbers[x][2];
    }
    if(b == 3)
    {
      resultb = numbers[x][1] * numbers[x][2];
    }
    if(b == 4)
    {
      resultb = numbers[x][1] / numbers[x][2];
    }
    if(a == 1)
    {
      resulta = numbers[x][0] + resultb;
    }
    if(a == 2)
    {
      resulta = numbers[x][0] - resultb;
    }
    if(a == 3)
    {
      resulta = numbers[x][0] * resultb;
    }
    if(a == 4)
    {
      resulta = numbers[x][0] / resultb;
    }
    
    if(c == 1)
    {
      fin = resulta + numbers[x][3];
      if(fin == 24)
    {
        if(a == 1)
        {
          astring = "+";
        }
        
        if(a == 2)
        {
          astring = "-";
        }
        if(a == 3)
        {
          astring = "x";
        }
        if(a == 4)
        {
          astring = "/";
        }
        if(b == 1)
        {
          bstring = "+";
        }
        
        if(b == 2)
        {
          bstring = "-";
        }
        if(b == 3)
        {
          bstring = "x";
        }
        if(b == 4)
        {
          bstring = "/";
        }
        if(c == 1)
        {
          cstring = "+";
        }
        
        if(c == 2)
        {
          cstring = "-";
        }
        if(c == 3)
        {
          cstring = "x";
        }
        if(c == 4)
        {
          cstring = "/";
        }
      System.out.println (numbers[x][0] + " " + astring + " " + " ( " + numbers[x][1] + " " + bstring + " "+ numbers[x][2] +" "+ " ) "  + cstring + " "+ numbers[x][3]);
    }
    }
    if(c == 2)
    {
      fin = resulta - numbers[x][3];
      if(fin == 24)
    {
        if(a == 1)
        {
          astring = "+";
        }
        
        if(a == 2)
        {
          astring = "-";
        }
        if(a == 3)
        {
          astring = "x";
        }
        if(a == 4)
        {
          astring = "/";
        }
        if(b == 1)
        {
          bstring = "+";
        }
        
        if(b == 2)
        {
          bstring = "-";
        }
        if(b == 3)
        {
          bstring = "x";
        }
        if(b == 4)
        {
          bstring = "/";
        }
        if(c == 1)
        {
          cstring = "+";
        }
        
        if(c == 2)
        {
          cstring = "-";
        }
        if(c == 3)
        {
          cstring = "x";
        }
        if(c == 4)
        {
          cstring = "/";
        }
      System.out.println (numbers[x][0] + " " + astring + " " + " ( " + numbers[x][1] + " " + bstring + " "+ numbers[x][2] +" "+ " ) "  + cstring + " "+ numbers[x][3]);
    }
    }
    if(c == 3)
    {
      fin = resulta * numbers[x][3];
      if(fin == 24)
    {
        if(a == 1)
        {
          astring = "+";
        }
        
        if(a == 2)
        {
          astring = "-";
        }
        if(a == 3)
        {
          astring = "x";
        }
        if(a == 4)
        {
          astring = "/";
        }
        if(b == 1)
        {
          bstring = "+";
        }
        
        if(b == 2)
        {
          bstring = "-";
        }
        if(b == 3)
        {
          bstring = "x";
        }
        if(b == 4)
        {
          bstring = "/";
        }
        if(c == 1)
        {
          cstring = "+";
        }
        
        if(c == 2)
        {
          cstring = "-";
        }
        if(c == 3)
        {
          cstring = "x";
        }
        if(c == 4)
        {
          cstring = "/";
        }
      System.out.println (numbers[x][0] + " " + astring + " " + " ( " + numbers[x][1] + " " + bstring + " "+ numbers[x][2] +" "+ " ) "  + cstring + " "+ numbers[x][3]);
    }
    }
    if(c == 4)
    {
      fin = resulta / numbers[x][3];
      if(fin == 24)
    {
        if(a == 1)
        {
          astring = "+";
        }
        
        if(a == 2)
        {
          astring = "-";
        }
        if(a == 3)
        {
          astring = "x";
        }
        if(a == 4)
        {
          astring = "/";
        }
        if(b == 1)
        {
          bstring = "+";
        }
        
        if(b == 2)
        {
          bstring = "-";
        }
        if(b == 3)
        {
          bstring = "x";
        }
        if(b == 4)
        {
          bstring = "/";
        }
        if(c == 1)
        {
          cstring = "+";
        }
        
        if(c == 2)
        {
          cstring = "-";
        }
        if(c == 3)
        {
          cstring = "x";
        }
        if(c == 4)
        {
          cstring = "/";
        }
      System.out.println (numbers[x][0] + " " + astring + " " + " ( " + numbers[x][1] + " " + bstring + " "+ numbers[x][2] +" "+ " ) "  + cstring + " "+ numbers[x][3]);
    }
    }
   
            
          }
        }
      }
      
      //==== two-two (_ _) (_ _)
      for(int a = 1; a <= 4; a++)
      {
        for(int b = 1; b <= 4; b++)
        {
          for(int c = 1; c <= 4; c++)
          {
            
            
            float resulta = 0; //result of first two
            float resultb = 0; //result of second two
    if(a == 1)
    {
      resulta = numbers[x][0] + numbers[x][1];
    }
    if(a == 2)
    {
      resulta = numbers[x][0] - numbers[x][1];
    }
    if(a == 3)
    {
      resulta = numbers[x][0] * numbers[x][1];
    }
    if(a == 4)
    {
      resulta = numbers[x][0] / numbers[x][1];
    }
    if(c == 1)
    {
      resultb = numbers[x][2] + numbers[x][3];
    }
    if(c == 2)
    {
      resultb = numbers[x][2] - numbers[x][3];
    }
    if(c == 3)
    {
      resultb = numbers[x][2] * numbers[x][3];
    }
    if(c == 4)
    {
      resultb = numbers[x][2] / numbers[x][3];
    }
    if(b == 1)
    {
      fin = resulta + resultb;
      if(fin == 24)
    {
        if(a == 1)
        {
          astring = "+";
        }
        
        if(a == 2)
        {
          astring = "-";
        }
        if(a == 3)
        {
          astring = "x";
        }
        if(a == 4)
        {
          astring = "/";
        }
        if(b == 1)
        {
          bstring = "+";
        }
        
        if(b == 2)
        {
          bstring = "-";
        }
        if(b == 3)
        {
          bstring = "x";
        }
        if(b == 4)
        {
          bstring = "/";
        }
        if(c == 1)
        {
          cstring = "+";
        }
        
        if(c == 2)
        {
          cstring = "-";
        }
        if(c == 3)
        {
          cstring = "x";
        }
        if(c == 4)
        {
          cstring = "/";
        }
      System.out.println (" ( " + numbers[x][0] + " " + astring + " "  + numbers[x][1] + " ) "  + bstring + " ( "+ numbers[x][2] +" "  + cstring + " "+ numbers[x][3] + " ) ");
    }
    }
    if(b == 2)
    {
      fin = resulta - resultb;
      if(fin == 24)
    {
        
        if(a == 1)
        {
          astring = "+";
        }
        
        if(a == 2)
        {
          astring = "-";
        }
        if(a == 3)
        {
          astring = "x";
        }
        if(a == 4)
        {
          astring = "/";
        }
        if(b == 1)
        {
          bstring = "+";
        }
        
        if(b == 2)
        {
          bstring = "-";
        }
        if(b == 3)
        {
          bstring = "x";
        }
        if(b == 4)
        {
          bstring = "/";
        }
        if(c == 1)
        {
          cstring = "+";
        }
        
        if(c == 2)
        {
          cstring = "-";
        }
        if(c == 3)
        {
          cstring = "x";
        }
        if(c == 4)
        {
          cstring = "/";
        }
      System.out.println (" ( " + numbers[x][0] + " " + astring + " "  + numbers[x][1] + " ) "  + bstring + " ( "+ numbers[x][2] +" "  + cstring + " "+ numbers[x][3] + " ) ");
    }
    }
    if(b == 3)
    {
      fin = resulta * resultb;
      if(fin == 24)
    {
        if(a == 1)
        {
          astring = "+";
        }
        
        if(a == 2)
        {
          astring = "-";
        }
        if(a == 3)
        {
          astring = "x";
        }
        if(a == 4)
        {
          astring = "/";
        }
        if(b == 1)
        {
          bstring = "+";
        }
        
        if(b == 2)
        {
          bstring = "-";
        }
        if(b == 3)
        {
          bstring = "x";
        }
        if(b == 4)
        {
          bstring = "/";
        }
        if(c == 1)
        {
          cstring = "+";
        }
        
        if(c == 2)
        {
          cstring = "-";
        }
        if(c == 3)
        {
          cstring = "x";
        }
        if(c == 4)
        {
          cstring = "/";
        }
      System.out.println (" ( " + numbers[x][0] + " " + astring + " "  + numbers[x][1] + " ) "  + bstring + " ( "+ numbers[x][2] +" "  + cstring + " "+ numbers[x][3] + " ) ");
    }
    }
    if(b == 4)
    {
      fin = resulta / resultb;
      if(fin == 24)
    {
        if(a == 1)
        {
          astring = "+";
        }
        
        if(a == 2)
        {
          astring = "-";
        }
        if(a == 3)
        {
          astring = "x";
        }
        if(a == 4)
        {
          astring = "/";
        }
        if(b == 1)
        {
          bstring = "+";
        }
        
        if(b == 2)
        {
          bstring = "-";
        }
        if(b == 3)
        {
          bstring = "x";
        }
        if(b == 4)
        {
          bstring = "/";
        }
        if(c == 1)
        {
          cstring = "+";
        }
        
        if(c == 2)
        {
          cstring = "-";
        }
        if(c == 3)
        {
          cstring = "x";
        }
        if(c == 4)
        {
          cstring = "/";
        }
      System.out.println (" ( " + numbers[x][0] + " " + astring + " "  + numbers[x][1] + " ) "  + bstring + " ( "+ numbers[x][2] +" "  + cstring + " "+ numbers[x][3] + " ) ");
    }
    }
            
          }
        }
      }
      
      
      //onethreea  _(_ _ _)
      for(int a = 1; a <= 4; a++)
      {
        for(int b = 1; b <= 4; b++)
        {
          for(int c = 1; c <= 4; c++)
          {
            float resulta = 0; //result of first two in bracket
    float resultb = 0; //result of second two in bracket
    if(b == 1)
    {
      resulta = numbers[x][1] + numbers[x][2];
    }
    if(b == 2)
    {
      resulta = numbers[x][1] - numbers[x][2];
    }
    if(b == 3)
    {
      resulta = numbers[x][1] * numbers[x][2];
    }
    if(b == 4)
    {
      resulta = numbers[x][1] / numbers[x][2];
    }
    if(c == 1)
    {
      resultb = resulta + numbers[x][3];
    }
    if(c == 2)
    {
      resultb = resulta - numbers[x][3];
    }
    if(c == 3)
    {
      resultb = resulta * numbers[x][3];
    }
    if(c == 4)
    {
      resultb = resulta / numbers[x][3];
    }
    if(a == 1)
    {
      fin = numbers[x][0] + resultb;
      if(fin == 24)
    {
        if(a == 1)
        {
          astring = "+";
        }
        
        if(a == 2)
        {
          astring = "-";
        }
        if(a == 3)
        {
          astring = "x";
        }
        if(a == 4)
        {
          astring = "/";
        }
        if(b == 1)
        {
          bstring = "+";
        }
        
        if(b == 2)
        {
          bstring = "-";
        }
        if(b == 3)
        {
          bstring = "x";
        }
        if(b == 4)
        {
          bstring = "/";
        }
        if(c == 1)
        {
          cstring = "+";
        }
        
        if(c == 2)
        {
          cstring = "-";
        }
        if(c == 3)
        {
          cstring = "x";
        }
        if(c == 4)
        {
          cstring = "/";
        }
      System.out.println ( numbers[x][0] + " " + astring + " ( "  + numbers[x][1] + " "  + bstring + " "+ numbers[x][2] +" "  + cstring + " "+ numbers[x][3] + " ) ");
    }
    }
    if(a == 2)
    {
      fin = numbers[x][0] - resultb;
      if(fin == 24)
    {
        if(a == 1)
        {
          astring = "+";
        }
        
        if(a == 2)
        {
          astring = "-";
        }
        if(a == 3)
        {
          astring = "x";
        }
        if(a == 4)
        {
          astring = "/";
        }
        if(b == 1)
        {
          bstring = "+";
        }
        
        if(b == 2)
        {
          bstring = "-";
        }
        if(b == 3)
        {
          bstring = "x";
        }
        if(b == 4)
        {
          bstring = "/";
        }
        if(c == 1)
        {
          cstring = "+";
        }
        
        if(c == 2)
        {
          cstring = "-";
        }
        if(c == 3)
        {
          cstring = "x";
        }
        if(c == 4)
        {
          cstring = "/";
        }
      System.out.println ( numbers[x][0] + " " + astring + " ( "  + numbers[x][1] + " "  + bstring + " "+ numbers[x][2] +" "  + cstring + " "+ numbers[x][3] + " ) ");
    }
    }
    if(a == 3)
    {
      fin = numbers[x][0] * resultb;
      if(fin == 24)
    {
        if(a == 1)
        {
          astring = "+";
        }
        
        if(a == 2)
        {
          astring = "-";
        }
        if(a == 3)
        {
          astring = "x";
        }
        if(a == 4)
        {
          astring = "/";
        }
        if(b == 1)
        {
          bstring = "+";
        }
        
        if(b == 2)
        {
          bstring = "-";
        }
        if(b == 3)
        {
          bstring = "x";
        }
        if(b == 4)
        {
          bstring = "/";
        }
        if(c == 1)
        {
          cstring = "+";
        }
        
        if(c == 2)
        {
          cstring = "-";
        }
        if(c == 3)
        {
          cstring = "x";
        }
        if(c == 4)
        {
          cstring = "/";
        }
      System.out.println ( numbers[x][0] + " " + astring + " ( "  + numbers[x][1] + " "  + bstring + " "+ numbers[x][2] +" "  + cstring + " "+ numbers[x][3] + " ) ");
    }
    }
    if(a == 4)
    {
      fin = numbers[x][0] / resultb;
      if(fin == 24)
    {
        if(a == 1)
        {
          astring = "+";
        }
        
        if(a == 2)
        {
          astring = "-";
        }
        if(a == 3)
        {
          astring = "x";
        }
        if(a == 4)
        {
          astring = "/";
        }
        if(b == 1)
        {
          bstring = "+";
        }
        
        if(b == 2)
        {
          bstring = "-";
        }
        if(b == 3)
        {
          bstring = "x";
        }
        if(b == 4)
        {
          bstring = "/";
        }
        if(c == 1)
        {
          cstring = "+";
        }
        
        if(c == 2)
        {
          cstring = "-";
        }
        if(c == 3)
        {
          cstring = "x";
        }
        if(c == 4)
        {
          cstring = "/";
        }
      System.out.println ( numbers[x][0] + " " + astring + " ( "  + numbers[x][1] + " "  + bstring + " "+ numbers[x][2] +" "  + cstring + " "+ numbers[x][3] + " ) ");
    }
    }
            
            
          }
        }
      }
      
      //onethreeb   _(_(_ _))
      
      for(int a = 1; a <= 4; a++)
      {
        for(int b = 1; b <= 4; b++)
        {
          for(int c = 1; c <= 4; c++)
          {
            float resulta = 0; //result of second two in big bracket
            float resultb = 0; //result of first and bracket in bracket
    if(c == 1)
    {
      resulta = numbers[x][2] + numbers[x][3];
    }
    if(c == 2)
    {
      resulta = numbers[x][2] - numbers[x][3];
    }
    if(c == 3)
    {
      resulta = numbers[x][2] * numbers[x][3];
    }
    if(c == 4)
    {
      resulta = numbers[x][2] / numbers[x][3];
    }
    if(b == 1)
    {
      resultb = numbers[x][1] + resulta;
    }
    if(b == 2)
    {
      resultb = numbers[x][1] - resulta;
    }
    if(b == 3)
    {
      resultb = numbers[x][1] * resulta;
    }
    if(b == 4)
    {
      resultb = numbers[x][1] / resulta;
    }
    if(a == 1)
    {
      fin = numbers[x][0] + resultb;
      if(fin == 24)
    {
        if(a == 1)
        {
          astring = "+";
        }
        
        if(a == 2)
        {
          astring = "-";
        }
        if(a == 3)
        {
          astring = "x";
        }
        if(a == 4)
        {
          astring = "/";
        }
        if(b == 1)
        {
          bstring = "+";
        }
        
        if(b == 2)
        {
          bstring = "-";
        }
        if(b == 3)
        {
          bstring = "x";
        }
        if(b == 4)
        {
          bstring = "/";
        }
        if(c == 1)
        {
          cstring = "+";
        }
        
        if(c == 2)
        {
          cstring = "-";
        }
        if(c == 3)
        {
          cstring = "x";
        }
        if(c == 4)
        {
          cstring = "/";
        }
      System.out.println ( numbers[x][0] + " " + astring + " ( "  + numbers[x][1] + " "  + bstring + " ( "+ numbers[x][2] +" "  + cstring + " "+ numbers[x][3] + " )) ");
    }
    }
    if(a == 2)
    {
      fin = numbers[x][0] - resultb;
      if(fin == 24)
    {
        if(a == 1)
        {
          astring = "+";
        }
        
        if(a == 2)
        {
          astring = "-";
        }
        if(a == 3)
        {
          astring = "x";
        }
        if(a == 4)
        {
          astring = "/";
        }
        if(b == 1)
        {
          bstring = "+";
        }
        
        if(b == 2)
        {
          bstring = "-";
        }
        if(b == 3)
        {
          bstring = "x";
        }
        if(b == 4)
        {
          bstring = "/";
        }
        if(c == 1)
        {
          cstring = "+";
        }
        
        if(c == 2)
        {
          cstring = "-";
        }
        if(c == 3)
        {
          cstring = "x";
        }
        if(c == 4)
        {
          cstring = "/";
        }
      System.out.println ( numbers[x][0] + " " + astring + " ( "  + numbers[x][1] + " "  + bstring + " ( "+ numbers[x][2] +" "  + cstring + " "+ numbers[x][3] + " )) ");
    }
    }
    if(a == 3)
    {
      fin = numbers[x][0] * resultb;
      if(fin == 24)
    {
        if(a == 1)
        {
          astring = "+";
        }
        
        if(a == 2)
        {
          astring = "-";
        }
        if(a == 3)
        {
          astring = "x";
        }
        if(a == 4)
        {
          astring = "/";
        }
        if(b == 1)
        {
          bstring = "+";
        }
        
        if(b == 2)
        {
          bstring = "-";
        }
        if(b == 3)
        {
          bstring = "x";
        }
        if(b == 4)
        {
          bstring = "/";
        }
        if(c == 1)
        {
          cstring = "+";
        }
        
        if(c == 2)
        {
          cstring = "-";
        }
        if(c == 3)
        {
          cstring = "x";
        }
        if(c == 4)
        {
          cstring = "/";
        }
      System.out.println ( numbers[x][0] + " " + astring + " ( "  + numbers[x][1] + " "  + bstring + " ( "+ numbers[x][2] +" "  + cstring + " "+ numbers[x][3] + " )) ");
    }
    }
    if(a == 4)
    {
      fin = numbers[x][0] / resultb;
      if(fin == 24)
    {
        if(a == 1)
        {
          astring = "+";
        }
        
        if(a == 2)
        {
          astring = "-";
        }
        if(a == 3)
        {
          astring = "x";
        }
        if(a == 4)
        {
          astring = "/";
        }
        if(b == 1)
        {
          bstring = "+";
        }
        
        if(b == 2)
        {
          bstring = "-";
        }
        if(b == 3)
        {
          bstring = "x";
        }
        if(b == 4)
        {
          bstring = "/";
        }
        if(c == 1)
        {
          cstring = "+";
        }
        
        if(c == 2)
        {
          cstring = "-";
        }
        if(c == 3)
        {
          cstring = "x";
        }
        if(c == 4)
        {
          cstring = "/";
        }
      System.out.println ( numbers[x][0] + " " + astring + " ( "  + numbers[x][1] + " "  + bstring + " ( "+ numbers[x][2] +" "  + cstring + " "+ numbers[x][3] + " )) ");
    }
    }
            
          }
        }
      }  
  }
      System.out.println("Done? (type 'yes' to finish)");
      Scanner userInput5 = new Scanner(System.in);
      String last = userInput5.nextLine();
      if(last == "yes")
      {
        start = 2;
        System.out.println("dsfds");
      }
      
      
      
  }
  }
  
}
  