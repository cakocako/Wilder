class Wilder {

//les attributs
    private String firstname;
    private boolean aware;

//le constructeur
    public Wilder(String firstname, boolean aware){
        this.firstname = firstname;
        this.aware = aware;
    }

//les getters accesseurs
 
    
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isAware() {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }


// ajouter une methode

    public boolean whoAmI() { 
        if (this.aware == true){
             System.out.println("Je m'appelle" + " " + this.getFirstname() + " " + "et je suis aware");
             return true;
        }
        else {
            System.out.println("Je m'appelle" + " " + this.getFirstname() + " " + "et je ne suis pas aware");
             return false;
       
         }
    }
}

//creer une classe Classroom MAIN 

