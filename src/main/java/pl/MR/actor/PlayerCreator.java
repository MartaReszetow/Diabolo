package pl.MR.actor;

import pl.MR.WeaponType;

import java.util.Scanner;

public class PlayerCreator {
    public static Player createPlayer(){

        System.out.println("Choose Your weapon: 1 - sword, 2 - mace, 3 - bare heands");

        Scanner sc = new Scanner(System.in);
        int choosedOption = sc.nextInt();

        WeaponType weaponType;
        if(choosedOption ==1){weaponType = WeaponType.SWORD;}
        else if (choosedOption==2){weaponType=WeaponType.MACE;}
        else{weaponType = WeaponType.UNARMED;}
        return new Player(weaponType);
    }
}
