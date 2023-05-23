package oldFiles;

public class Fighter {
    public boolean isVulnerable(){
        return true;
    }
}

class Warrior extends Fighter{
    @Override
    public String toString(){
        return "oldFiles.Fighter is a oldFiles.Warrior";
    }
}

class Wizard extends Fighter{
}
