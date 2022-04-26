public class DrumkitTestDrive {
    public static void main(String[] args)
    {
        Drumkit d=new Drumkit();
        
        for(int i=0;i<=1;i++)
        {
             if (d.snare==true)
            {
                d.playSnare();
            }
            else
            {
                d.playTopHat();
            }

            d.snare=false;
        }
       
        
    }
}

class Drumkit 
{
    boolean topHat=true;
    boolean snare=true;

    void playSnare()
    {
        System.out.println("bang bang ba-bang");
    }

    void playTopHat()
    {
        System.out.println("ding ding da-ding");
    }
}