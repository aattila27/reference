package gyakorlas;

import java.util.Comparator;

public class CsokkenoRendezo implements Comparator<KotelezoBiztositas>
{

    @Override
    public int compare(KotelezoBiztositas o1, KotelezoBiztositas o2) 
	{
        if(o1.getEvesDij()==o2.getEvesDij())
		{
            return 0;
        }
		else if(o1.getEvesDij()>o2.getEvesDij())
		{
            return -1;
        }
		else
		{
            return 1;
        }
    }    
}
