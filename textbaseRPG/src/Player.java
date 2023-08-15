public class Player {

    private String pName;
    private String pClass;
    private int pGold;
    private int pInt; // add damage for Mage
    private int pVit; // add HP every level
    private int pDex; // add acc.
    private int pAgi; // add speed
    private int pArmor;
    private String pWeapons;
    private int pLvl;
    private int pExp;
    private int pNextExplvl;
    private int pHealthPoints;
    private int pMaxHP;
    private int pManaPoints;
    private int pMaxMP;
    

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

    public int GetInt() {
        return pInt;
    }

    public int GetVit() {
        return pVit;
    }

    public int GetDex() {
        return pDex;
    }

    public int GetAgi() {
        return pAgi;
    }

    public int GetArmor() {
        return pArmor;
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

    public int GetExp() {
        return pExp;
    }

    public int GetMaxExp() {
        return pNextExplvl;
    }


}

