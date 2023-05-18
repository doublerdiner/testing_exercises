public class CardGame {

    public static int parseCard(String card){
        int cardValue = 0;
        switch (card){
            case "two": cardValue = 2;
            break;
            case "three": cardValue = 3;
            break;
            case "four": cardValue = 4;
            break;
            case "five": cardValue = 5;
            break;
            case "six": cardValue = 6;
            break;
            case "seven": cardValue = 7;
            break;
            case "eight": cardValue = 8;
            break;
            case "nine": cardValue = 9;
            break;
            case "ten", "jack", "queen", "king": cardValue = 10;
            break;
            case "ace": cardValue = 11;
            break;
        }
        return cardValue;
    }
    public static void main(String[] args) {
        System.out.println(parseCard("five"));

    }
}
