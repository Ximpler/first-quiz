package org.velezreyes.quiz.question6;

public class DrinkImpl implements Drink{
    String name;
    Boolean isfizzy;
    
    public DrinkImpl(String name, Boolean isfizzy){
        this.name = name;
        this.isfizzy = isfizzy;
    }

    public static Drink getInstance( String name , Boolean isfizzy) {
        return new DrinkImpl(name,isfizzy);
    }

    @Override
    public boolean isFizzy() {
        return isfizzy;
    }

    @Override
    public String getName() {
        
        return name;
    }
}