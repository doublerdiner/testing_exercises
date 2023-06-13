public class PasswordComplexity {
    public boolean isPasswordComplex(String password){
        if(password.length() < 6){
            return false;
        }
        boolean upper = false;
        boolean lower = false;
        boolean number = false;
        for(int i=0; i<password.length(); i++){
            char currentChar = password.charAt(i);
            if(Character.isUpperCase(currentChar)) upper = true;
            else if(Character.isLowerCase(currentChar)) lower = true;
            else if(Character.isDigit(currentChar)) number = true;
        }
        return upper && lower && number;
    }

    public static void main(String[] args) {
        PasswordComplexity password = new PasswordComplexity();
        System.out.println(password.isPasswordComplex("hello"));
        System.out.println(password.isPasswordComplex("hello123"));
        System.out.println(password.isPasswordComplex("Hello321"));
    }
}
