import java.util.Scanner;

public class Player {

    private String pName;
    private String pClass;
    private int pGold;
    private int pInt; // add damage for Mage
    private int pVit; // add HP every level
    private int pDex; // add acc.
    private int pAgi; // add speed
    private int pArmor;
    private int pLvl;
    private int pExp;
    private int pNextExpLvl;
    private int pHealthPoints;
    private int pMaxHP;
    private int pManaPoints;
    private int pMaxMP;

    public static void CreatCharacter() {

        Scanner Characterinput = new Scanner(System.in);
        // Create a new player instance
        Player newPlayer = new Player();

        // Character creation
        System.out.println("Enter your character's name: ");
        String playerName = Characterinput.nextLine();
        newPlayer.SetName(playerName);

        System.out.println("Choose your class: ");
        System.out.println("1) Mage 2) Wizard 3) Sage");
        int classChoice = Characterinput.nextInt();

        switch (classChoice) {
            case 1:
                newPlayer.SetClass("Mage");
                newPlayer.SetInt(15);
                newPlayer.SetVit(10);
                newPlayer.SetDex(10);
                newPlayer.SetAgi(10);
                newPlayer.SetArmor(10);
                newPlayer.SetLevel(1);
                newPlayer.SetExp(0);
                newPlayer.SetNextExpLvl(1000);
                newPlayer.SetHP(100);
                newPlayer.SetMaxHP(100);
                newPlayer.SetMP(50);
                newPlayer.SetMaxMP(50);
                break;
            case 2:
                newPlayer.SetClass("Wizard");
                //STATS
                break;
            case 3:
                newPlayer.SetClass("Sage");
                //STATS
                break;
            default:

                break;
        }
        Characterinput.close();
    }

    public String GetName() {
        return pName;
    }
    public void SetName(String newName) {
        pName = newName;
    }


    public String GetClass() {
        return pClass;
    }
    public void SetClass(String newClass) {
        pClass = newClass;
    }


    public int GetGold() {
        return pGold;
    }
    public void SetGold(int addGold) {
        pGold += addGold;
    }


    public int GetInt() {
        return pInt;
    }
    public void SetInt(int addInt) {
        pInt += addInt;
    }


    public int GetVit() {
        return pVit;
    }
    public void SetVit(int addVit) {
        pVit += addVit;
    }


    public int GetDex() {
        return pDex;
    }
    public void SetDex(int addDex) {
        pDex += addDex;
    }


    public int GetAgi() {
        return pAgi;
    }
    public void SetAgi(int addAgi) {
        pAgi += addAgi;
    }


    public int GetArmor() {
        return pArmor;
    }
    public void SetArmor(int addArmor) {
        pArmor += addArmor;
    }
    public void EquipArmor(int EquipedArmor) {
        pArmor += EquipedArmor;
    }


    public void EquipWeapon(int EquipedWeapon) {
        pInt += EquipedWeapon;
    }


    public int GetLevel() {
        return pLvl;
    }
    public void SetLevel(int setLevel) {
        pLvl += setLevel;
    }
    public void LevelUp() {

        if (pExp >= pNextExpLvl) {

            pLvl++; // lvlup
            pNextExpLvl = pExp * pExp * 1000; //More Exp for next level
            pHealthPoints = pMaxHP; //Become Ful health if levelup
        }
        
    }


    public int GetExp() {
        return pExp;
    }
    public void SetExp(int exp) {
        pExp += exp;
    }

    public int GetNextExpLvl() {
        return pNextExpLvl;
    }
    public void SetNextExpLvl(int nextExpLvl) {
        pNextExpLvl += nextExpLvl;
    }


    public int GetHP() {
        return pHealthPoints;
    }
    public void SetHP(int addHP) {
        pHealthPoints += addHP;
    }

    public int GetMaxHP() {
        return pMaxHP;
    }
    public void SetMaxHP(int addMaxHP) {
        pMaxHP += addMaxHP;
    }
    


    public int GetMP() {
        return pManaPoints;
    }
    public void SetMP(int addMP) {
        pMaxMP += addMP;
    }

    public int GetMaxMP() {
        return pMaxMP;
    }
    public void SetMaxMP(int addMaxMP) {
        pMaxMP += addMaxMP;
    }
    

}

