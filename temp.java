class Worker {   

    private String name;   
    private int workerId;   
    private double wage;   
    private boolean fullTime;

    Worker(String name, int workerId, double wage, boolean fullTime){     
        this.name = name;     
        this.workerId = workerId;     
        this.wage = wage;
        this.fullTime=fullTime;   
    }   
    
    public String getName(){     
        return this.name;   
    } 

    public void setWorkerId(int id){
         this.workerId = id;   
    }   
    
    public int getWorkerId(){     
        return this.workerId;   
    }   
    
    public double getWage(){     
        return this.wage;   
    }   
    
    public boolean getFullTime(){     
        return this.fullTime;   
    }   

    public void setName(String n){     
        this.name = n;   
    }   
    public void setWage(double w){     
        this.wage = w;   
    }   
    public void setFullTime(boolean f){     
        this.fullTime = f;   
    }    

    public void printDetails(){     
        String out="";     
        if(this.fullTime){       
            out=out+"The name of the worker is "+this.name + ". The worker id is "+this.workerId;       
            out=out+". The wage of the worker is $"+this.wage+" per hour. The employee is not full-time.";     
        }     
        else{       
            out=out+"The name of the worker is "+this.name + ". The worker id is "+this.workerId;       
            out=out+". The wage of the worker is $"+this.wage+" per hour. The employee is full-time.";     
        }     
        System.out.println(out);   
    } 
} 
public class temp{   
    public static void main(String[] args)   
    {         
        Worker w1 = new Worker("John Smith", 123456, 25.40, false);     
        w1.printDetails();      
        
        Worker w2 = new Worker("Aidra Rhodes", 654321, 2500, true);     
        w2.printDetails();    
    } 
} 
 