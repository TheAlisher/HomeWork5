package com.company;

public class MagicDoor {

    public Hero[] Hero(){
        Hero[] heroes = new Hero[4];

        Hero Spartanec = new Hero(70, 20,"EyeLaser");
        heroes[0] = Spartanec;

        Hero Grek = new Hero(60, 30,"IronHand");
        heroes[1] = Grek;

        Hero Egi = new Hero(50,40,"Meteor");
        heroes[2] = Egi;

        Hero Yeti = new Hero(90,10,"PlanetHit");
        heroes[3] = Yeti;

        return heroes;
    }
}
