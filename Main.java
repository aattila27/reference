package gyakorlas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        ArrayList<KotelezoBiztositas> lista = new ArrayList<>();
        while(true)
		{
            String[] tmp = sc.nextLine().split(" ");
            if(!tmp[0].equals("end"))
			{
                KotelezoBiztositas hozzaadando = new KotelezoBiztositas(Integer.parseInt(tmp[0]),Integer.parseInt(tmp[1]),Integer.parseInt(tmp[2]));
                lista.add(hozzaadando);
            }
			else
			{
                break;
            }
        }
        
        Collections.sort(lista);
        System.out.println(lista);
        
        Collections.sort(lista, new CsokkenoRendezo());
        System.out.println(lista);
        
        
        
        ArrayList<SzemelyAutoKGFB> autok = new ArrayList<>();
        while(true)
		{
            String[] tmp = sc.nextLine().split(" ");
            if(!tmp[0].equals("end"))
			{
                SzemelyAutoKGFB hozzaadando = new SzemelyAutoKGFB(tmp[0],Integer.parseInt(tmp[1]),Integer.parseInt(tmp[2]),Integer.parseInt(tmp[3]));
                if(!autok.contains(hozzaadando))
				{
                    autok.add(hozzaadando);
                }
            }
			else
			{
                break;
            }
        }
        
        Collections.sort(autok, new CsokkenoRendezo());
        System.out.println(autok);
    }
    
}
