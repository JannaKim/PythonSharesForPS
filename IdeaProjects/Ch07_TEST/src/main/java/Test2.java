class SutdaDeck2
{
    final int CARD_NUM = 20;
    sutdaCard2[] cards = new sutdaCard2[CARD_NUM];

    SutdaDeck2()
    {
        for (int i = 0; i < cards.length; i++)
        {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);

            cards[i] = new sutdaCard2(num, isKwang);
        }

    }
    public void shuffle()
    {

    }
}
class sutdaCard2
{
    int num;
    boolean isKwang;

    sutdaCard2()
    {
       this(1, true);
    }

    sutdaCard2(int num, boolean isKwang)
    {
       this.num = num;
       this.isKwang = isKwang;
    }

    public String toString()
    {
       return num + (isKwang ? "K" : "");
    }

}
public class Test2
{
    public static void main(String[] args)
    {
        SutdaDeck2 deck = new SutdaDeck2();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i = 0; i < deck.cards.length; i++)
        {
            System.out.print(deck.cards[i] + ",");
        }
        System.out.println();
        System.out.println(deck.pick(0));
    }

}
