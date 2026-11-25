package geometry;

public interface Moveable {

//	konstante se kucaju sve velikim slovima
//	u interfejsima se ne moze deklarisati public, private 
//	mora biti public static final
//	umesto extends, kod interfejsa je implements
//	moze se implementirati vise interfejsa za jednu klasu
//	interfejsi predstavljaju neku ulogu
//	interfejsi mogu da imaju samo apstraktne metode

	public static final boolean VALID = true;

//	s obzirom da se ocekuje da su metode javne i apstraktne, 
//	public i abstract kljucne reci se mogu izostaviti

	void moveTo(int x, int y);

	void moveBy(int byX, int byY);

}
