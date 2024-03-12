//Sub class of the Main
package Encapsulation; 

public class Gun {
    private String gunName;
    private String gunType;
    private String gunSkin;
    private int bullets;
    private int spareBullets;

    Gun(String gunName, String gunType, String gunSkin, int bullets, int spareBullets){
        this.setName(gunName);
        this.setType(gunType);
        this.setSkin(gunSkin);
        this.setBullets(bullets);
        this.setSpare(spareBullets);
    }
    //Getter Methods (Return Type Methods)
    public String getName(){
        return gunName;
    }
    public String getType(){
        return gunType;
    }
    public String getSkin(){
        return gunSkin;
    }
    public int getBullets(){
        return bullets;
    }
    public int getSpare(){
        return spareBullets;
    }

    //Setter Methods
    public void setName(String gunName){
        this.gunName = gunName;
    }
    public void setType(String gunType){
        this.gunType = gunType;
    }
    public void setSkin(String gunSkin){
        this.gunSkin = gunSkin;
    }
    public void setBullets(int bullets){
        this.bullets = bullets;
    }
    public void setSpare(int spareBullets){
        this.spareBullets  = spareBullets;
    }
}
