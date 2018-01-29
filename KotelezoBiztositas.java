package gyakorlas;


public class KotelezoBiztositas implements Comparable<KotelezoBiztositas>
{
    private int bonusFokozat;
    private int tulajdonosKora;
    private int gepjarmuTeljesitmeny;
    private static int alapDij = 300000;

    public int getBonusFokozat() 
	{
        return bonusFokozat;
    }

    public void setBonusFokozat(int bonusFokozat) 
	{
        this.bonusFokozat = bonusFokozat;
    }

    public int getTulajdonosKora() 
	{
        return tulajdonosKora;
    }

    public void setTulajdonosKora(int tulajdonosKora) 
	{
        this.tulajdonosKora = tulajdonosKora;
    }

    public int getGepjarmuTeljesitmeny() 
	{
        return gepjarmuTeljesitmeny;
    }

    public void setGepjarmuTeljesitmeny(int gepjarmuTeljesitmeny) 
	{
        this.gepjarmuTeljesitmeny = gepjarmuTeljesitmeny;
    }

    public static int getAlapDij() 
	{
        return alapDij;
    }

    public static void setAlapDij(int alapDij) 
	{
        KotelezoBiztositas.alapDij = alapDij;
    }

    public KotelezoBiztositas(int bonusFokozat, int tulajdonosKora, int gepjarmuTeljesitmeny) 
	{
        this.bonusFokozat = bonusFokozat;
        this.tulajdonosKora = tulajdonosKora;
        this.gepjarmuTeljesitmeny = gepjarmuTeljesitmeny;
    }
    
    public double getEvesDij()
	{
        double bf = this.bonusFokozat;
        double gt =this.gepjarmuTeljesitmeny;
        double tk = this.tulajdonosKora;
        return (((KotelezoBiztositas.alapDij*(1/bf))*gt)/tk);
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
        final KotelezoBiztositas other = (KotelezoBiztositas) obj;
        if (this.bonusFokozat != other.bonusFokozat) 
		{
            return false;
        }
        if (this.tulajdonosKora != other.tulajdonosKora) 
		{
            return false;
        }
        if (this.gepjarmuTeljesitmeny != other.gepjarmuTeljesitmeny) 
		{
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
	{
        return "KotelezoBiztositas{" + "bonusFokozat=" + this.bonusFokozat + ", tulajdonosKora=" + this.tulajdonosKora + ", gepjarmuTeljesitmeny=" + this.gepjarmuTeljesitmeny + ", évesdíj:"+ this.getEvesDij() + '}';
    }

    @Override
    public int compareTo(KotelezoBiztositas o) 
	{
        if(this.getEvesDij()==o.getEvesDij())
		{
            return 0;
        }
		else if(this.getEvesDij()<o.getEvesDij())
		{
            return -1;
        }
		else
		{
            return 1;
        }
    }
       
}
