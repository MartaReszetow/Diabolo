package pl.MR;
public class App

        // Stwórz nowy projekt mavenowy z archetypu maven-quickstart
        //Stwórz interfejs AbleToAttack z metodą zwracającą int o nazwie attack().
        //NOWE ZAGADNIENIE: Stwórz enuma WeaponType zawierającego SWORD, MACE, UNARMED. Dodaj w nim pole damage oraz konstruktor.
        // Dodaj wedle uznania ilość obrażeń zadawanych przez dany typ broni, z czego SWORD niech będzie mocniejszy od MACE.
        // Dodaj getter wyciągający siłę broni.
        //Stwórz abstrakcyjną klasę Creature. Niech zawiera pola hp, alive, strength, weaponType;
        //Stwórz abstrakcyjną klasę Monster implementującą interfejs attack.
        //Stwórz dwie klasy goblin i ghul. W Konstruktorze przypisz goblinom mace jako weaponType a ghulom unarmed.
        // Wymyśl statystki hp i strength dla obu potworów. Zaimplementuj metodę attack aby zwracała wartość strength + weapon damage.
        //Stwórz klasę Player dziedziczącą po Creature. W konstruktorze niech przyjmuje WeaponType i ustawia wartość strength oraz
        // hp na określoną przez Ciebie wartość. Zaimplementuj metodę attack aby zwracała wartość strength + weapon damage + 1
        // i w przypadku broni typu MACE leczyła graczowi kilka punktów hp.
        //W metodzie main stwórz menu konsolowe pozwalające graczowi wybrać rodzaj broni. Niech na tej podstawie zostanie stworzony Player.
        //Stwórz klasę MonsterCreationUtil. Stwórz w niej metodę tworzącą listę losowych potworów o losowej długości od 1 do 4.
        // W tym świecie ghule nie zżerają goblinów jakby co.
        //Stwórz w metodzie main listę potworów używając metody z powyższej klasy.
        // Następnie stwórz pętlę while sprawdzającą czy ilość hp gracza jest większa od zera.
        // Dopóki tak będzie niech gracz atakuje pierwszego potwora na liście. atak powinien potworowi odjąć
        // hp i w przypadku spadnięcia do 0 lub poniżej ustawić pole alive na false. Następnie niech każdy żywy potwór atakuje gracza.
        // Przy każdym ataku dodaj komunikat do konsoli opisujący co się dzieje.
        //Jeżeli gracz umarł to gra zostaje przerwana i zostaje wyświetlony komunikat o przegranej.
        //Jeżeli wszystkie potwory umarły to gracz wygrał.
        //Zapewne nie jesteś zadowolony/a z wyników. Popraw statystyki bazowe WeaponType oraz każdego Creature.
        //Dodaj element losowości - niech metoda attack w przypadku potworów zwraca wartość tego co obecnie razy 0.5 do 1.
        //Sprawdź rezultaty i ewentualnie dopasuj ponownie statystyki.
{
    public static void main( String[] args ){



    }

}
