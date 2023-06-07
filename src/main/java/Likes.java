import java.util.List;

public class Likes {
    public String whoLikesIt(String... names){
        if(names.length == 0){
            return "no one likes this";
        }
        else if(names.length == 1){
            return String.format("%1$s likes this", names[0]);
        }
        else if(names.length == 2){
            return String.format("%1$s and %2$s like this", names[0], names[1]);
        }
        else if(names.length == 3){
            return String.format("%1$s, %2$s and %3$s like this", names[0], names[1], names[2]);
        }
        else{
            int extraLikes = names.length - 2;
            return String.format("%1$s, %2$s and %3$s others like this", names[0], names[1], extraLikes);
        }
    }

    public static void main(String[] args) {
        Likes likes = new Likes();
        System.out.println(likes.whoLikesIt("Chris", "Mike", "Mark", "Tony"));
    }

}
