package misc.classes;
//layout of cookie
class Cookie {
    private String color;

    //constructor
    public Cookie(String color){      
        this.color=color;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }
}

public class Main {
    public static void main(String[] args){


        //green cookie and blue cookie 2 instances of class Cookie
        Cookie cookieone=new Cookie("green");
        Cookie cookietwo=new Cookie("blue");
        cookieone.setColor("yellow"); //imstead of green it willl be yellow

        System.out.println(cookieone.getColor());
        System.out.println(cookietwo.getColor());
        
        
    }
    
}