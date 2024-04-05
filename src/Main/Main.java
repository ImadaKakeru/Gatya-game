package Main;
import  Level1.*;
import  Level2.*;


public class Main {
    public static void main(String[] args) {

        Isoda isoda = new Isoda();
        Panaisonic panaIso = new Panaisonic();

        System.out.println(isoda.getName());
        System.out.println(isoda.getType());
        System.out.println(isoda.getStrongness());

        panaIso.explain();
    }
}