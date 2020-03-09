package DesignprinciplesInterpretorPattern.com.InterpretorPattern;

class TerminalExpression implements Expression  
{ 
    String data; 
  
    public TerminalExpression(String data) 
    { 
        this.data = data;  
    } 
  
    public boolean interpreter(String contain)  
    { 
        if(contain.contains(data)) 
        { 
            return true; 
        } 
        else
        { 
            return false;   
        } 
    } 
} 
