package hoang.vincent.ClassicRogueSim.models.equipment;

public class Item {
    // ID
    private int itemID;
    private String itemName;

    // Primary Stats
    private int strength;
    private int agility;
    private int stamina;
    private int intellect;
    private int spirit;

    // Secondary Stats
    private int attackPower;
    private int crit;
    private int hit;

    // Weapon Stats
    private int damageLow;
    private int damageHigh;
    private double weaponSpeed;

    // Misc
    private WeaponTypes weaponType;
    private int weaponSkill;

    public Item() {
        this.itemID = -1;
        this.itemName = "";
        this.strength = -1;
        this.agility = -1;
        this.stamina = -1;
        this.intellect = -1;
        this.spirit = -1;

        this.attackPower = -1;
        this.crit = -1;
        this.hit = -1;

        this.damageLow = -1;
        this.damageHigh = -1;
        this.weaponSpeed = -1.0;

        this.weaponType = WeaponTypes.DAGGER;
        this.weaponSkill = -1;
    }

    public int getItemID() {
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getStamina() {
        return stamina;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getSpirit() {
        return spirit;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getCrit() {
        return crit;
    }

    public int getHit() {
        return hit;
    }

    public int getDamageHigh() {
        return damageHigh;
    }

    public int getDamageLow() {
        return damageLow;
    }

    public double getWeaponSpeed() {
        return weaponSpeed;
    }

    public WeaponTypes getWeaponType() {
        return weaponType;
    }

    public int getWeaponSkill() {
        return weaponSkill;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public void setSpirit(int spirit) {
        this.spirit = spirit;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void setCrit(int crit) {
        this.crit = crit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public void setDamageLow(int damageLow) {
        this.damageLow = damageLow;
    }

    public void setDamageHigh(int damageHigh) {
        this.damageHigh = damageHigh;
    }

    public void setWeaponSpeed(double weaponSpeed) {
        this.weaponSpeed = weaponSpeed;
    }

    public void setWeaponType(WeaponTypes weaponType) {
        this.weaponType = weaponType;
    }

    public void setWeaponSkill(int weaponSkill) {
        this.weaponSkill = weaponSkill;
    }
}
