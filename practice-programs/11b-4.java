package live;
import music.*;
import music.string.*;
import music.wind.*;
public class Test
{
	public static void main(String args[])
	{
		Veena v = new Veena();
		Saxophone s = new Saxophone();
		v.play();
		s.play();
		Playable p = new Veena();
		Playable p1 = new Saxophone();
		p.play();
		p1.play();
	}
}
