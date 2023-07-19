package encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel,boolean duplex){
     this.tonerLevel=(tonerLevel>=0 && tonerLevel<=100)?tonerLevel:-1;
     this.pagesPrinted=0;
     this.duplex=duplex;
    }
    public int addToner(int tonerAmount){
     this.tonerLevel+=tonerAmount;
     if(this.tonerLevel>100) this.tonerLevel=100;
     return this.tonerLevel;
    }
    public int printPages(int pages){
     if(this.duplex){
         int val=pages/2;
         this.pagesPrinted+=val;
         System.out.println("it's a duplex printer");
     }else{
         this.pagesPrinted+=pages;
     }
     return pages;
    }
}
