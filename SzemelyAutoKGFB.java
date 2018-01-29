package gyakorlas;

import java.util.Objects;

public class SzemelyAutoKGFB extends KotelezoBiztositas
{
    private String rendszam;

    public SzemelyAutoKGFB(String rendszam, int bonusFokozat, int tulajdonosKora, int gepjarmuTeljesitmeny) 
	{
        super(bonusFokozat, tulajdonosKora, gepjarmuTeljesitmeny);
        this.rendszam = rendszam;
    }

    @Override
    public int hashCode() 
	{
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
	{
        if (this == obj) 
		{
            return true;
        }
        if (obj == null) 
		{
            return false;
        }
        if (getClass() != obj.getClass()) 
		{
            return false;
        }
        final SzemelyAutoKGFB other = (SzemelyAutoKGFB) obj;
        if (!Objects.equals(this.rendszam, other.rendszam)) 
		{
            return false;
        }
        return true;
    }
}
